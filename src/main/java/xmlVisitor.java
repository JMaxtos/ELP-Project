// Generated from C:/Users/joelm/Desktop/Projeto_ELP/src/main/xml.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xmlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link xmlParser#xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml(xmlParser.XmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(xmlParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#encapsule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncapsule(xmlParser.EncapsuleContext ctx);
}