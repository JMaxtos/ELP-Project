// Generated from C:/Users/joelm/Desktop/Projeto_ELP/src/main/xml.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class xmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG=1, ENDTAG=2, ATTRIBUTE=3, ATTRIBUTE_NAME=4, SPACE=5, VALUE=6, PARAMETER=7, 
		NEWLINE=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAG", "ENDTAG", "ATTRIBUTE", "ATTRIBUTE_NAME", "SPACE", "VALUE", "PARAMETER", 
			"NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG", "ENDTAG", "ATTRIBUTE", "ATTRIBUTE_NAME", "SPACE", "VALUE", 
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


	public xmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xml.g4"; }

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
		"\u0004\u0000\bm\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000"+
		"\f\u0000\u0015\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0004"+
		"\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d\u0005\u0000 \b\u0000\n"+
		"\u0000\f\u0000#\t\u0000\u0001\u0000\u0005\u0000&\b\u0000\n\u0000\f\u0000"+
		")\t\u0000\u0001\u0000\u0003\u0000,\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u00013\b\u0001\u000b\u0001\f\u0001"+
		"4\u0001\u0001\u0003\u00018\b\u0001\u0001\u0001\u0004\u0001;\b\u0001\u000b"+
		"\u0001\f\u0001<\u0005\u0001?\b\u0001\n\u0001\f\u0001B\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003"+
		"\u0001\u0004\u0004\u0004S\b\u0004\u000b\u0004\f\u0004T\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0004\u0005Z\b\u0005\u000b\u0005\f\u0005[\u0001\u0006"+
		"\u0001\u0006\u0005\u0006`\b\u0006\n\u0006\f\u0006c\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007j\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0005\u0001"+
		"\u0000az\u0004\u0000::AZ__az\u0005\u0000-.0:AZ__az\u0001\u000009\u0003"+
		"\u0000\n\n\r\r\"\"{\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000"+
		"\u0005E\u0001\u0000\u0000\u0000\u0007J\u0001\u0000\u0000\u0000\tR\u0001"+
		"\u0000\u0000\u0000\u000bY\u0001\u0000\u0000\u0000\r]\u0001\u0000\u0000"+
		"\u0000\u000fi\u0001\u0000\u0000\u0000\u0011\u0013\u0005<\u0000\u0000\u0012"+
		"\u0014\u0007\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016!\u0001\u0000\u0000\u0000\u0017\u0019"+
		"\u0005-\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0018\u0019\u0001"+
		"\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u001c\u0007"+
		"\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u0018\u0001\u0000"+
		"\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"\'\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000$&\u0003\u0005\u0002\u0000%$\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*,\u0005/\u0000\u0000"+
		"+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0005>\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005<\u0000"+
		"\u000002\u0005/\u0000\u000013\u0007\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u00005@\u0001\u0000\u0000\u000068\u0005-\u0000\u000076\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u00009;\u0007"+
		"\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000"+
		"\u0000>7\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CD\u0005>\u0000\u0000D\u0004\u0001\u0000\u0000\u0000"+
		"EF\u0005 \u0000\u0000FG\u0003\u0007\u0003\u0000GH\u0005=\u0000\u0000H"+
		"I\u0003\r\u0006\u0000I\u0006\u0001\u0000\u0000\u0000JN\u0007\u0001\u0000"+
		"\u0000KM\u0007\u0002\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\b\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0005 \u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u0004\u0000"+
		"\u0000W\n\u0001\u0000\u0000\u0000XZ\u0007\u0003\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\f\u0001\u0000\u0000\u0000]a\u0005\"\u0000\u0000^"+
		"`\b\u0004\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000de\u0005\"\u0000\u0000e\u000e\u0001\u0000"+
		"\u0000\u0000fj\u0005\n\u0000\u0000gh\u0005\r\u0000\u0000hj\u0005\n\u0000"+
		"\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000kl\u0006\u0007\u0000\u0000l\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u0000\u0015\u0018\u001d!\'+47<@NT[ai\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}