class XQLPrinterVisitor: XQLVisitor {
    override fun visitXql(node: XQL) {
        node.init.accept(this)
        node.attrib.forEach { it.accept(this) }
        node.save.accept(this)
    }

    override fun visitInit(node: Init) {
        println("load ${node.argument} to ${node.doc}")
    }

    override fun visitSave(node: Save){
        println("save ${node.doc} to \"${node.argument}\"")
    }

    override fun visitDotX(node: DotX) {
        println("${node.left}.${node.right}")
    }

    override fun visitAssign(node: Assign) {
        print("${node.variable} = ")
        node.function.accept(this)
    }
    
    override fun visitDotXArray(node: DotXArray) {
        println("${node.dotX.left}.${node.dotX.right}[${node.index}]")
    }

    override fun visitDotXArrayElement(node: DotXArrayElement) {
        println("${node.dotXArray.dotX.left}.${node.dotXArray.dotX.right}[${node.dotXArray.index}].${node.element}")
    }

    override fun visitDotXSize(node: DotXSize) {
        println("${node.dotX.left}.${node.dotX.right}#")
    }

    override fun visitDotXMap(node: DotXMap) {
        println("${node.dotX.left}.${node.dotX.right}.map(${node.map})")
    }

    override fun visitDotXMapIncrement(node: DotxMapIncrement) {
        println("${node.dotXMap.dotX.left}.${node.dotXMap.dotX.right}.map(${node.dotXMap.map})++")
    }

    override fun visitXML(node: XML) {
        println("***")
        node.lines.forEach { it.accept(this) }
        println("***")
    }

    override fun visitTagBody(node: TagBody) {
        println("<${node.name} ${node.attributes}>")
        node.body.forEach { it.accept(this) }
        println("</${node.name}>")
    }

    override fun visitTagValue(node: TagValue) {
        println("<${node.name} ${node.attributes}>${node.value}</${node.name}>")
    }

    override fun visitSelfCloseTag(node: SelfCloseTag) {
        println("<${node.name} ${node.attributes} />")
    }

    override fun visitForEachTagBody(node: ForEachTagBody) {
        println("<${node.entity}$${node.vector} ${node.attributes}>")
        node.body.forEach { it.accept(this) }
        println("</${node.entity}>")
    }

    override fun visitForEachTagValue(node: ForEachTagValue) {
        println("<${node.entity}$${node.vector} ${node.attributes}>${node.value}</${node.entity}>")
    }

    override fun visitForEachSelfClosing(node: ForEachSelfClosing) {
        println("<${node.entity}$${node.vector} ${node.attributes}/>")
    }
}