import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream


fun main(){
    val input = CharStreams.fromFileName("exemplo.xql")

    val lexer = XMLLexer(input)
    val parser=XMLParser(CommonTokenStream(lexer))

    val tree=parser.xql()

    val ast=tree.toAst()

    println(ast)

}