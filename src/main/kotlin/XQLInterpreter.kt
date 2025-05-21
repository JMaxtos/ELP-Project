import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

class XQLInterpreter(val args: List<String>) : XQLVisitor {
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
        if (node.argument >= this.args.size || node.argument < 0) {
            throw IllegalStateException("Invalid argument ${node.argument}")
        }

        val lexer = XMLLexer(CharStreams.fromFileName(this.args[node.argument - 1]))
        val parser = XMLParser(CommonTokenStream(lexer))

        if (parser.xmlfile() == null) {
            throw IllegalStateException("Illegal XML format")
        }

        parser.xmlfile().toAst()
        variables[node.doc] = tmp!!

        tmp = null
    }

    override fun visitSave(node: Save) {
        // Ler argumento node.argument
        // Abrir ficheiro do argumento
        // Escrever conteudo do node.doc no ficheiro
        if (node.argument >= this.args.size || node.argument < 0) {
            throw IllegalStateException("Invalid argument ${node.argument}")
        }

        File(this.args[node.argument - 1]).writeText(variables[node.doc].toString())
    }

    override fun visitAssign(node: Assign) {
        // Visitar o lado direito do assignment
        // Guardar o valor na variável

        node.function.accept(this)

        variables[node.variable] = tmp!!

        tmp = null
    }

    override fun visitDotX(node: DotX) {
        //tags[name].method
        //setid = doc.id -> <uc-set id="demo">
        tmp = when (variables[node.left]) {
            is Line -> (variables[node.left]!! as Line).getAttribute(node.right) ?: throw IllegalStateException("Attribute doesn't exist")
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
        if(elementValue.size != 1){
            throw IllegalArgumentException("dsadasda")
        }
        tmp = elementValue[0].getTagValue()
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

        tmp = tags.sumOf    {
                val inner = it.getBodyTags(node.dotXMap.map)
                if (inner.size != 1) {
                    throw IllegalStateException("")
                }

                inner[0].getTagValue().toInt()
            }

    }

    override fun visitXML(node: XML) {
        println("${this.tmp}")
        println("${this.variables}")
        TODO("")
    }

    override fun visitXMLFile(node: XMLFile) {
        TODO("Not yet implemented")
    }

    override fun visitTagBody(node: TagBody) {
        TODO("Not yet implemented")
    }

    override fun visitTagValue(node: TagValue) {
        TODO("Not yet implemented")
    }

    override fun visitSelfCloseTag(node: SelfCloseTag) {
        TODO("Not yet implemented")
    }

    override fun visitForEachTagBody(node: ForEachTagBody) {
        TODO("Not yet implemented")
    }

    override fun visitForEachTagValue(node: ForEachTagValue) {
        TODO("Not yet implemented")
    }

    override fun visitForEachSelfClosing(node: ForEachSelfClosing) {
        TODO("Not yet implemented")
    }
}