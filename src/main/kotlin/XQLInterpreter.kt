import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

class XQLInterpreter(val args: List<String>) : XQLVisitor {
    // Used to track variable values
    private val variables = mutableMapOf<String, Any>()

    // Used for return values between methods
    private var tmp: Any? = null

    override fun visitXql(node: XQL) {
        node.instructions.forEach { it.accept(this) }
    }

    override fun visitInit(node: Init) {
        // Ler o argumento node.argument
        // Ler o ficheiro do argumento
        // Copiar conteudo do ficheiro passando pelo parser de XMLFile para o variables[node.doc]
        if (node.argument > this.args.size || node.argument <= 0) {
            throw IllegalStateException("Invalid argument ${node.argument}")
        }

        //val lexer = XMLLexer(CharStreams.fromFileName("uc.xml"))
        val lexer = XMLLexer(CharStreams.fromFileName(this.args[node.argument - 1]))
        val parser = XMLParser(CommonTokenStream(lexer))

        val file = parser.xmlfile() ?: throw IllegalStateException("Illegal XML format")

        file.toAst().accept(this)

        variables[node.doc] = tmp!!

        tmp = null
    }

    override fun visitSave(node: Save) {
        // Ler argumento node.argument
        // Abrir ficheiro do argumento
        // Escrever conteudo do node.doc no ficheiro
        if (node.argument > this.args.size || node.argument <= 0) {
            throw IllegalStateException("Invalid argument ${node.argument}")
        }

        val document = variables[node.doc]

        if (document !is Line) {
            throw IllegalStateException("Document is not a XML output")
        }

        document.accept(XMLPrinter(File(this.args[node.argument - 1])))
    }

    override fun visitAssign(node: Assign) {
        // Visitar o lado direito do assignment
        // Guardar o valor na variável

        node.function.accept(this)

        variables[node.variable] = tmp!!

        tmp = null
    }

    override fun visitDotX(node: DotX) {
        tmp = when (variables[node.left]) {
            is Line -> {
                val line = variables[node.left] as Line
                val attribute = line.getAttribute(node.right)

                attribute ?: line.getBodyTags(node.right)
            }

            else -> throw IllegalStateException("Argument doesn't support accessing parameter")
        }
    }


    override fun visitDotXArray(node: DotXArray) {
        val tags = when (variables[node.dotX.left]) {
            is Line -> (variables[node.dotX.left]!! as Line).getBodyTags(node.dotX.right)
            else -> throw IllegalStateException("Argument doesn't support accessing parameter")
        }

        if (tags.isEmpty()) {
            throw IllegalStateException("Empty tag body")
        } else if (node.index >= tags.size) {
            throw IllegalStateException("Index Out of Bounds")
        }

        tmp = tags[node.index]
    }

    override fun visitDotXArrayElement(node: DotXArrayElement) {
        node.dotXArray.accept(this)
        val elementValue = (tmp as Line).getBodyTags(node.element)
        if (elementValue.size != 1) {
            throw IllegalArgumentException("dsadasda")
        }

        val element = elementValue[0]

        try {
            tmp = element.getTagValue()
        } catch (e: UnsupportedOperationException) {
            tmp = element.getBodyTags()
        }
    }

    override fun visitDotXSize(node: DotXSize) {
        val tags = when (variables[node.dotX.left]) {
            is Line -> (variables[node.dotX.left]!! as Line).getBodyTags(node.dotX.right)
            else -> throw IllegalStateException("Argument doesn't support accessing parameter")
        }
        tmp = tags.size
    }

    override fun visitDotXMap(node: DotXMap) {
        val tags = when (variables[node.dotX.left]) {
            is Line -> (variables[node.dotX.left]!! as Line).getBodyTags(node.dotX.right)
            else -> throw IllegalStateException("Argument doesn't support accessing parameter")
        }

        tmp = tags.map { it.getAttribute(node.map) ?: throw IllegalStateException("Argument doesn't exist") }.toList()
    }

    override fun visitDotXMapIncrement(node: DotxMapIncrement) {
        val tags = when (variables[node.dotXMap.dotX.left]) {
            is Line -> (variables[node.dotXMap.dotX.left]!! as Line).getBodyTags(node.dotXMap.dotX.right)
            else -> throw IllegalStateException("Argument doesn't support accessing parameter")
        }

        tmp = tags.sumOf {
            val inner = it.getBodyTags(node.dotXMap.map)
            if (inner.size != 1) {
                throw IllegalStateException("")
            }

            inner[0].getTagValue().toInt()
        }

    }

    override fun visitXML(node: XML) {
        node.file.accept(this)
    }

    override fun visitXMLFile(node: XMLFile) {
        node.root.accept(this)
    }

    override fun visitTagBody(node: TagBody) {
        node.body = node.body.flatMap {
            it.accept(this)

            val line = tmp!!
            tmp = null

            val result = when (line) {
                is Line -> listOf(line)
                is List<*> -> line
                else -> line
            }

            result as List<Line>
        }.toList() as List<*> as List<Line>

        node.attributes = node.attributes.mapValues {
            if (it.value.startsWith("$")) {
                when (val value = variables[it.value.substring(1)]) {
                    is String -> value
                    is Int -> value.toString()
                    else -> throw IllegalStateException("Attribute cannot be a XML tag")
                }
            } else {
                it.value
            }
        }

        tmp = node
    }

    override fun visitTagValue(node: TagValue) {
        node.attributes = node.attributes.mapValues {
            if (it.value.startsWith("$")) {
                when (val value = variables[it.value.substring(1)]) {
                    is String -> value
                    is Int -> value.toString()
                    else -> throw IllegalStateException("Attribute cannot be a XML tag")
                }
            } else {
                it.value
            }
        }

        tmp = node
    }

    override fun visitSelfCloseTag(node: SelfCloseTag) {
        node.attributes = node.attributes.mapValues {
            if (it.value.startsWith("$")) {
                when (val value = variables[it.value.substring(1)]) {
                    is String -> value
                    is Int -> value.toString()
                    else -> throw IllegalStateException("Attribute cannot be a XML tag")
                }
            } else {
                it.value
            }
        }

        tmp = node
    }

    override fun visitForEach(node: ForEach) {
        val iterable = variables[node.vector]

        tmp = when (iterable) {
            is List<*> -> {
                val result = mutableListOf<Line>()
                for (element in (iterable as List<Line>)) {
                    val attributes = node.attributes.mapValues {
                        if (it.value.startsWith("$")) {
                            val value = element.getAttribute(it.value.substring(1))

                            value!!
                        } else {
                            it.value
                        }
                    }

                    result.add(SelfCloseTag(node.entity, attributes))
                }

                result
            }

            else -> throw IllegalStateException("Cannot iterate")
        }

    }
}