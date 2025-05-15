// Generated from C:/Users/migue/IdeaProjects/Projeto_XQL/src/main/XML.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XMLParser}.
 */
public interface XMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XMLParser#xql}.
	 * @param ctx the parse tree
	 */
	void enterXql(XMLParser.XqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#xql}.
	 * @param ctx the parse tree
	 */
	void exitXql(XMLParser.XqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(XMLParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(XMLParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(XMLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(XMLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#dotX}.
	 * @param ctx the parse tree
	 */
	void enterDotX(XMLParser.DotXContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#dotX}.
	 * @param ctx the parse tree
	 */
	void exitDotX(XMLParser.DotXContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(XMLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(XMLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#xml}.
	 * @param ctx the parse tree
	 */
	void enterXml(XMLParser.XmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#xml}.
	 * @param ctx the parse tree
	 */
	void exitXml(XMLParser.XmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(XMLParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(XMLParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(XMLParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(XMLParser.EndContext ctx);
}