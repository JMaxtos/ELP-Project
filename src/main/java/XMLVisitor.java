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
	 * Visit a parse tree produced by {@link XMLParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(XMLParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(XMLParser.AtribContext ctx);
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
	 * Visit a parse tree produced by {@link XMLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(XMLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(XMLParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#encapsule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncapsule(XMLParser.EncapsuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(XMLParser.EndContext ctx);
}