// Generated from AdvancedCalculator.g4 by ANTLR 4.7.1
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NUMBER=15, VARIABLE=16, 
		STRING=17, DIGIT=18, NEWLINE=19, CHARACTER=20, WS=21;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_function = 2, RULE_expression = 3, 
		RULE_datacontainer = 4;
	public static final String[] ruleNames = {
		"program", "statement", "function", "expression", "datacontainer"
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

	@Override
	public String getGrammarFileName() { return "AdvancedCalculator.g4"; }

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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				statement();
				setState(11);
				match(NEWLINE);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__12) | (1L << NUMBER) | (1L << VARIABLE) | (1L << STRING))) != 0) );
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
	public static class FuncContext extends StatementContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncContext(StatementContext ctx) { copyFrom(ctx); }
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
	public static class AssignmentContext extends StatementContext {
		public TerminalNode VARIABLE() { return getToken(AdvancedCalculatorParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AdvancedCalculatorParser.STRING, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(VARIABLE);
				setState(18);
				match(T__0);
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(19);
					expression(0);
					}
					break;
				case 2:
					{
					setState(20);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(21);
					function();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				function();
				}
				break;
			case 3:
				_localctx = new ExpressContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				expression(0);
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
	public static class ForeachContext extends FunctionContext {
		public TerminalNode VARIABLE() { return getToken(AdvancedCalculatorParser.VARIABLE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForeachContext(FunctionContext ctx) { copyFrom(ctx); }
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
	public static class PrintContext extends FunctionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AdvancedCalculatorParser.STRING, 0); }
		public PrintContext(FunctionContext ctx) { copyFrom(ctx); }
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

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__1);
				setState(29);
				match(T__2);
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(30);
					expression(0);
					}
					break;
				case 2:
					{
					setState(31);
					match(STRING);
					}
					break;
				}
				}
				break;
			case T__3:
				_localctx = new ForeachContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__3);
				setState(35);
				match(VARIABLE);
				setState(36);
				match(T__4);
				setState(37);
				expression(0);
				setState(38);
				match(T__5);
				setState(39);
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
	public static class AddSubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitMulDiv(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				match(T__6);
				setState(45);
				expression(0);
				setState(46);
				match(T__7);
				}
				break;
			case T__12:
			case NUMBER:
			case VARIABLE:
			case STRING:
				{
				_localctx = new DataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				datacontainer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(52);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(53);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(55);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 8, RULE_datacontainer);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(VARIABLE);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(STRING);
				}
				break;
			case T__12:
				_localctx = new ListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(T__12);
				{
				setState(66);
				datacontainer();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(67);
					match(T__13);
					setState(68);
					datacontainer();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(74);
				match(T__7);
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\5\4#\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\5\6O\n\6\3\6\2\3\b\7\2\4\6\b\n"+
		"\2\4\3\2\13\f\3\2\r\16\2Y\2\17\3\2\2\2\4\34\3\2\2\2\6+\3\2\2\2\b\63\3"+
		"\2\2\2\nN\3\2\2\2\f\r\5\4\3\2\r\16\7\25\2\2\16\20\3\2\2\2\17\f\3\2\2\2"+
		"\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\7\22\2\2"+
		"\24\30\7\3\2\2\25\31\5\b\5\2\26\31\7\23\2\2\27\31\5\6\4\2\30\25\3\2\2"+
		"\2\30\26\3\2\2\2\30\27\3\2\2\2\31\35\3\2\2\2\32\35\5\6\4\2\33\35\5\b\5"+
		"\2\34\23\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\7\4\2"+
		"\2\37\"\7\5\2\2 #\5\b\5\2!#\7\23\2\2\" \3\2\2\2\"!\3\2\2\2#,\3\2\2\2$"+
		"%\7\6\2\2%&\7\22\2\2&\'\7\7\2\2\'(\5\b\5\2()\7\b\2\2)*\5\b\5\2*,\3\2\2"+
		"\2+\36\3\2\2\2+$\3\2\2\2,\7\3\2\2\2-.\b\5\1\2./\7\t\2\2/\60\5\b\5\2\60"+
		"\61\7\n\2\2\61\64\3\2\2\2\62\64\5\n\6\2\63-\3\2\2\2\63\62\3\2\2\2\64="+
		"\3\2\2\2\65\66\f\5\2\2\66\67\t\2\2\2\67<\5\b\5\689\f\4\2\29:\t\3\2\2:"+
		"<\5\b\5\5;\65\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\t\3\2\2"+
		"\2?=\3\2\2\2@O\7\21\2\2AO\7\22\2\2BO\7\23\2\2CD\7\17\2\2DI\5\n\6\2EF\7"+
		"\20\2\2FH\5\n\6\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI"+
		"\3\2\2\2LM\7\n\2\2MO\3\2\2\2N@\3\2\2\2NA\3\2\2\2NB\3\2\2\2NC\3\2\2\2O"+
		"\13\3\2\2\2\f\21\30\34\"+\63;=IN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}