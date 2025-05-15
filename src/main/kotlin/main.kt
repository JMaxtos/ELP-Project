import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(){

    val lexer=XMLLexer(CharStreams.fromFileName("exemplo.xql"))
    val parser=XMLParser(CommonTokenStream(lexer))
    val parserTree=parser.xql()
    val ast=parserTree.toAst()

    /*
    val init=Init("$1", "d.csv")
    val assign=Assign("x", DotX("a","b"))
    val end=End("doc2", "$2")

    val xql=XQL(init, listOf(assign), end)
*/

    println(ast.prettyPrint())
}

