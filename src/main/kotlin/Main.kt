import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(){
    val lexer=XMLLexer(CharStreams.fromFileName("demo.xql"))
    val parser=XMLParser(CommonTokenStream(lexer))
    val parserTree=parser.xql()
    val ast=parserTree.toAst()



    val init=Init("$1", "d.csv")
    val assign=Assign("x", DotX("a","b"))
    val end=Save("$2", "doc2")

    val xql=XQL(init, listOf(assign), end)

    ast.accept(XQLPrinterVisitor())
    println()
    xql.accept(XQLPrinterVisitor())
}