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
		NUMBER=10, VARIABLE=11, STRING=12, DIGIT=13, NEWLINE=14, CHARACTER=15, 
		WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"NUMBER", "VARIABLE", "STRING", "DIGIT", "NEWLINE", "CHARACTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'out'", "':'", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "NUMBER", 
		"VARIABLE", "STRING", "DIGIT", "NEWLINE", "CHARACTER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\7\139\n\13\f\13\16\13<\13\13\3\13\3\13\6\13@\n\13\r\13\16\13A\3"+
		"\13\6\13E\n\13\r\13\16\13F\5\13I\n\13\3\f\6\fL\n\f\r\f\16\fM\3\r\3\r\3"+
		"\r\7\rS\n\r\f\r\16\rV\13\r\3\r\3\r\3\16\3\16\3\17\5\17]\n\17\3\17\3\17"+
		"\3\20\5\20b\n\20\3\21\6\21e\n\21\r\21\16\21f\3\21\3\21\2\2\22\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"\3\2\5\4\2\13\13\"\"\3\2\62;\4\2C\\c|\2r\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7)\3\2\2\2\t+\3"+
		"\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2"+
		"\2\25H\3\2\2\2\27K\3\2\2\2\31O\3\2\2\2\33Y\3\2\2\2\35\\\3\2\2\2\37a\3"+
		"\2\2\2!d\3\2\2\2#$\7?\2\2$\4\3\2\2\2%&\7q\2\2&\'\7w\2\2\'(\7v\2\2(\6\3"+
		"\2\2\2)*\7<\2\2*\b\3\2\2\2+,\7*\2\2,\n\3\2\2\2-.\7+\2\2.\f\3\2\2\2/\60"+
		"\7,\2\2\60\16\3\2\2\2\61\62\7\61\2\2\62\20\3\2\2\2\63\64\7-\2\2\64\22"+
		"\3\2\2\2\65\66\7/\2\2\66\24\3\2\2\2\679\5\33\16\28\67\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=?\7\60\2\2>@\5\33\16\2?>\3"+
		"\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BI\3\2\2\2CE\5\33\16\2DC\3\2\2\2E"+
		"F\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2H:\3\2\2\2HD\3\2\2\2I\26\3\2\2"+
		"\2JL\5\37\20\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\30\3\2\2\2OT\7"+
		"$\2\2PS\t\2\2\2QS\5\37\20\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU"+
		"\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7$\2\2X\32\3\2\2\2YZ\t\3\2\2Z\34\3\2\2"+
		"\2[]\7\17\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\f\2\2_\36\3\2\2\2`b"+
		"\t\4\2\2a`\3\2\2\2b \3\2\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2f"+
		"g\3\2\2\2gh\3\2\2\2hi\b\21\2\2i\"\3\2\2\2\r\2:AFHMRT\\af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}