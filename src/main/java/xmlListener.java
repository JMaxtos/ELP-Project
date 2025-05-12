// Generated from C:/Users/joelm/Desktop/Projeto_ELP/src/main/xml.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xmlParser}.
 */
public interface xmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xmlParser#xml}.
	 * @param ctx the parse tree
	 */
	void enterXml(xmlParser.XmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#xml}.
	 * @param ctx the parse tree
	 */
	void exitXml(xmlParser.XmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(xmlParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(xmlParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#encapsule}.
	 * @param ctx the parse tree
	 */
	void enterEncapsule(xmlParser.EncapsuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#encapsule}.
	 * @param ctx the parse tree
	 */
	void exitEncapsule(xmlParser.EncapsuleContext ctx);
}