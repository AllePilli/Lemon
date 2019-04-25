// Generated from Lemon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LemonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IF=3, ELSEIF=4, ELSE=5, AND=6, OR=7, TRUE=8, FALSE=9, 
		MULT=10, DIV=11, MOD=12, PLUS=13, MINUS=14, GT=15, GE=16, LT=17, LE=18, 
		EQ=19, NE=20, FLOAT=21, INT=22, STR=23, NUL=24, TYPE=25, IDENTIFIER=26, 
		LPAREN=27, RPAREN=28, LBRACKET=29, RBRACKET=30, SEMI=31, COMMENT=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "IF", "ELSEIF", "ELSE", "AND", "OR", "TRUE", "FALSE", 
			"MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "GE", "LT", "LE", "EQ", 
			"NE", "FLOAT", "INT", "STR", "NUL", "TYPE", "IDENTIFIER", "LPAREN", "RPAREN", 
			"LBRACKET", "RBRACKET", "SEMI", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'show'", "'if'", "'else if'", "'else'", "'and'", "'or'", 
			"'true'", "'false'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", null, null, null, "'nul'", null, null, 
			"'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IF", "ELSEIF", "ELSE", "AND", "OR", "TRUE", "FALSE", 
			"MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "GE", "LT", "LE", "EQ", 
			"NE", "FLOAT", "INT", "STR", "NUL", "TYPE", "IDENTIFIER", "LPAREN", "RPAREN", 
			"LBRACKET", "RBRACKET", "SEMI", "COMMENT", "WS"
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


	public LemonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lemon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\5\26\u008a\n\26\3\26\6\26\u008d\n\26\r\26"+
		"\16\26\u008e\3\26\3\26\6\26\u0093\n\26\r\26\16\26\u0094\5\26\u0097\n\26"+
		"\3\27\5\27\u009a\n\27\3\27\3\27\6\27\u009e\n\27\r\27\16\27\u009f\3\30"+
		"\3\30\7\30\u00a4\n\30\f\30\16\30\u00a7\13\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00b8\n\32\3\33"+
		"\3\33\7\33\u00bc\n\33\f\33\16\33\u00bf\13\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\6!\u00cf\n!\r!\16!\u00d0\3!\5!\u00d4"+
		"\n!\3!\3!\3\"\6\"\u00d9\n\"\r\"\16\"\u00da\3\"\3\"\3\u00d0\2#\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#\3\2\t\3\2\62;\3\2\63;\5\2\f\f\17\17$$\5\2C\\aac|\6\2\62;C\\aac|\3\3"+
		"\f\f\5\2\13\f\16\17\"\"\2\u00e8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7L\3\2\2\2\tO\3\2\2\2\13W\3\2\2\2\r"+
		"\\\3\2\2\2\17`\3\2\2\2\21c\3\2\2\2\23h\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2"+
		"\31r\3\2\2\2\33t\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#}\3\2\2\2%"+
		"\177\3\2\2\2\'\u0082\3\2\2\2)\u0085\3\2\2\2+\u0089\3\2\2\2-\u0099\3\2"+
		"\2\2/\u00a1\3\2\2\2\61\u00aa\3\2\2\2\63\u00b7\3\2\2\2\65\u00b9\3\2\2\2"+
		"\67\u00c0\3\2\2\29\u00c2\3\2\2\2;\u00c4\3\2\2\2=\u00c6\3\2\2\2?\u00c8"+
		"\3\2\2\2A\u00ca\3\2\2\2C\u00d8\3\2\2\2EF\7?\2\2F\4\3\2\2\2GH\7u\2\2HI"+
		"\7j\2\2IJ\7q\2\2JK\7y\2\2K\6\3\2\2\2LM\7k\2\2MN\7h\2\2N\b\3\2\2\2OP\7"+
		"g\2\2PQ\7n\2\2QR\7u\2\2RS\7g\2\2ST\7\"\2\2TU\7k\2\2UV\7h\2\2V\n\3\2\2"+
		"\2WX\7g\2\2XY\7n\2\2YZ\7u\2\2Z[\7g\2\2[\f\3\2\2\2\\]\7c\2\2]^\7p\2\2^"+
		"_\7f\2\2_\16\3\2\2\2`a\7q\2\2ab\7t\2\2b\20\3\2\2\2cd\7v\2\2de\7t\2\2e"+
		"f\7w\2\2fg\7g\2\2g\22\3\2\2\2hi\7h\2\2ij\7c\2\2jk\7n\2\2kl\7u\2\2lm\7"+
		"g\2\2m\24\3\2\2\2no\7,\2\2o\26\3\2\2\2pq\7\61\2\2q\30\3\2\2\2rs\7\'\2"+
		"\2s\32\3\2\2\2tu\7-\2\2u\34\3\2\2\2vw\7/\2\2w\36\3\2\2\2xy\7@\2\2y \3"+
		"\2\2\2z{\7@\2\2{|\7?\2\2|\"\3\2\2\2}~\7>\2\2~$\3\2\2\2\177\u0080\7>\2"+
		"\2\u0080\u0081\7?\2\2\u0081&\3\2\2\2\u0082\u0083\7?\2\2\u0083\u0084\7"+
		"?\2\2\u0084(\3\2\2\2\u0085\u0086\7#\2\2\u0086\u0087\7?\2\2\u0087*\3\2"+
		"\2\2\u0088\u008a\7/\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u008d\t\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0096\3\2\2\2\u0090"+
		"\u0092\7\60\2\2\u0091\u0093\t\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0090\3\2\2\2\u0096\u0097\3\2\2\2\u0097,\3\2\2\2\u0098\u009a\7/\2\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\t\3"+
		"\2\2\u009c\u009e\t\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0.\3\2\2\2\u00a1\u00a5\7$\2\2\u00a2"+
		"\u00a4\n\4\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7$\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7w\2\2\u00ac"+
		"\u00ad\7n\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0"+
		"\u00b8\7v\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2"+
		"\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b8\7i\2\2\u00b7\u00ae"+
		"\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b8\64\3\2\2\2\u00b9\u00bd\t\5\2\2\u00ba"+
		"\u00bc\t\6\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\66\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1"+
		"\7*\2\2\u00c18\3\2\2\2\u00c2\u00c3\7+\2\2\u00c3:\3\2\2\2\u00c4\u00c5\7"+
		"}\2\2\u00c5<\3\2\2\2\u00c6\u00c7\7\177\2\2\u00c7>\3\2\2\2\u00c8\u00c9"+
		"\7=\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\7\61\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00cf\13\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d4\t\7\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b!"+
		"\2\2\u00d6B\3\2\2\2\u00d7\u00d9\t\b\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\b\"\2\2\u00ddD\3\2\2\2\17\2\u0089\u008e\u0094\u0096\u0099\u009f"+
		"\u00a5\u00b7\u00bd\u00d0\u00d3\u00da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}