import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>){
    val lexer = XMLLexer(CharStreams.fromFileName(args[0]))
    val parser = XMLParser(CommonTokenStream(lexer))
    val ast = parser.xql().toAst()

    ast.accept(XQLPrinterVisitor())
    ast.accept(XQLInterpreter(args.drop(1).toList()))

}