
data class XQL(val init: Init, val atrib: List<Assign>, val end: End){
    fun prettyPrint(): String{
        val builder = StringBuilder()

        builder.append("init(").append("${init.arg}\",").append("${init.doc}\"").append(")").append(System.lineSeparator())

        atrib.forEach {
            assign->builder.append("${assign.varname}=${funcToString(assign.func)}").append(System.lineSeparator())
        }

        builder.append("end(").append("${end.doc},").append("${end.arg}").append(")").append(System.lineSeparator())

        return builder.toString()
    }

    private fun funcToString(func: Func): String {
        return when(func){
            is DotX -> "${func.first}.${func.second}"
            is DotXArr -> "${func.dotX.first}.${func.dotX.second}[${func.index}]"
            is DotXArrDot-> "${func.dotXArr.dotX.first}.${func.dotXArr.dotX.second}${func.dotXArr.dotX.second}[${func.dotXArr.index}].${func.second}"
            is DotXSize->"${func.field.first}.${func.field.second}#"
            is DotXMap->"${func.dotX.first}.${func.dotX.second}->${func.map}"
            is BiggField->"${func.map.dotX.first}.${func.map.dotX.second}->${func.map.map}++"
            else -> "unknown"
        }
    }

}
data class Init(val arg: String, val doc: String) {}
data class End(val doc: String, val arg: String) {}
data class Assign(val varname: String, val func: Func){}

abstract class Func {}
data class DotX(val first: String, val second: String): Func()
data class DotXArr(val dotX: DotX, val index: Int): Func()
data class DotXArrDot(val dotXArr: DotXArr, val second: String): Func()
data class DotXSize(val field: DotX): Func()
data class DotXMap(val dotX: DotX, val map: String): Func()
data class BiggField(val map: DotXMap): Func()

abstract class Line(){
    abstract class Tags(val name:String, val attributes: List<TagAttribute>){
        class Tag(name:String, attributes: List<TagAttribute>, val body: List<Tags>): Tags(name, attributes){}
        class SelfCloseTag(name: String, attributes: List<TagAttribute>): Tags(name,attributes)
    }
    data class ForEach(val vector: String, val tags: Tags)
}

data class TagAttribute(val name:String, val value: Int)

fun XMLParser.XqlContext.toAst(): XQL{
    val init=this.init().toAst()
    val assigns=this.assign().map { it.toAst() }
    val end=this.end().toAst()
    return XQL(init, assigns, end)
}

fun XMLParser.InitContext.toAst(): Init{
    val arg=this.ARGUMENTO().text
    val doc=this.STRING().text
    return Init(arg, doc)
}

fun XMLParser.EndContext.toAst(): End{
    val doc=this.STRING().text
    val arg=this.ARGUMENTO().text
    return End(doc,arg)
}

fun XMLParser.AssignContext.toAst(): Assign{
    val varname=this.STRING().text
    val func=function().toAst()
    return Assign(varname, func)
}

fun XMLParser.FunctionContext.toAst(): Func{
    return when {
        dotX() != null && ARR()==null && STRING()==null ->{
            val d=dotX().toAst()
            DotX(d.first, d.second)
        }
        dotX() != null && ARR()!=null && STRING()==null->{
            val d=dotX().toAst()
            val index=ARR().text.removeSurrounding("[","]").toInt()
            DotXArr(d,index)
        }
        dotX() != null && ARR() != null && STRING() != null -> {
            val d = dotX().toAst()
            val index = ARR().text.removeSurrounding("[", "]").toInt()
            val second = STRING().text.removeSurrounding("\"")
            DotXArrDot(DotXArr(d, index), second)
        }
        dotX() != null && getChild(1).text=="#" -> {
            val d = dotX().toAst()
            DotXSize(d)
        }
        dotX() != null && getChild(1).text=="->" -> {
            val d = dotX().toAst()
            val mapValue = STRING().text.removeSurrounding("\"")
            DotXMap(d, mapValue)
        }
        dotX() != null && getChild(1).text=="->" && getChild(3).text=="++" -> {
            val d = dotX().toAst()
            val mapValue = STRING().text.removeSurrounding("\"")
            BiggField(DotXMap(d, mapValue))
        }
        xml() != null -> {
            throw NotImplementedError("XML toAst not implemented yet.")
        }
        else -> throw IllegalArgumentException("Padrão de função desconhecido:${this.text}")
    }
}

fun XMLParser.DotXContext.toAst(): DotX{
    val first=STRING(0).text
    val second=STRING(1).text
    return DotX(first,second)
}

fun XMLParser.XmlContext.toAst(): Line{
    return foreach().toAst()
}

fun XMLParser.
