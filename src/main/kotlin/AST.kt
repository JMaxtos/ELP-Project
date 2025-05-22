import XMLParser.LineContext

interface Visitable {
    fun accept(visitor: XQLVisitor)
}

abstract class Instruction : Visitable

data class XQL(val instructions: List<Instruction>) : Visitable {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitXql(this)
    }
}

data class Init(val argument: Int, val doc: String) : Instruction() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitInit(this)
    }
}

data class Save(val argument: Int, val doc: String) : Instruction() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitSave(this)
    }
}

data class Assign(val variable: String, val function: Function) : Instruction() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitAssign(this)
    }
}

abstract class Function : Visitable

data class DotX(val left: String, val right: String) : Function() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitDotX(this)
    }
}

data class DotXArray(val dotX: DotX, val index: Int) : Function() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitDotXArray(this)
    }
}

data class DotXArrayElement(val dotXArray: DotXArray, val element: String) : Function() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitDotXArrayElement(this)
    }
}

data class DotXSize(val dotX: DotX) : Function() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitDotXSize(this)
    }
}

data class DotXMap(val dotX: DotX, val map: String) : Function() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitDotXMap(this)
    }
}

data class DotxMapIncrement(val dotXMap: DotXMap) : Function() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitDotXMapIncrement(this)
    }
}

data class XML(val file: XMLFile) : Function() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitXML(this)
    }
}

data class XMLFile(val root: Line) : Visitable {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitXMLFile(this)
    }
}

abstract class Line : Visitable {
    abstract fun getAttribute(attribute: String): String?
    abstract fun getBodyTags(tag: String): List<Line>
    abstract fun getTagName(): String
    abstract fun getSize(): Int
    abstract fun getTagValue(): String
    abstract fun getBodyTags(): List<Line>
}

abstract class Tags(val name: String, var attributes: Map<String, String>) : Line() {
    override fun getTagName(): String {
        return this.name
    }

    override fun getAttribute(attribute: String): String? {
        return this.attributes[attribute]
    }
}

class TagBody(name: String, attributes: Map<String, String>, var body: List<Line>) : Tags(name, attributes) {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitTagBody(this)
    }

    override fun getBodyTags(tag: String): List<Line> {
        return this.body.filter{ it.getTagName() == tag }.toList()
    }

    override fun getBodyTags(): List<Line> {
        return this.body
    }

    override fun getSize(): Int {
        return this.body.size
    }
    override fun getTagValue(): String {
        throw IllegalStateException("..sdaa")
    }
}

class TagValue(name: String, attributes: Map<String, String>, val value: String) : Tags(name, attributes) {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitTagValue(this)
    }

    override fun getBodyTags(tag: String): List<Line> {
        throw IllegalStateException("Value tag doesn't have body")
    }

    override fun getBodyTags(): List<Line> {
        throw IllegalStateException("Value tag doesn't have body")
    }

    override fun getSize(): Int {
        throw IllegalStateException("Value tag doesn't have body")
    }
    override fun getTagValue(): String {
        return value
    }
}

class SelfCloseTag(name: String, attributes: Map<String, String>) : Tags(name, attributes) {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitSelfCloseTag(this)
    }

    override fun getBodyTags(tag: String): List<Line> {
        throw IllegalStateException("Self closing tag doesn't have body")
    }

    override fun getBodyTags(): List<Line> {
        throw IllegalStateException("Value tag doesn't have body")
    }

    override fun getSize(): Int {
        throw IllegalStateException("Value tag doesn't have body")
    }
    override fun getTagValue(): String {
        throw IllegalStateException("..sdaa")
    }
}

abstract class ForEach(val entity: String, val vector: String, val attributes: Map<String, String>) : Line() {
    override fun getTagName(): String {
        return entity
    }

    override fun getAttribute(attribute: String): String? {
        TODO("Not yet implemented")
    }

    override fun getBodyTags(tag: String): List<Line> {
        TODO("Not yet implemented")
    }

    override fun getBodyTags(): List<Line> {
        TODO("Not yet implemented")
    }

    override fun getSize(): Int {
        throw IllegalStateException("Value tag doesn't have body")
    }
    override fun getTagValue(): String {
        throw IllegalStateException("..sdaa")
    }
}

class ForEachTagBody(entity: String, vector: String, attributes: Map<String, String>, val body: List<Line>) :
    ForEach(entity, vector, attributes) {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitForEachTagBody(this)
    }
}

class ForEachTagValue(entity: String, vector: String, attributes: Map<String, String>, val value: String) :
    ForEach(entity, vector, attributes) {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitForEachTagValue(this)
    }
}

class ForEachSelfClosing(entity: String, vector: String, attributes: Map<String, String>) :
    ForEach(entity, vector, attributes) {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitForEachSelfClosing(this)
    }
}

fun XMLParser.XqlContext.toAst(): XQL {
    val instructions = this.instructions().map { it.toAst() }.toList()
    return XQL(instructions)
}

fun XMLParser.InstructionsContext.toAst(): Instruction {
    return when {
        save() != null -> save().toAst()
        init() != null -> init().toAst()
        assign()!= null -> assign().toAst()
        else -> throw IllegalArgumentException("Unknown Instruction: \"${this.text}\"")
    }
}

fun XMLParser.InitContext.toAst(): Init {
    val arg = this.ARGUMENTO().text.removePrefix("$").toInt()
    val doc = this.STRING().text
    return Init(arg, doc)
}

fun XMLParser.SaveContext.toAst(): Save {
    val doc = this.STRING().text
    val arg = this.ARGUMENTO().text.removePrefix("$").toInt()
    return Save(arg, doc)
}

fun XMLParser.AssignContext.toAst(): Assign {
    val varname = this.STRING().text
    val func = function().toAst()
    return Assign(varname, func)
}

fun XMLParser.FunctionContext.toAst(): Function {
    return when {
        dotX() != null && ARR() == null && STRING() == null && getChild(1) == null -> {
            val d = dotX().toAst()
            DotX(d.left, d.right)
        }

        dotX() != null && ARR() != null && STRING() == null -> {
            val d = dotX().toAst()
            val index = ARR().text.removeSurrounding("[", "]").toInt()
            DotXArray(d, index)
        }

        dotX() != null && ARR() != null && STRING() != null -> {
            val d = dotX().toAst()
            val index = ARR().text.removeSurrounding("[", "]").toInt()
            val second = STRING().text.removeSurrounding("\"")
            DotXArrayElement(DotXArray(d, index), second)
        }

        dotX() != null && getChild(1).text == "#" -> {
            val d = dotX().toAst()
            DotXSize(d)
        }

        dotX() != null && getChild(1).text == "->" && getChild(3) == null -> {
            val d = dotX().toAst()
            val mapValue = STRING().text.removeSurrounding("\"")
            DotXMap(d, mapValue)
        }

        dotX() != null && getChild(1).text == "->" && getChild(3).text == "++" -> {
            val d = dotX().toAst()
            val mapValue = STRING().text.removeSurrounding("\"")
            DotxMapIncrement(DotXMap(d, mapValue))
        }

        xml() != null -> {
            xml().toAst()
        }

        else -> throw IllegalArgumentException("Unknown Function:${this.text}")
    }
}

fun XMLParser.XmlContext.toAst(): XML {
    return XML(xmlfile().toAst())
}

fun XMLParser.DotXContext.toAst(): DotX {
    val first = STRING(0).text
    val second = STRING(1).text
    return DotX(first, second)
}

fun XMLParser.XmlfileContext.toAst(): XMLFile {
    return XMLFile(parseLine(line()))
}

fun parseLine(it: LineContext): Line {
    return when {
        it.TAG() != null && (it.VALUE() != null || it.line() != null) && it.ENDTAG() != null -> {
            val tagELEMENTS = tagElements(it.TAG().text)

            if (it.line() != null && it.line().size != 0) {
                TagBody(tagELEMENTS.first, tagELEMENTS.second, it.line().map { parseLine(it) }.toList())
            } else {
                TagValue(tagELEMENTS.first, tagELEMENTS.second, it.VALUE().text)
            }

        }

        it.SELFCLOSINGTAG() != null -> {
            val selfClosingTagElements = tagElements(it.SELFCLOSINGTAG().text)
            SelfCloseTag(selfClosingTagElements.first, selfClosingTagElements.second)
        }

        it.SELFCLOSINGTAG_FOREACH() != null -> {
            val selfClosingTagElements = tagElements(it.SELFCLOSINGTAG_FOREACH().text)

            val intermediate = selfClosingTagElements.first.split("$")
            val entity = intermediate.first()
            val vector = intermediate.last()

            ForEachSelfClosing(
                entity, vector, selfClosingTagElements.second,
            )
        }

        it.TAGFOREACH() != null && (it.VALUE() != null || it.line() != null) && it.ENDTAG() != null -> {
            val tagForEachElements = tagElements(it.TAGFOREACH().text)
            val intermediate = tagForEachElements.first.split("$")
            val entity = intermediate.first()
            val vector = intermediate.last()

            if (it.line() != null) {
                ForEachTagBody(entity, vector, tagForEachElements.second, it.line().map { parseLine(it) }.toList())
            } else {
                ForEachTagValue(entity, vector, tagForEachElements.second, it.VALUE().text)
            }
        }

        else -> {
            throw IllegalStateException("Invalid Tag")
        }
    }
}

fun tagElements(tag: String): Pair<String, Map<String, String>> {

    val inter = tag.trim('<').trim('>').trim('/').split(" ")
    val name = inter[0]

    val attributes = inter.drop(1).map {
        val intermediate = it.split("=")
        val key = intermediate.first()
        val value = intermediate.last().removeSurrounding("\"")

        Pair(key, value)
    }.toMap()

    return Pair(name, attributes)
}
