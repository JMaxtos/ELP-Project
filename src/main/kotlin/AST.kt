package elp


data class XQL(val init: Init, val lines: List<Assign>, val save: Save) {}
data class Init(val argument: String, val doc: String) {}
data class Save(val argument: String, val doc: String) {}
data class Assign(val variable: String, val function: Function) {}

abstract class Function {}
data class DotX(val left: String, val right: String) : Function()
data class DotXArray(val dotX: DotX, val index: Int) : Function()
data class DotXArrayElement(val dotXArray: DotXArray, val element: String) : Function()
data class DotXSize(val dotX: DotX) : Function()
data class DotXMap(val dotX: DotX, val map: String) : Function()
data class DotxMapIncrement(val dotXMap: DotXMap) : Function()
data class XML(val lines: List<Line>) : Function() {}


abstract class Line() {
    abstract class Tags(val name: String, val attributes: List<TagAttribute>) {
        class Tag(name: String, attributes: List<TagAttribute>, val body: List<Tags>) : Tags(name, attributes) {}
        class SelfCloseTag(name: String, attributes: List<TagAttribute>) : Tags(name, attributes)
    }

    data class ForEach(val vector: String, val tags: Tags)
}

data class TagAttribute(val name: String, val value: Int)