// Generated from C:/Users/joelm/Desktop/Projeto_ELP/src/main/XML.g4 by ANTLR 4.13.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		FOREACH=10, ARGUMENTO=11, STRING=12, ARR=13, VAR=14, TAG=15, TAGFOREACH=16, 
		SELFCLOSINGTAG_FOREACH=17, SELFCLOSINGTAG=18, ENDTAG=19, ATTRIBUTE=20, 
		TAGNAME=21, SPACE=22, VALUE=23, PARAMETER=24, NEWLINE=25;
	public static final int
		RULE_xql = 0, RULE_instructions = 1, RULE_init = 2, RULE_assign = 3, RULE_dotX = 4, 
		RULE_function = 5, RULE_xml = 6, RULE_xmlfile = 7, RULE_line = 8, RULE_save = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"xql", "instructions", "init", "assign", "dotX", "function", "xml", "xmlfile", 
			"line", "save"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'load'", "'to'", "'='", "'.'", "'#'", "'->'", "'++'", "'***'", 
			"'save'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "FOREACH", 
			"ARGUMENTO", "STRING", "ARR", "VAR", "TAG", "TAGFOREACH", "SELFCLOSINGTAG_FOREACH", 
			"SELFCLOSINGTAG", "ENDTAG", "ATTRIBUTE", "TAGNAME", "SPACE", "VALUE", 
			"PARAMETER", "NEWLINE"
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
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				instructions();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4610L) != 0) );
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
	public static class InstructionsContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public SaveContext save() {
			return getRuleContext(SaveContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				init();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				assign();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				save();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode ARGUMENTO() { return getToken(XMLParser.ARGUMENTO, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
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
		enterRule(_localctx, 4, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			match(ARGUMENTO);
			setState(32);
			match(T__1);
			setState(33);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(STRING);
			setState(36);
			match(T__2);
			setState(37);
			function();
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
		enterRule(_localctx, 8, RULE_dotX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(STRING);
			setState(40);
			match(T__3);
			setState(41);
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
	public static class FunctionContext extends ParserRuleContext {
		public DotXContext dotX() {
			return getRuleContext(DotXContext.class,0);
		}
		public TerminalNode ARR() { return getToken(XMLParser.ARR, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public XmlContext xml() {
			return getRuleContext(XmlContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				dotX();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				dotX();
				setState(45);
				match(ARR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				dotX();
				setState(48);
				match(ARR);
				setState(49);
				match(T__3);
				setState(50);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				dotX();
				setState(53);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				dotX();
				setState(56);
				match(T__5);
				setState(57);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				dotX();
				setState(60);
				match(T__5);
				setState(61);
				match(STRING);
				setState(62);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
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
	public static class XmlContext extends ParserRuleContext {
		public XmlfileContext xmlfile() {
			return getRuleContext(XmlfileContext.class,0);
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
		enterRule(_localctx, 12, RULE_xml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__7);
			setState(68);
			xmlfile();
			setState(69);
			match(T__7);
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
	public static class XmlfileContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public XmlfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterXmlfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitXmlfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitXmlfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlfileContext xmlfile() throws RecognitionException {
		XmlfileContext _localctx = new XmlfileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_xmlfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				line();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0) );
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
		public TerminalNode VALUE() { return getToken(XMLParser.VALUE, 0); }
		public TerminalNode ENDTAG() { return getToken(XMLParser.ENDTAG, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode SELFCLOSINGTAG() { return getToken(XMLParser.SELFCLOSINGTAG, 0); }
		public TerminalNode SELFCLOSINGTAG_FOREACH() { return getToken(XMLParser.SELFCLOSINGTAG_FOREACH, 0); }
		public TerminalNode TAGFOREACH() { return getToken(XMLParser.TAGFOREACH, 0); }
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
		enterRule(_localctx, 16, RULE_line);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(76);
				match(TAG);
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VALUE:
					{
					setState(77);
					match(VALUE);
					}
					break;
				case TAG:
				case TAGFOREACH:
				case SELFCLOSINGTAG_FOREACH:
				case SELFCLOSINGTAG:
				case ENDTAG:
					{
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) {
						{
						{
						setState(78);
						line();
						}
						}
						setState(83);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(86);
				match(ENDTAG);
				}
				}
				}
				break;
			case SELFCLOSINGTAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(SELFCLOSINGTAG);
				}
				break;
			case SELFCLOSINGTAG_FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(SELFCLOSINGTAG_FOREACH);
				}
				break;
			case TAGFOREACH:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(TAGFOREACH);
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VALUE:
					{
					setState(90);
					match(VALUE);
					}
					break;
				case TAG:
				case TAGFOREACH:
				case SELFCLOSINGTAG_FOREACH:
				case SELFCLOSINGTAG:
				case ENDTAG:
					{
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) {
						{
						{
						setState(91);
						line();
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99);
				match(ENDTAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SaveContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public TerminalNode ARGUMENTO() { return getToken(XMLParser.ARGUMENTO, 0); }
		public SaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).enterSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLListener ) ((XMLListener)listener).exitSave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLVisitor ) return ((XMLVisitor<? extends T>)visitor).visitSave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaveContext save() throws RecognitionException {
		SaveContext _localctx = new SaveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__8);
			setState(103);
			match(STRING);
			setState(104);
			match(T__1);
			setState(105);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019l\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001d"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005B\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0004\u0007I\b\u0007\u000b\u0007\f\u0007J\u0001\b\u0001\b\u0001"+
		"\b\u0005\bP\b\b\n\b\f\bS\t\b\u0003\bU\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b]\b\b\n\b\f\b`\t\b\u0003\bb\b\b\u0001\b\u0003"+
		"\be\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000r\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004\u001e"+
		"\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b\'\u0001\u0000"+
		"\u0000\u0000\nA\u0001\u0000\u0000\u0000\fC\u0001\u0000\u0000\u0000\u000e"+
		"H\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012f\u0001"+
		"\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0001\u0001"+
		"\u0000\u0000\u0000\u0019\u001d\u0003\u0004\u0002\u0000\u001a\u001d\u0003"+
		"\u0006\u0003\u0000\u001b\u001d\u0003\u0012\t\u0000\u001c\u0019\u0001\u0000"+
		"\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001"+
		"\u0000\u0000\u001f \u0005\u000b\u0000\u0000 !\u0005\u0002\u0000\u0000"+
		"!\"\u0005\f\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#$\u0005\f\u0000"+
		"\u0000$%\u0005\u0003\u0000\u0000%&\u0003\n\u0005\u0000&\u0007\u0001\u0000"+
		"\u0000\u0000\'(\u0005\f\u0000\u0000()\u0005\u0004\u0000\u0000)*\u0005"+
		"\f\u0000\u0000*\t\u0001\u0000\u0000\u0000+B\u0003\b\u0004\u0000,-\u0003"+
		"\b\u0004\u0000-.\u0005\r\u0000\u0000.B\u0001\u0000\u0000\u0000/0\u0003"+
		"\b\u0004\u000001\u0005\r\u0000\u000012\u0005\u0004\u0000\u000023\u0005"+
		"\f\u0000\u00003B\u0001\u0000\u0000\u000045\u0003\b\u0004\u000056\u0005"+
		"\u0005\u0000\u00006B\u0001\u0000\u0000\u000078\u0003\b\u0004\u000089\u0005"+
		"\u0006\u0000\u00009:\u0005\f\u0000\u0000:B\u0001\u0000\u0000\u0000;<\u0003"+
		"\b\u0004\u0000<=\u0005\u0006\u0000\u0000=>\u0005\f\u0000\u0000>?\u0005"+
		"\u0007\u0000\u0000?B\u0001\u0000\u0000\u0000@B\u0003\f\u0006\u0000A+\u0001"+
		"\u0000\u0000\u0000A,\u0001\u0000\u0000\u0000A/\u0001\u0000\u0000\u0000"+
		"A4\u0001\u0000\u0000\u0000A7\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000B\u000b\u0001\u0000\u0000\u0000CD\u0005"+
		"\b\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0005\b\u0000\u0000F\r\u0001"+
		"\u0000\u0000\u0000GI\u0003\u0010\b\u0000HG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K\u000f\u0001\u0000\u0000\u0000LT\u0005\u000f\u0000\u0000MU\u0005\u0017"+
		"\u0000\u0000NP\u0003\u0010\b\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000"+
		"TQ\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000Ve\u0005\u0013\u0000"+
		"\u0000We\u0005\u0012\u0000\u0000Xe\u0005\u0011\u0000\u0000Ya\u0005\u0010"+
		"\u0000\u0000Zb\u0005\u0017\u0000\u0000[]\u0003\u0010\b\u0000\\[\u0001"+
		"\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000aZ\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0005\u0013\u0000\u0000dL\u0001\u0000\u0000\u0000dW\u0001"+
		"\u0000\u0000\u0000dX\u0001\u0000\u0000\u0000dY\u0001\u0000\u0000\u0000"+
		"e\u0011\u0001\u0000\u0000\u0000fg\u0005\t\u0000\u0000gh\u0005\f\u0000"+
		"\u0000hi\u0005\u0002\u0000\u0000ij\u0005\u000b\u0000\u0000j\u0013\u0001"+
		"\u0000\u0000\u0000\t\u0017\u001cAJQT^ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}