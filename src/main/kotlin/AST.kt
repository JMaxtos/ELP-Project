import XMLParser.LineContext

interface Visitable {
    fun accept(visitor: XQLVisitor)
}

data class XQL(val init: Init, val attrib: List<Assign>, val save: Save) : Visitable {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitXql(this)
    }
}

data class Init(val argument: String, val doc: String) : Visitable {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitInit(this)
    }
}

data class Save(val argument: String, val doc: String) : Visitable {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitSave(this)
    }
}

data class Assign(val variable: String, val function: Function) : Visitable {
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

data class XML(val lines: List<Line>) : Function() {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitXML(this)
    }
}


abstract class Line : Visitable

abstract class Tags(val name: String, val attributes: Map<String, String>) : Line()
class TagBody(name: String, attributes: Map<String, String>, val body: List<Line>) : Tags(name, attributes) {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitTagBody(this)
    }
}

class TagValue(name: String, attributes: Map<String, String>, val value: String) : Tags(name, attributes) {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitTagValue(this)
    }
}

class SelfCloseTag(name: String, attributes: Map<String, String>) : Tags(name, attributes) {
    override fun accept(visitor: XQLVisitor) {
        visitor.visitSelfCloseTag(this)
    }
}

abstract class ForEach(val entity: String, val vector: String, val attributes: Map<String, String>) : Line()
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
    val init = this.init().toAst()
    val assigns = this.assign().map { it.toAst() }
    val end = this.end().toAst()
    return XQL(init, assigns, end)
}

fun XMLParser.InitContext.toAst(): Init {
    val arg = this.ARGUMENTO().text
    val doc = this.STRING().text
    return Init(arg, doc)
}

fun XMLParser.EndContext.toAst(): Save {
    val doc = this.STRING().text
    val arg = this.ARGUMENTO().text
    return Save(arg, doc)
}

fun XMLParser.AssignContext.toAst(): Assign {
    val varname = this.STRING().text
    val func = function().toAst()
    return Assign(varname, func)
}

fun XMLParser.FunctionContext.toAst(): Function {
    return when {
        dotX() != null && ARR() == null && STRING() == null -> {
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

        dotX() != null && getChild(1).text == "->" -> {
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
            XML(xml().toAst())
        }

        else -> throw IllegalArgumentException("Padrão de função desconhecido:${this.text}")
    }
}

fun XMLParser.DotXContext.toAst(): DotX {
    val first = STRING(0).text
    val second = STRING(1).text
    return DotX(first, second)
}

fun XMLParser.XmlContext.toAst(): List<Line> {
    return line().map { parseLine(it) }.toList()
}

fun parseLine(it: LineContext): Line {
    return when {
        it.TAG() != null && (it.VALUE() != null || it.line() != null) && it.ENDTAG() != null -> {
            val tagELEMENTS = tagElements(it.TAG().text)

            if (it.line() != null) {
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
            throw IllegalStateException("Estado inválido")
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
