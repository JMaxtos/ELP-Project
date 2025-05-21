import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>){
    val lexer=XMLLexer(CharStreams.fromFileName("demo.xql"))
    val parser=XMLParser(CommonTokenStream(lexer))
    val parserTree=parser.xql()
    val ast=parserTree.toAst()

    val args = listOf("uc.xml", "demo.xql")

  /*  val init=Init("$1", "d.csv")
    val assign=Assign("x", DotX("a","b"))
    val end=Save("$2", "doc2")

    val xql=XQL(init, listOf(assign), end)*/

    //ast.accept(XQLPrinterVisitor())
    ast.accept(XQLInterpreter(args.toList()))
   // println()
   // xql.accept(XQLPrinterVisitor())
}