import XMLParser.AtribContext
import XMLParser.EndContext
import XMLParser.InitContext
import java.lang.classfile.Attribute
import javax.print.Doc


sealed class Node

data class XQL(val init: Init, val atrib: List<Atrib>, val end: End) : Node()

data class Init(val arg: String, val doc: String) : Node()
data class End(val doc: String, val arg: String) : Node()
data class LOAD(val value: String): Node()


data class Atrib(val varname: String, val func: Func): Node()
sealed class Func : Node()

data class DotX(val first: String, val second: String): Func()
data class DotXArr(val dotX: DotX, val index: Int): Func()
data class DotXArrDot(val dotXArr: DotXArr, val second: String): Func()
data class Size(val field: DotX): Func()
data class Map(val dotX: DotX, val map: String): Func()
data class BiggField(val map: Map): Func()

data class XML(val body: Body): Func()
data class Body(val lines: List<Line>): Func()

data class Line(val elements: List<Any>): Node()
data class Tag(val name: String, val attributes: List<Att>): Node()
data class Att(val name: String, val value: String): Node()


data class Encapsule(val nextTags: List<Tag>): Node()


fun XMLParser.XqlContext.toAst(): XQL{
    val init=this.init().toAst()
    val atribs=this.atrib().map { it.toAst() }
    val end=this.end().toAst()
    return XQL(init, atribs, end)
}

fun XMLParser.InitContext.toAst(): Init{
    val arg = this.arg().text
    val doc=this.doc().text
    return Init(arg,doc)
}

fun XMLParser.EndContext.toAst(): End{
    val doc=this.doc().text
    val arg=this.arg().text
    return End(arg,doc)
}

fun XMLParser.AtribContext.toAst(): Atrib{
    val varname=this.STRING().text.trim('"')
    val func=this.func().toAst()
    return Atrib(varname, func)
}

fun XMLParser.FuncContext.toAst(): Func{
    return when {
        this.dotX()!=null->this.dotX().toAst()
        this.dotXArr()!=null->this.dotXArr().toAst()
        this.dotXArrdot()!=null->this.dotXArrdot().toAst()
        this.size()!=null->this.size().toAst()
        this.map()!=null->this.map().toAst()
        this.biggField()!=null-> this.biggField().toAst()
        this.xml()!=null->this.xml().toAst()
        else-> throw IllegalArgumentException("Unknown")
    }
}

fun XMLParser.DotXContext.toAst(): DotX {
    val first=this.STRING(0).text
    val second=this.STRING(1).text
    return DotX(first,second)
}

fun XMLParser.DotXArrContext.toAst(): DotXArr {
    val dotX=this.dotX().toAst()
    val index=this.ARR().text.trim('[',']').toInt()
    return DotXArr(dotX,index)
}

fun XMLParser.DotXArrdotContext.toAst(): DotXArrDot {
    val dotXArr=this.dotXArr().toAst()
    val name=this.STRING().text
    return DotXArrDot(dotXArr,name)
}
fun XMLParser.SizeContext.toAst(): Size {
    val dotX=this.dotX().toAst()
    return Size(dotX)
}

fun XMLParser.MapContext.toAst(): Map{
    val dotX=this.dotX().toAst()
    val key=this.STRING().text.trim('"')
    return Map(dotX,key)
}

fun XMLParser.BiggFieldContext.toAst(): BiggField {
    val map=this.map().toAst()
    return BiggField(map)
}

fun XMLParser.XmlContext.toAst(): XML{
    val body=this.body().toAst()
    return XML(body)
}

fun XMLParser.BodyContext.toAst(): Body{
    val lines=this.line().map{it.toAst()}
    return Body(lines)
}

fun XMLParser.LineContext.toAst(): Line{
    return if (this.tag()!=null){
        Line(listOf(this.tag().toAst()))
    } else {
        Line(listOf(this.encapsule().toAst()))
    }
}

fun XMLParser.TagContext.toAst(): Tag{
    val name=this.TAGNAME().text
    val attributes=this.attribute().map {
        Att(it.ATTRIBUTE_NAME().text,it.PARAMETER().text.trim('"'))
    }
    return Tag(name,attributes)
}

fun XMLParser.AttributeContext.toAst():Att{
    val name=this.ATTRIBUTE_NAME().text
    val value=this.PARAMETER().text.trim('"')
    return Att(name,value)
}

fun XMLParser.EncapsuleContext.toAst(): Encapsule{
    val alltags= listOf(this.tag(0))+this.tag().drop(1)
    return Encapsule(alltags.map{it.toAst()})
}