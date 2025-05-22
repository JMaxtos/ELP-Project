interface XQLVisitor {
    fun visitXql(node: XQL)

    fun visitInit(node: Init)

    fun visitSave(node: Save)

    fun visitAssign(node: Assign)

    fun visitDotX(node: DotX)

    fun visitDotXArray(node: DotXArray)

    fun visitDotXArrayElement(node: DotXArrayElement)

    fun visitDotXSize(node: DotXSize)

    fun visitDotXMap(node: DotXMap)

    fun visitDotXMapIncrement(node: DotxMapIncrement)

    fun visitXML(node: XML)

    fun visitXMLFile(node: XMLFile)

    fun visitTagBody(node: TagBody)

    fun visitTagValue(node: TagValue)

    fun visitSelfCloseTag(node: SelfCloseTag)

    fun visitForEach(node: ForEach)
}