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
		LOAD=1, TO=2, ARGUMENTO=3, STRING=4, EQUAL=5, DOT=6, ARR=7, HASH=8, MAP=9, 
		PP=10, START=11, TAG=12, ENDTAG=13, ATTRIBUTE=14, TAGNAME=15, ATTRIBUTE_NAME=16, 
		SPACE=17, VALUE=18, PARAMETER=19, NEWLINE=20;
	public static final int
		RULE_xql = 0, RULE_init = 1, RULE_arg = 2, RULE_doc = 3, RULE_atrib = 4, 
		RULE_func = 5, RULE_dotX = 6, RULE_dotXArr = 7, RULE_dotXArrdot = 8, RULE_size = 9, 
		RULE_map = 10, RULE_biggField = 11, RULE_xml = 12, RULE_body = 13, RULE_line = 14, 
		RULE_encapsule = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"xql", "init", "arg", "doc", "atrib", "func", "dotX", "dotXArr", "dotXArrdot", 
			"size", "map", "biggField", "xml", "body", "line", "encapsule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'load'", "'to'", null, null, "'='", "'.'", null, "'#'", "'->'", 
			"'++'", "'***'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOAD", "TO", "ARGUMENTO", "STRING", "EQUAL", "DOT", "ARR", "HASH", 
			"MAP", "PP", "START", "TAG", "ENDTAG", "ATTRIBUTE", "TAGNAME", "ATTRIBUTE_NAME", 
			"SPACE", "VALUE", "PARAMETER", "NEWLINE"
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
		public List<TerminalNode> NEWLINE() { return getTokens(XMLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XMLParser.NEWLINE, i);
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
			setState(32);
			init();
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				match(NEWLINE);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				atrib();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
			setState(43);
			match(LOAD);
			setState(44);
			arg();
			setState(45);
			match(TO);
			setState(46);
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
			setState(48);
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
			setState(50);
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
		public List<TerminalNode> NEWLINE() { return getTokens(XMLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XMLParser.NEWLINE, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(STRING);
			setState(53);
			match(EQUAL);
			setState(54);
			func();
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				match(NEWLINE);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				dotX();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				dotXArr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				dotXArrdot();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				size();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				map();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				biggField();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
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
			setState(69);
			match(STRING);
			setState(70);
			match(DOT);
			setState(71);
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
			setState(73);
			dotX();
			setState(74);
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
			setState(76);
			dotXArr();
			setState(77);
			match(DOT);
			setState(78);
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
			setState(80);
			dotX();
			setState(81);
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
			setState(83);
			dotX();
			setState(84);
			match(MAP);
			setState(85);
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
			setState(87);
			map();
			setState(88);
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
			setState(90);
			match(START);
			setState(91);
			body();
			setState(92);
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
		public TerminalNode TAG() { return getToken(XMLParser.TAG, 0); }
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
			setState(94);
			match(TAG);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(95);
				match(SPACE);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				line();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAG );
			setState(106);
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
		public TerminalNode TAG() { return getToken(XMLParser.TAG, 0); }
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(108);
				match(TAG);
				}
				break;
			case 2:
				{
				setState(109);
				encapsule();
				}
				break;
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(112);
				match(VALUE);
				}
			}

			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(ENDTAG);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public List<TerminalNode> TAG() { return getTokens(XMLParser.TAG); }
		public TerminalNode TAG(int i) {
			return getToken(XMLParser.TAG, i);
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
			setState(121);
			match(TAG);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(122);
				match(NEWLINE);
				setState(123);
				match(TAG);
				}
				}
				setState(128);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u0082\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000"+
		"$\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u00049\b\u0004\u000b\u0004\f\u0004:\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005D\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\ra\b\r\n\r\f\rd\t\r\u0001"+
		"\r\u0004\rg\b\r\u000b\r\f\rh\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000eo\b\u000e\u0001\u000e\u0003\u000er\b\u000e\u0001\u000e\u0005\u000e"+
		"u\b\u000e\n\u000e\f\u000ex\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f}\b\u000f\n\u000f\f\u000f\u0080\t\u000f\u0001\u000f\u0000"+
		"\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e\u0000\u0000\u0080\u0000 \u0001\u0000\u0000\u0000"+
		"\u0002+\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00062"+
		"\u0001\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000"+
		"\u0000\fE\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010"+
		"L\u0001\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014S\u0001"+
		"\u0000\u0000\u0000\u0016W\u0001\u0000\u0000\u0000\u0018Z\u0001\u0000\u0000"+
		"\u0000\u001a^\u0001\u0000\u0000\u0000\u001cn\u0001\u0000\u0000\u0000\u001e"+
		"y\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000!#\u0005\u0014\u0000"+
		"\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&(\u0003"+
		"\b\u0004\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'"+
		"\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0001\u0001\u0000"+
		"\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0005"+
		"\u0002\u0000\u0000./\u0003\u0006\u0003\u0000/\u0003\u0001\u0000\u0000"+
		"\u000001\u0005\u0003\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0005"+
		"\u0004\u0000\u00003\u0007\u0001\u0000\u0000\u000045\u0005\u0004\u0000"+
		"\u000056\u0005\u0005\u0000\u000068\u0003\n\u0005\u000079\u0005\u0014\u0000"+
		"\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;\t\u0001\u0000\u0000\u0000<D\u0003"+
		"\f\u0006\u0000=D\u0003\u000e\u0007\u0000>D\u0003\u0010\b\u0000?D\u0003"+
		"\u0012\t\u0000@D\u0003\u0014\n\u0000AD\u0003\u0016\u000b\u0000BD\u0003"+
		"\u0018\f\u0000C<\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C>\u0001"+
		"\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u000b\u0001\u0000"+
		"\u0000\u0000EF\u0005\u0004\u0000\u0000FG\u0005\u0006\u0000\u0000GH\u0005"+
		"\u0004\u0000\u0000H\r\u0001\u0000\u0000\u0000IJ\u0003\f\u0006\u0000JK"+
		"\u0005\u0007\u0000\u0000K\u000f\u0001\u0000\u0000\u0000LM\u0003\u000e"+
		"\u0007\u0000MN\u0005\u0006\u0000\u0000NO\u0005\u0004\u0000\u0000O\u0011"+
		"\u0001\u0000\u0000\u0000PQ\u0003\f\u0006\u0000QR\u0005\b\u0000\u0000R"+
		"\u0013\u0001\u0000\u0000\u0000ST\u0003\f\u0006\u0000TU\u0005\t\u0000\u0000"+
		"UV\u0005\u0004\u0000\u0000V\u0015\u0001\u0000\u0000\u0000WX\u0003\u0014"+
		"\n\u0000XY\u0005\n\u0000\u0000Y\u0017\u0001\u0000\u0000\u0000Z[\u0005"+
		"\u000b\u0000\u0000[\\\u0003\u001a\r\u0000\\]\u0005\u000b\u0000\u0000]"+
		"\u0019\u0001\u0000\u0000\u0000^b\u0005\f\u0000\u0000_a\u0005\u0011\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000eg\u0003\u001c\u000e\u0000fe\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jk\u0005\r\u0000\u0000k\u001b\u0001\u0000"+
		"\u0000\u0000lo\u0005\f\u0000\u0000mo\u0003\u001e\u000f\u0000nl\u0001\u0000"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pr\u0005"+
		"\u0012\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rv\u0001\u0000\u0000\u0000su\u0005\r\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w\u001d\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y~\u0005"+
		"\f\u0000\u0000z{\u0005\u0014\u0000\u0000{}\u0005\f\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u001f\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\n$):Cbhnqv~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}