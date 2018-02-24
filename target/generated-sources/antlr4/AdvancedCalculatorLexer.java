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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NUMBER=18, VARIABLE=19, STRING=20, DIGIT=21, NEWLINE=22, CHARACTER=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"NUMBER", "VARIABLE", "STRING", "DIGIT", "NEWLINE", "CHARACTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "','", "')'", "':'", "'.'", "'out: '", "'foreach '", 
		"'in '", "' do '", "'*'", "'/'", "'+'", "'-'", "'list('", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "NUMBER", "VARIABLE", "STRING", "DIGIT", 
		"NEWLINE", "CHARACTER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\7\23k\n\23\f\23\16\23n\13\23\3\23"+
		"\3\23\6\23r\n\23\r\23\16\23s\3\23\6\23w\n\23\r\23\16\23x\5\23{\n\23\3"+
		"\24\6\24~\n\24\r\24\16\24\177\3\25\3\25\3\25\7\25\u0085\n\25\f\25\16\25"+
		"\u0088\13\25\3\25\3\25\3\26\3\26\3\27\5\27\u008f\n\27\3\27\3\27\3\30\5"+
		"\30\u0094\n\30\3\31\6\31\u0097\n\31\r\31\16\31\u0098\3\31\3\31\2\2\32"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\5\4\2\13\13\"\"\3\2"+
		"\62;\4\2C\\c|\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3"+
		"\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21E\3\2\2\2\23N\3"+
		"\2\2\2\25R\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37"+
		"_\3\2\2\2!e\3\2\2\2#g\3\2\2\2%z\3\2\2\2\'}\3\2\2\2)\u0081\3\2\2\2+\u008b"+
		"\3\2\2\2-\u008e\3\2\2\2/\u0093\3\2\2\2\61\u0096\3\2\2\2\63\64\7?\2\2\64"+
		"\4\3\2\2\2\65\66\7*\2\2\66\6\3\2\2\2\678\7.\2\28\b\3\2\2\29:\7+\2\2:\n"+
		"\3\2\2\2;<\7<\2\2<\f\3\2\2\2=>\7\60\2\2>\16\3\2\2\2?@\7q\2\2@A\7w\2\2"+
		"AB\7v\2\2BC\7<\2\2CD\7\"\2\2D\20\3\2\2\2EF\7h\2\2FG\7q\2\2GH\7t\2\2HI"+
		"\7g\2\2IJ\7c\2\2JK\7e\2\2KL\7j\2\2LM\7\"\2\2M\22\3\2\2\2NO\7k\2\2OP\7"+
		"p\2\2PQ\7\"\2\2Q\24\3\2\2\2RS\7\"\2\2ST\7f\2\2TU\7q\2\2UV\7\"\2\2V\26"+
		"\3\2\2\2WX\7,\2\2X\30\3\2\2\2YZ\7\61\2\2Z\32\3\2\2\2[\\\7-\2\2\\\34\3"+
		"\2\2\2]^\7/\2\2^\36\3\2\2\2_`\7n\2\2`a\7k\2\2ab\7u\2\2bc\7v\2\2cd\7*\2"+
		"\2d \3\2\2\2ef\7]\2\2f\"\3\2\2\2gh\7_\2\2h$\3\2\2\2ik\5+\26\2ji\3\2\2"+
		"\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2oq\7\60\2\2pr\5+\26"+
		"\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t{\3\2\2\2uw\5+\26\2vu\3\2\2"+
		"\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zl\3\2\2\2zv\3\2\2\2{&\3\2\2"+
		"\2|~\5/\30\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"(\3\2\2\2\u0081\u0086\7$\2\2\u0082\u0085\t\2\2\2\u0083\u0085\5/\30\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7$\2\2\u008a*\3\2\2\2\u008b\u008c\t\3\2\2\u008c,\3\2\2\2\u008d"+
		"\u008f\7\17\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0091\7\f\2\2\u0091.\3\2\2\2\u0092\u0094\t\4\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\60\3\2\2\2\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\b\31\2\2\u009b\62\3\2\2\2\r\2lsxz\177\u0084\u0086\u008e"+
		"\u0093\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}