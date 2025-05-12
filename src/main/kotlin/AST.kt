package elp



data class XML(val rootTag: Tag, val lines: List<Line>){}

data class Line(
    val tag: Tag,
    val value: Int,
    val endTag: EndTag
){}

data class Tag(
    val name: String,
    val attributes: List<Attribute>,

)

data class EndTag(val name:String)

data class Attribute(
    val name: String,
    val parameter: String
)

data class Encapsulate(
    val tag: Tag,
    val innerTags: List<Tag>,
)

