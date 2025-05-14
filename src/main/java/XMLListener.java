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
	 * Enter a parse tree produced by {@link XMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(XMLParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(XMLParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XMLParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XMLParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(XMLParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(XMLParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(XMLParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(XMLParser.FuncContext ctx);
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
	 * Enter a parse tree produced by {@link XMLParser#dotXArr}.
	 * @param ctx the parse tree
	 */
	void enterDotXArr(XMLParser.DotXArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#dotXArr}.
	 * @param ctx the parse tree
	 */
	void exitDotXArr(XMLParser.DotXArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#dotXArrdot}.
	 * @param ctx the parse tree
	 */
	void enterDotXArrdot(XMLParser.DotXArrdotContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#dotXArrdot}.
	 * @param ctx the parse tree
	 */
	void exitDotXArrdot(XMLParser.DotXArrdotContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(XMLParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(XMLParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(XMLParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(XMLParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#biggField}.
	 * @param ctx the parse tree
	 */
	void enterBiggField(XMLParser.BiggFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#biggField}.
	 * @param ctx the parse tree
	 */
	void exitBiggField(XMLParser.BiggFieldContext ctx);
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
	 * Enter a parse tree produced by {@link XMLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(XMLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(XMLParser.BodyContext ctx);
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
	 * Enter a parse tree produced by {@link XMLParser#encapsule}.
	 * @param ctx the parse tree
	 */
	void enterEncapsule(XMLParser.EncapsuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#encapsule}.
	 * @param ctx the parse tree
	 */
	void exitEncapsule(XMLParser.EncapsuleContext ctx);
}