// Generated from C:/Users/joelm/Desktop/Projeto_ELP/src/main/XML.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XMLParser#xql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXql(XMLParser.XqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(XMLParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(XMLParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(XMLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#dotX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotX(XMLParser.DotXContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(XMLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml(XMLParser.XmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#xmlfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlfile(XMLParser.XmlfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(XMLParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#save}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSave(XMLParser.SaveContext ctx);
}