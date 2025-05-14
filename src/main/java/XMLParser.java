// Generated from C:/Users/migue/IdeaProjects/Projeto_XQL/src/main/XML.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class XMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SAVE=4, LOAD=5, TO=6, ARGUMENTO=7, STRING=8, EQUAL=9, 
		DOT=10, ARR=11, HASH=12, MAP=13, PP=14, VAR=15, START=16, ENDTAG=17, ATTRIBUTE=18, 
		TAGNAME=19, ATTRIBUTE_NAME=20, SPACE=21, VALUE=22, PARAMETER=23, NEWLINE=24;
	public static final int
		RULE_xql = 0, RULE_init = 1, RULE_arg = 2, RULE_doc = 3, RULE_atrib = 4, 
		RULE_func = 5, RULE_dotX = 6, RULE_dotXArr = 7, RULE_dotXArrdot = 8, RULE_size = 9, 
		RULE_map = 10, RULE_biggField = 11, RULE_xml = 12, RULE_body = 13, RULE_line = 14, 
		RULE_encapsule = 15, RULE_tag = 16, RULE_attribute = 17, RULE_end = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"xql", "init", "arg", "doc", "atrib", "func", "dotX", "dotXArr", "dotXArrdot", 
			"size", "map", "biggField", "xml", "body", "line", "encapsule", "tag", 
			"attribute", "end"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'/'", "'>'", "'save'", "'load'", "'to'", null, null, "'='", 
			"'.'", null, "'#'", "'->'", "'++'", null, "'***'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SAVE", "LOAD", "TO", "ARGUMENTO", "STRING", 
			"EQUAL", "DOT", "ARR", "HASH", "MAP", "PP", "VAR", "START", "ENDTAG", 
			"ATTRIBUTE", "TAGNAME", "ATTRIBUTE_NAME", "SPACE", "VALUE", "PARAMETER", 
			"NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class XqlContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public XqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterXql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitXql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitXql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqlContext xql() throws RecognitionException {
		XqlContext _localctx = new XqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			init();
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				atrib();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(44);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(XMLParser.LOAD, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode TO() { return getToken(XMLParser.TO, 0); }
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(LOAD);
			setState(47);
			arg();
			setState(48);
			match(TO);
			setState(49);
			doc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ARGUMENTO() { return getToken(XMLParser.ARGUMENTO, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ARGUMENTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public TerminalNode EQUAL() { return getToken(XMLParser.EQUAL, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitAtrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(STRING);
			setState(56);
			match(EQUAL);
			setState(57);
			func();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public DotXContext dotX() {
			return getRuleContext(DotXContext.class,0);
		}
		public DotXArrContext dotXArr() {
			return getRuleContext(DotXArrContext.class,0);
		}
		public DotXArrdotContext dotXArrdot() {
			return getRuleContext(DotXArrdotContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public BiggFieldContext biggField() {
			return getRuleContext(BiggFieldContext.class,0);
		}
		public XmlContext xml() {
			return getRuleContext(XmlContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				dotX();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				dotXArr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				dotXArrdot();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				size();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				map();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				biggField();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				xml();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DotXContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(XMLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XMLParser.STRING, i);
		}
		public TerminalNode DOT() { return getToken(XMLParser.DOT, 0); }
		public DotXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterDotX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitDotX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitDotX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotXContext dotX() throws RecognitionException {
		DotXContext _localctx = new DotXContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dotX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(STRING);
			setState(69);
			match(DOT);
			setState(70);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DotXArrContext extends ParserRuleContext {
		public DotXContext dotX() {
			return getRuleContext(DotXContext.class,0);
		}
		public TerminalNode ARR() { return getToken(XMLParser.ARR, 0); }
		public DotXArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotXArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterDotXArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitDotXArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitDotXArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotXArrContext dotXArr() throws RecognitionException {
		DotXArrContext _localctx = new DotXArrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dotXArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			dotX();
			setState(73);
			match(ARR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DotXArrdotContext extends ParserRuleContext {
		public DotXArrContext dotXArr() {
			return getRuleContext(DotXArrContext.class,0);
		}
		public TerminalNode DOT() { return getToken(XMLParser.DOT, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public DotXArrdotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotXArrdot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterDotXArrdot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitDotXArrdot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitDotXArrdot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotXArrdotContext dotXArrdot() throws RecognitionException {
		DotXArrdotContext _localctx = new DotXArrdotContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dotXArrdot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			dotXArr();
			setState(76);
			match(DOT);
			setState(77);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SizeContext extends ParserRuleContext {
		public DotXContext dotX() {
			return getRuleContext(DotXContext.class,0);
		}
		public TerminalNode HASH() { return getToken(XMLParser.HASH, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			dotX();
			setState(80);
			match(HASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public DotXContext dotX() {
			return getRuleContext(DotXContext.class,0);
		}
		public TerminalNode MAP() { return getToken(XMLParser.MAP, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			dotX();
			setState(83);
			match(MAP);
			setState(84);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BiggFieldContext extends ParserRuleContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public TerminalNode PP() { return getToken(XMLParser.PP, 0); }
		public BiggFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biggField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterBiggField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitBiggField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitBiggField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BiggFieldContext biggField() throws RecognitionException {
		BiggFieldContext _localctx = new BiggFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_biggField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			map();
			setState(87);
			match(PP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class XmlContext extends ParserRuleContext {
		public List<TerminalNode> START() { return getTokens(XMLParser.START); }
		public TerminalNode START(int i) {
			return getToken(XMLParser.START, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public XmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterXml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitXml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitXml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlContext xml() throws RecognitionException {
		XmlContext _localctx = new XmlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_xml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(START);
			setState(90);
			body();
			setState(91);
			match(START);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode ENDTAG() { return getToken(XMLParser.ENDTAG, 0); }
		public List<TerminalNode> SPACE() { return getTokens(XMLParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(XMLParser.SPACE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			tag();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(94);
				match(SPACE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				line();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(105);
			match(ENDTAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public EncapsuleContext encapsule() {
			return getRuleContext(EncapsuleContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(XMLParser.VALUE, 0); }
		public List<TerminalNode> ENDTAG() { return getTokens(XMLParser.ENDTAG); }
		public TerminalNode ENDTAG(int i) {
			return getToken(XMLParser.ENDTAG, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(107);
				tag();
				}
				break;
			case 2:
				{
				setState(108);
				encapsule();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(111);
				match(VALUE);
				}
			}

			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					match(ENDTAG);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EncapsuleContext extends ParserRuleContext {
		public List<TagContext> tag() {
			return getRuleContexts(TagContext.class);
		}
		public TagContext tag(int i) {
			return getRuleContext(TagContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(XMLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XMLParser.NEWLINE, i);
		}
		public EncapsuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encapsule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterEncapsule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitEncapsule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitEncapsule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncapsuleContext encapsule() throws RecognitionException {
		EncapsuleContext _localctx = new EncapsuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_encapsule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			tag();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(121);
				match(NEWLINE);
				setState(122);
				tag();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagContext extends ParserRuleContext {
		public TerminalNode TAGNAME() { return getToken(XMLParser.TAGNAME, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__0);
			setState(129);
			match(TAGNAME);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE_NAME) {
				{
				{
				setState(130);
				attribute();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(136);
				match(T__1);
				}
			}

			setState(139);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_NAME() { return getToken(XMLParser.ATTRIBUTE_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(XMLParser.EQUAL, 0); }
		public TerminalNode PARAMETER() { return getToken(XMLParser.PARAMETER, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ATTRIBUTE_NAME);
			setState(142);
			match(EQUAL);
			setState(143);
			match(PARAMETER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends ParserRuleContext {
		public TerminalNode SAVE() { return getToken(XMLParser.SAVE, 0); }
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public TerminalNode TO() { return getToken(XMLParser.TO, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(SAVE);
			setState(146);
			doc();
			setState(147);
			match(TO);
			setState(148);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0004\u0000)\b\u0000\u000b\u0000\f\u0000"+
		"*\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005C\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r`\b\r\n\r\f\rc\t\r\u0001"+
		"\r\u0004\rf\b\r\u000b\r\f\rg\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000en\b\u000e\u0001\u000e\u0003\u000eq\b\u000e\u0001\u000e\u0005\u000e"+
		"t\b\u000e\n\u000e\f\u000ew\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f|\b\u000f\n\u000f\f\u000f\u007f\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0084\b\u0010\n\u0010\f\u0010\u0087\t\u0010"+
		"\u0001\u0010\u0003\u0010\u008a\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$\u0000\u0000\u0092\u0000&\u0001\u0000\u0000\u0000\u0002.\u0001\u0000"+
		"\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000"+
		"\b7\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fD\u0001\u0000"+
		"\u0000\u0000\u000eH\u0001\u0000\u0000\u0000\u0010K\u0001\u0000\u0000\u0000"+
		"\u0012O\u0001\u0000\u0000\u0000\u0014R\u0001\u0000\u0000\u0000\u0016V"+
		"\u0001\u0000\u0000\u0000\u0018Y\u0001\u0000\u0000\u0000\u001a]\u0001\u0000"+
		"\u0000\u0000\u001cm\u0001\u0000\u0000\u0000\u001ex\u0001\u0000\u0000\u0000"+
		" \u0080\u0001\u0000\u0000\u0000\"\u008d\u0001\u0000\u0000\u0000$\u0091"+
		"\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\')\u0003\b\u0004\u0000"+
		"(\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0003$\u0012"+
		"\u0000-\u0001\u0001\u0000\u0000\u0000./\u0005\u0005\u0000\u0000/0\u0003"+
		"\u0004\u0002\u000001\u0005\u0006\u0000\u000012\u0003\u0006\u0003\u0000"+
		"2\u0003\u0001\u0000\u0000\u000034\u0005\u0007\u0000\u00004\u0005\u0001"+
		"\u0000\u0000\u000056\u0005\b\u0000\u00006\u0007\u0001\u0000\u0000\u0000"+
		"78\u0005\b\u0000\u000089\u0005\t\u0000\u00009:\u0003\n\u0005\u0000:\t"+
		"\u0001\u0000\u0000\u0000;C\u0003\f\u0006\u0000<C\u0003\u000e\u0007\u0000"+
		"=C\u0003\u0010\b\u0000>C\u0003\u0012\t\u0000?C\u0003\u0014\n\u0000@C\u0003"+
		"\u0016\u000b\u0000AC\u0003\u0018\f\u0000B;\u0001\u0000\u0000\u0000B<\u0001"+
		"\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000"+
		"B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0005\b\u0000\u0000EF\u0005\n"+
		"\u0000\u0000FG\u0005\b\u0000\u0000G\r\u0001\u0000\u0000\u0000HI\u0003"+
		"\f\u0006\u0000IJ\u0005\u000b\u0000\u0000J\u000f\u0001\u0000\u0000\u0000"+
		"KL\u0003\u000e\u0007\u0000LM\u0005\n\u0000\u0000MN\u0005\b\u0000\u0000"+
		"N\u0011\u0001\u0000\u0000\u0000OP\u0003\f\u0006\u0000PQ\u0005\f\u0000"+
		"\u0000Q\u0013\u0001\u0000\u0000\u0000RS\u0003\f\u0006\u0000ST\u0005\r"+
		"\u0000\u0000TU\u0005\b\u0000\u0000U\u0015\u0001\u0000\u0000\u0000VW\u0003"+
		"\u0014\n\u0000WX\u0005\u000e\u0000\u0000X\u0017\u0001\u0000\u0000\u0000"+
		"YZ\u0005\u0010\u0000\u0000Z[\u0003\u001a\r\u0000[\\\u0005\u0010\u0000"+
		"\u0000\\\u0019\u0001\u0000\u0000\u0000]a\u0003 \u0010\u0000^`\u0005\u0015"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000df\u0003\u001c\u000e\u0000ed\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u0011\u0000\u0000j\u001b"+
		"\u0001\u0000\u0000\u0000kn\u0003 \u0010\u0000ln\u0003\u001e\u000f\u0000"+
		"mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000np\u0001\u0000\u0000"+
		"\u0000oq\u0005\u0016\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qu\u0001\u0000\u0000\u0000rt\u0005\u0011\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\u001d\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000x}\u0003 \u0010\u0000yz\u0005\u0018\u0000\u0000z|\u0003 \u0010"+
		"\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u001f\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0001\u0000\u0000"+
		"\u0081\u0085\u0005\u0013\u0000\u0000\u0082\u0084\u0003\"\u0011\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0005\u0002\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u0003\u0000\u0000\u008c!\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u0014\u0000\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f\u0090\u0005"+
		"\u0017\u0000\u0000\u0090#\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0004"+
		"\u0000\u0000\u0092\u0093\u0003\u0006\u0003\u0000\u0093\u0094\u0005\u0006"+
		"\u0000\u0000\u0094\u0095\u0003\u0004\u0002\u0000\u0095%\u0001\u0000\u0000"+
		"\u0000\n*Bagmpu}\u0085\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}