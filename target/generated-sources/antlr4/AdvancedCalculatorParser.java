// Generated from at.balaz.lang.AdvancedCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdvancedCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUMBER=16, 
		VARIABLE=17, STRING=18, DIGIT=19, NEWLINE=20, CHARACTER=21, COMMENT=22, 
		WS=23;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_function = 2, RULE_languageconstruct = 3, 
		RULE_expression = 4, RULE_datacontainer = 5;
	public static final String[] ruleNames = {
		"program", "statement", "function", "languageconstruct", "expression", 
		"datacontainer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "','", "')'", "':'", "'.'", "'out: '", "'foreach '", 
		"'in '", "' do '", "'*'", "'/'", "'+'", "'-'", "'list('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NUMBER", "VARIABLE", "STRING", "DIGIT", "NEWLINE", 
		"CHARACTER", "COMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "at.balaz.lang.AdvancedCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AdvancedCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StartContext extends ProgramContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AdvancedCalculatorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AdvancedCalculatorParser.NEWLINE, i);
		}
		public StartContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new StartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				statement();
				setState(13);
				match(NEWLINE);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__14) | (1L << NUMBER) | (1L << VARIABLE) | (1L << STRING))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StandardmethodsContext extends StatementContext {
		public LanguageconstructContext languageconstruct() {
			return getRuleContext(LanguageconstructContext.class,0);
		}
		public StandardmethodsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterStandardmethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitStandardmethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitStandardmethods(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends StatementContext {
		public TerminalNode VARIABLE() { return getToken(AdvancedCalculatorParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(VARIABLE);
				setState(20);
				match(T__0);
				setState(21);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ExpressContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				expression(0);
				}
				break;
			case 3:
				_localctx = new StandardmethodsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				languageconstruct();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationContext extends FunctionContext {
		public TerminalNode NEWLINE() { return getToken(AdvancedCalculatorParser.NEWLINE, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(AdvancedCalculatorParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(AdvancedCalculatorParser.VARIABLE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DeclarationContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			_localctx = new DeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__1);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE) {
				{
				{
				setState(27);
				match(VARIABLE);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(28);
					match(T__2);
					setState(29);
					match(VARIABLE);
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(T__3);
			setState(41);
			match(T__4);
			setState(42);
			match(NEWLINE);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__14) | (1L << NUMBER) | (1L << VARIABLE) | (1L << STRING))) != 0) );
			setState(48);
			match(T__5);
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

	public static class LanguageconstructContext extends ParserRuleContext {
		public LanguageconstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageconstruct; }
	 
		public LanguageconstructContext() { }
		public void copyFrom(LanguageconstructContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForeachContext extends LanguageconstructContext {
		public TerminalNode VARIABLE() { return getToken(AdvancedCalculatorParser.VARIABLE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForeachContext(LanguageconstructContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends LanguageconstructContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AdvancedCalculatorParser.STRING, 0); }
		public PrintContext(LanguageconstructContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageconstructContext languageconstruct() throws RecognitionException {
		LanguageconstructContext _localctx = new LanguageconstructContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_languageconstruct);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__6);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(51);
					expression(0);
					}
					break;
				case 2:
					{
					setState(52);
					match(STRING);
					}
					break;
				}
				}
				break;
			case T__7:
				_localctx = new ForeachContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__7);
				setState(56);
				match(VARIABLE);
				setState(57);
				match(T__8);
				setState(58);
				expression(0);
				setState(59);
				match(T__9);
				setState(60);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataContext extends ExpressionContext {
		public DatacontainerContext datacontainer() {
			return getRuleContext(DatacontainerContext.class,0);
		}
		public DataContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends ExpressionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public TerminalNode VARIABLE() { return getToken(AdvancedCalculatorParser.VARIABLE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				match(T__1);
				setState(66);
				expression(0);
				setState(67);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new DataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				datacontainer();
				}
				break;
			case 3:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				function();
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(VARIABLE);
				setState(72);
				match(T__1);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << NUMBER) | (1L << VARIABLE) | (1L << STRING))) != 0)) {
					{
					{
					setState(73);
					expression(0);
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(74);
						match(T__2);
						setState(75);
						expression(0);
						}
						}
						setState(80);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(90);
						match(T__10);
						setState(91);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(93);
						match(T__11);
						setState(94);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(96);
						match(T__12);
						setState(97);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(99);
						match(T__13);
						setState(100);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DatacontainerContext extends ParserRuleContext {
		public DatacontainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datacontainer; }
	 
		public DatacontainerContext() { }
		public void copyFrom(DatacontainerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DictionaryContext extends DatacontainerContext {
		public List<TerminalNode> VARIABLE() { return getTokens(AdvancedCalculatorParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(AdvancedCalculatorParser.VARIABLE, i);
		}
		public List<DatacontainerContext> datacontainer() {
			return getRuleContexts(DatacontainerContext.class);
		}
		public DatacontainerContext datacontainer(int i) {
			return getRuleContext(DatacontainerContext.class,i);
		}
		public DictionaryContext(DatacontainerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitDictionary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitDictionary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends DatacontainerContext {
		public TerminalNode STRING() { return getToken(AdvancedCalculatorParser.STRING, 0); }
		public StringContext(DatacontainerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends DatacontainerContext {
		public TerminalNode VARIABLE() { return getToken(AdvancedCalculatorParser.VARIABLE, 0); }
		public VarContext(DatacontainerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends DatacontainerContext {
		public TerminalNode NUMBER() { return getToken(AdvancedCalculatorParser.NUMBER, 0); }
		public NumContext(DatacontainerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListContext extends DatacontainerContext {
		public List<DatacontainerContext> datacontainer() {
			return getRuleContexts(DatacontainerContext.class);
		}
		public DatacontainerContext datacontainer(int i) {
			return getRuleContext(DatacontainerContext.class,i);
		}
		public ListContext(DatacontainerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatacontainerContext datacontainer() throws RecognitionException {
		DatacontainerContext _localctx = new DatacontainerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_datacontainer);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(VARIABLE);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(STRING);
				}
				break;
			case T__14:
				_localctx = new ListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(T__14);
				{
				setState(110);
				datacontainer();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(111);
					match(T__2);
					setState(112);
					datacontainer();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(118);
				match(T__3);
				}
				break;
			case T__1:
				_localctx = new DictionaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(T__1);
				{
				setState(121);
				match(VARIABLE);
				setState(122);
				match(T__4);
				setState(123);
				datacontainer();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(124);
					match(T__2);
					setState(125);
					match(VARIABLE);
					setState(126);
					match(T__4);
					setState(127);
					datacontainer();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(133);
				match(T__3);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\6\2\22\n\2\r\2\16"+
		"\2\23\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\7\4!\n\4\f\4\16\4"+
		"$\13\4\7\4&\n\4\f\4\16\4)\13\4\3\4\3\4\3\4\3\4\6\4/\n\4\r\4\16\4\60\3"+
		"\4\3\4\3\5\3\5\3\5\5\58\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6O\n\6\f\6\16\6R\13\6\7\6"+
		"T\n\6\f\6\16\6W\13\6\3\6\5\6Z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7t"+
		"\n\7\f\7\16\7w\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0083"+
		"\n\7\f\7\16\7\u0086\13\7\3\7\3\7\5\7\u008a\n\7\3\7\2\3\n\b\2\4\6\b\n\f"+
		"\2\2\2\u009c\2\21\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b@\3\2\2\2\nY\3\2"+
		"\2\2\f\u0089\3\2\2\2\16\17\5\4\3\2\17\20\7\26\2\2\20\22\3\2\2\2\21\16"+
		"\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26"+
		"\7\23\2\2\26\27\7\3\2\2\27\33\5\n\6\2\30\33\5\n\6\2\31\33\5\b\5\2\32\25"+
		"\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\'\7\4\2\2\35\"\7"+
		"\23\2\2\36\37\7\5\2\2\37!\7\23\2\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\""+
		"#\3\2\2\2#&\3\2\2\2$\"\3\2\2\2%\35\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2"+
		"\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\6\2\2+,\7\7\2\2,.\7\26\2\2-/\5\4\3\2.-\3"+
		"\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\b\2"+
		"\2\63\7\3\2\2\2\64\67\7\t\2\2\658\5\n\6\2\668\7\24\2\2\67\65\3\2\2\2\67"+
		"\66\3\2\2\28A\3\2\2\29:\7\n\2\2:;\7\23\2\2;<\7\13\2\2<=\5\n\6\2=>\7\f"+
		"\2\2>?\5\n\6\2?A\3\2\2\2@\64\3\2\2\2@9\3\2\2\2A\t\3\2\2\2BC\b\6\1\2CD"+
		"\7\4\2\2DE\5\n\6\2EF\7\6\2\2FZ\3\2\2\2GZ\5\f\7\2HZ\5\6\4\2IJ\7\23\2\2"+
		"JU\7\4\2\2KP\5\n\6\2LM\7\5\2\2MO\5\n\6\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SK\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"VX\3\2\2\2WU\3\2\2\2XZ\7\6\2\2YB\3\2\2\2YG\3\2\2\2YH\3\2\2\2YI\3\2\2\2"+
		"Zi\3\2\2\2[\\\f\t\2\2\\]\7\r\2\2]h\5\n\6\n^_\f\b\2\2_`\7\16\2\2`h\5\n"+
		"\6\tab\f\7\2\2bc\7\17\2\2ch\5\n\6\bde\f\6\2\2ef\7\20\2\2fh\5\n\6\7g[\3"+
		"\2\2\2g^\3\2\2\2ga\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\13"+
		"\3\2\2\2ki\3\2\2\2l\u008a\7\22\2\2m\u008a\7\23\2\2n\u008a\7\24\2\2op\7"+
		"\21\2\2pu\5\f\7\2qr\7\5\2\2rt\5\f\7\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv"+
		"\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\6\2\2y\u008a\3\2\2\2z{\7\4\2\2{|\7\23"+
		"\2\2|}\7\7\2\2}\u0084\5\f\7\2~\177\7\5\2\2\177\u0080\7\23\2\2\u0080\u0081"+
		"\7\7\2\2\u0081\u0083\5\f\7\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7\6\2\2\u0088\u008a\3\2\2\2\u0089l\3\2\2\2\u0089m\3\2"+
		"\2\2\u0089n\3\2\2\2\u0089o\3\2\2\2\u0089z\3\2\2\2\u008a\r\3\2\2\2\21\23"+
		"\32\"\'\60\67@PUYgiu\u0084\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}