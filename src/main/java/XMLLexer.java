// Generated from C:/Users/migue/IdeaProjects/Projeto_XQL/src/main/XML.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class XMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOAD=1, TO=2, ARGUMENTO=3, STRING=4, EQUAL=5, DOT=6, ARR=7, HASH=8, MAP=9, 
		PP=10, START=11, TAG=12, ENDTAG=13, ATTRIBUTE=14, TAGNAME=15, ATTRIBUTE_NAME=16, 
		SPACE=17, VALUE=18, PARAMETER=19, NEWLINE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOAD", "TO", "ARGUMENTO", "STRING", "EQUAL", "DOT", "ARR", "HASH", "MAP", 
			"PP", "START", "TAG", "ENDTAG", "ATTRIBUTE", "TAGNAME", "ATTRIBUTE_NAME", 
			"SPACE", "VALUE", "PARAMETER", "NEWLINE"
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


	public XMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0004\u00024\b\u0002\u000b\u0002\f\u00025\u0001"+
		"\u0003\u0004\u00039\b\u0003\u000b\u0003\f\u0003:\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006C\b\u0006"+
		"\u000b\u0006\f\u0006D\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bX\b\u000b\n"+
		"\u000b\f\u000b[\t\u000b\u0001\u000b\u0003\u000b^\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0004\u000em\b\u000e\u000b\u000e\f\u000e"+
		"n\u0001\u000e\u0003\u000er\b\u000e\u0001\u000e\u0004\u000eu\b\u000e\u000b"+
		"\u000e\f\u000ev\u0005\u000ey\b\u000e\n\u000e\f\u000e|\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0080\b\u000f\n\u000f\f\u000f\u0083\t\u000f\u0001"+
		"\u0010\u0004\u0010\u0086\b\u0010\u000b\u0010\f\u0010\u0087\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011\u008d\b\u0011\u000b\u0011\f\u0011"+
		"\u008e\u0001\u0012\u0001\u0012\u0005\u0012\u0093\b\u0012\n\u0012\f\u0012"+
		"\u0096\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u009e\b\u0013\u0001\u0013\u0001\u0013\u0000\u0000"+
		"\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0005"+
		"\u0001\u000009\u0001\u0000az\u0004\u0000::AZ__az\u0005\u0000-.0:AZ__a"+
		"z\u0003\u0000\n\n\r\r\"\"\u00af\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0001)\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000\u00051"+
		"\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\t<\u0001\u0000"+
		"\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000\u0000"+
		"\u000fH\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013M"+
		"\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017T\u0001\u0000"+
		"\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bf\u0001\u0000\u0000\u0000"+
		"\u001dl\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u0085"+
		"\u0001\u0000\u0000\u0000#\u008c\u0001\u0000\u0000\u0000%\u0090\u0001\u0000"+
		"\u0000\u0000\'\u009d\u0001\u0000\u0000\u0000)*\u0005l\u0000\u0000*+\u0005"+
		"o\u0000\u0000+,\u0005a\u0000\u0000,-\u0005d\u0000\u0000-\u0002\u0001\u0000"+
		"\u0000\u0000./\u0005t\u0000\u0000/0\u0005o\u0000\u00000\u0004\u0001\u0000"+
		"\u0000\u000013\u0005$\u0000\u000024\u0007\u0000\u0000\u000032\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0006\u0001\u0000\u0000\u000079\u0007\u0001\u0000"+
		"\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;\b\u0001\u0000\u0000\u0000<=\u0005"+
		"=\u0000\u0000=\n\u0001\u0000\u0000\u0000>?\u0005.\u0000\u0000?\f\u0001"+
		"\u0000\u0000\u0000@B\u0005[\u0000\u0000AC\u0007\u0000\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005]\u0000\u0000"+
		"G\u000e\u0001\u0000\u0000\u0000HI\u0005#\u0000\u0000I\u0010\u0001\u0000"+
		"\u0000\u0000JK\u0005-\u0000\u0000KL\u0005>\u0000\u0000L\u0012\u0001\u0000"+
		"\u0000\u0000MN\u0005+\u0000\u0000NO\u0005+\u0000\u0000O\u0014\u0001\u0000"+
		"\u0000\u0000PQ\u0005*\u0000\u0000QR\u0005*\u0000\u0000RS\u0005*\u0000"+
		"\u0000S\u0016\u0001\u0000\u0000\u0000TU\u0005<\u0000\u0000UY\u0003\u001d"+
		"\u000e\u0000VX\u0003\u001b\r\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0005/\u0000\u0000]\\"+
		"\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_`\u0005>\u0000\u0000`\u0018\u0001\u0000\u0000\u0000ab\u0005<\u0000"+
		"\u0000bc\u0005/\u0000\u0000cd\u0003\u001d\u000e\u0000de\u0005>\u0000\u0000"+
		"e\u001a\u0001\u0000\u0000\u0000fg\u0005 \u0000\u0000gh\u0003\u001f\u000f"+
		"\u0000hi\u0005=\u0000\u0000ij\u0003%\u0012\u0000j\u001c\u0001\u0000\u0000"+
		"\u0000km\u0007\u0001\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oz\u0001"+
		"\u0000\u0000\u0000pr\u0005-\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000su\u0007\u0001\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xq\u0001\u0000"+
		"\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u001e\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000}\u0081\u0007\u0002\u0000\u0000~\u0080\u0007\u0003\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082 \u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u0005"+
		" \u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0006\u0010"+
		"\u0000\u0000\u008a\"\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0000\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f$\u0001\u0000\u0000\u0000\u0090\u0094\u0005\"\u0000\u0000"+
		"\u0091\u0093\b\u0004\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\"\u0000\u0000\u0098&"+
		"\u0001\u0000\u0000\u0000\u0099\u009e\u0005\n\u0000\u0000\u009a\u009b\u0005"+
		"\r\u0000\u0000\u009b\u009e\u0005\n\u0000\u0000\u009c\u009e\u0005\t\u0000"+
		"\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0006\u0013\u0000\u0000\u00a0(\u0001\u0000\u0000\u0000"+
		"\u000f\u00005:DY]nqvz\u0081\u0087\u008e\u0094\u009d\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}