// Generated from AdvancedCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdvancedCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUMBER=16, 
		VARIABLE=17, STRING=18, DIGIT=19, NEWLINE=20, CHARACTER=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "NUMBER", "VARIABLE", 
		"STRING", "DIGIT", "NEWLINE", "CHARACTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "','", "')'", "':'", "'.'", "'out'", "'foreach '", 
		"'in '", "' do '", "'*'", "'/'", "'+'", "'-'", "'list('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NUMBER", "VARIABLE", "STRING", "DIGIT", "NEWLINE", 
		"CHARACTER", "WS"
	};
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


	public AdvancedCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AdvancedCalculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\7\21a\n\21"+
		"\f\21\16\21d\13\21\3\21\3\21\6\21h\n\21\r\21\16\21i\3\21\6\21m\n\21\r"+
		"\21\16\21n\5\21q\n\21\3\22\6\22t\n\22\r\22\16\22u\3\23\3\23\3\23\7\23"+
		"{\n\23\f\23\16\23~\13\23\3\23\3\23\3\24\3\24\3\25\5\25\u0085\n\25\3\25"+
		"\3\25\3\26\5\26\u008a\n\26\3\27\6\27\u008d\n\27\r\27\16\27\u008e\3\27"+
		"\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\5\4\2\13\13\"\"\3"+
		"\2\62;\4\2C\\c|\2\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67"+
		"\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21?\3\2\2\2\23H\3\2\2\2\25L\3\2\2\2\27"+
		"Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35W\3\2\2\2\37Y\3\2\2\2!p\3\2\2\2#s"+
		"\3\2\2\2%w\3\2\2\2\'\u0081\3\2\2\2)\u0084\3\2\2\2+\u0089\3\2\2\2-\u008c"+
		"\3\2\2\2/\60\7?\2\2\60\4\3\2\2\2\61\62\7*\2\2\62\6\3\2\2\2\63\64\7.\2"+
		"\2\64\b\3\2\2\2\65\66\7+\2\2\66\n\3\2\2\2\678\7<\2\28\f\3\2\2\29:\7\60"+
		"\2\2:\16\3\2\2\2;<\7q\2\2<=\7w\2\2=>\7v\2\2>\20\3\2\2\2?@\7h\2\2@A\7q"+
		"\2\2AB\7t\2\2BC\7g\2\2CD\7c\2\2DE\7e\2\2EF\7j\2\2FG\7\"\2\2G\22\3\2\2"+
		"\2HI\7k\2\2IJ\7p\2\2JK\7\"\2\2K\24\3\2\2\2LM\7\"\2\2MN\7f\2\2NO\7q\2\2"+
		"OP\7\"\2\2P\26\3\2\2\2QR\7,\2\2R\30\3\2\2\2ST\7\61\2\2T\32\3\2\2\2UV\7"+
		"-\2\2V\34\3\2\2\2WX\7/\2\2X\36\3\2\2\2YZ\7n\2\2Z[\7k\2\2[\\\7u\2\2\\]"+
		"\7v\2\2]^\7*\2\2^ \3\2\2\2_a\5\'\24\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc"+
		"\3\2\2\2ce\3\2\2\2db\3\2\2\2eg\7\60\2\2fh\5\'\24\2gf\3\2\2\2hi\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2jq\3\2\2\2km\5\'\24\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2oq\3\2\2\2pb\3\2\2\2pl\3\2\2\2q\"\3\2\2\2rt\5+\26\2sr\3\2"+
		"\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v$\3\2\2\2w|\7$\2\2x{\t\2\2\2y{\5+\26"+
		"\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3"+
		"\2\2\2\177\u0080\7$\2\2\u0080&\3\2\2\2\u0081\u0082\t\3\2\2\u0082(\3\2"+
		"\2\2\u0083\u0085\7\17\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\7\f\2\2\u0087*\3\2\2\2\u0088\u008a\t\4\2\2"+
		"\u0089\u0088\3\2\2\2\u008a,\3\2\2\2\u008b\u008d\t\2\2\2\u008c\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\b\27\2\2\u0091.\3\2\2\2\r\2binpuz|\u0084\u0089"+
		"\u008e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}