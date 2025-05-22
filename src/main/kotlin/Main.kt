import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>){
    val lexer = XMLLexer(CharStreams.fromFileName("demo.xql"))
    val parser = XMLParser(CommonTokenStream(lexer))
    val ast = parser.xql().toAst()

    val args = listOf("uc.xml", "output.xql")

    //ast.accept(XQLPrinterVisitor())
    ast.accept(XQLInterpreter(args.toList()))
   // xql.accept(XQLPrinterVisitor())
}