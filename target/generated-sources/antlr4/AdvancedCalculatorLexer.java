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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NUMBER=15, VARIABLE=16, 
		STRING=17, DIGIT=18, NEWLINE=19, CHARACTER=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "NUMBER", "VARIABLE", "STRING", 
		"DIGIT", "NEWLINE", "CHARACTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'out'", "':'", "'foreach '", "'in '", "' do '", "'('", "')'", 
		"'*'", "'/'", "'+'", "'-'", "'list('", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NUMBER", "VARIABLE", "STRING", "DIGIT", "NEWLINE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\20\7\20]\n\20\f\20\16\20`\13\20\3\20"+
		"\3\20\6\20d\n\20\r\20\16\20e\3\20\6\20i\n\20\r\20\16\20j\5\20m\n\20\3"+
		"\21\6\21p\n\21\r\21\16\21q\3\22\3\22\3\22\7\22w\n\22\f\22\16\22z\13\22"+
		"\3\22\3\22\3\23\3\23\3\24\5\24\u0081\n\24\3\24\3\24\3\25\5\25\u0086\n"+
		"\25\3\26\6\26\u0089\n\26\r\26\16\26\u008a\3\26\3\26\2\2\27\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27\3\2\5\4\2\13\13\"\"\3\2\62;\4\2C\\c|\2\u0096\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\63\3"+
		"\2\2\2\t\65\3\2\2\2\13>\3\2\2\2\rB\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23"+
		"K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35Y\3\2\2\2"+
		"\37l\3\2\2\2!o\3\2\2\2#s\3\2\2\2%}\3\2\2\2\'\u0080\3\2\2\2)\u0085\3\2"+
		"\2\2+\u0088\3\2\2\2-.\7?\2\2.\4\3\2\2\2/\60\7q\2\2\60\61\7w\2\2\61\62"+
		"\7v\2\2\62\6\3\2\2\2\63\64\7<\2\2\64\b\3\2\2\2\65\66\7h\2\2\66\67\7q\2"+
		"\2\678\7t\2\289\7g\2\29:\7c\2\2:;\7e\2\2;<\7j\2\2<=\7\"\2\2=\n\3\2\2\2"+
		">?\7k\2\2?@\7p\2\2@A\7\"\2\2A\f\3\2\2\2BC\7\"\2\2CD\7f\2\2DE\7q\2\2EF"+
		"\7\"\2\2F\16\3\2\2\2GH\7*\2\2H\20\3\2\2\2IJ\7+\2\2J\22\3\2\2\2KL\7,\2"+
		"\2L\24\3\2\2\2MN\7\61\2\2N\26\3\2\2\2OP\7-\2\2P\30\3\2\2\2QR\7/\2\2R\32"+
		"\3\2\2\2ST\7n\2\2TU\7k\2\2UV\7u\2\2VW\7v\2\2WX\7*\2\2X\34\3\2\2\2YZ\7"+
		".\2\2Z\36\3\2\2\2[]\5%\23\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2"+
		"_a\3\2\2\2`^\3\2\2\2ac\7\60\2\2bd\5%\23\2cb\3\2\2\2de\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2fm\3\2\2\2gi\5%\23\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2"+
		"\2km\3\2\2\2l^\3\2\2\2lh\3\2\2\2m \3\2\2\2np\5)\25\2on\3\2\2\2pq\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2r\"\3\2\2\2sx\7$\2\2tw\t\2\2\2uw\5)\25\2vt\3\2\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7$\2"+
		"\2|$\3\2\2\2}~\t\3\2\2~&\3\2\2\2\177\u0081\7\17\2\2\u0080\177\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\f\2\2\u0083(\3"+
		"\2\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086*\3\2\2\2\u0087\u0089"+
		"\t\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\26\2\2\u008d,\3\2\2\2"+
		"\r\2^ejlqvx\u0080\u0085\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}