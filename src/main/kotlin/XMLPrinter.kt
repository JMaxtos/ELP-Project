import java.io.File

class XMLPrinter(val file: File): XQLVisitor {
    private var indent = 0
    private val INDENT_AMOUNT = 2

    init {
        // Clean file contents
        file.writeText("")
    }

    override fun visitTagBody(node: TagBody) {
        val currentIndent = " ".repeat(indent)
        val attributes = node.attributes.map { "${it.key}=\"${it.value}\"" }.reduce { acc, s -> "$acc $s" }
        this.file.appendText("${currentIndent}<${node.name} ${attributes}>\n")
        this.indent += INDENT_AMOUNT
        node.body.forEach { it.accept(this) }
        this.indent -= INDENT_AMOUNT
        this.file.appendText("${currentIndent}</${node.name}>\n")
    }

    override fun visitTagValue(node: TagValue) {
        val currentIndent = " ".repeat(indent)
        val attributes = node.attributes.map { "${it.key}=\"${it.value}\"" }.reduce { acc, s -> "$acc $s" }
        this.file.appendText("${currentIndent}<${node.name} ${attributes}>${node.value}</${node.name}>\n")
    }

    override fun visitSelfCloseTag(node: SelfCloseTag) {
        val currentIndent = " ".repeat(indent)
        val attributes = node.attributes.map { "${it.key}=\"${it.value}\"" }.reduce { acc, s -> "$acc $s" }
        this.file.appendText("${currentIndent}<${node.name} ${attributes}/>\n")
    }

    override fun visitXql(node: XQL) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitInit(node: Init) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitSave(node: Save) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitAssign(node: Assign) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitDotX(node: DotX) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitDotXArray(node: DotXArray) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitDotXArrayElement(node: DotXArrayElement) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitDotXSize(node: DotXSize) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitDotXMap(node: DotXMap) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitDotXMapIncrement(node: DotxMapIncrement) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitXML(node: XML) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitXMLFile(node: XMLFile) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitForEachTagBody(node: ForEachTagBody) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitForEachTagValue(node: ForEachTagValue) {
        throw IllegalStateException("Can't print as XML")
    }

    override fun visitForEachSelfClosing(node: ForEachSelfClosing) {
        throw IllegalStateException("Can't print as XML")
    }
}