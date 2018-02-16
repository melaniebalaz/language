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
		null, "'='", "'out'", "':'", "'foreach '", "'in '", "' do '", "'('", "','", 
		"')'", "'*'", "'/'", "'+'", "'-'", "'list('"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << NUMBER) | (1L << VARIABLE) | (1L << STRING))) != 0) );
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
			setState(25);
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
				_localctx = new ExpressContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
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
	public static class DeclarationContext extends FunctionContext {
		public TerminalNode NEWLINE() { return getToken(AdvancedCalculatorParser.NEWLINE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			int _alt;
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T__1);
				setState(28);
				match(T__2);
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(29);
					expression(0);
					}
					break;
				case 2:
					{
					setState(30);
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
				setState(33);
				match(T__3);
				setState(34);
				match(VARIABLE);
				setState(35);
				match(T__4);
				setState(36);
				expression(0);
				setState(37);
				match(T__5);
				setState(38);
				expression(0);
				}
				break;
			case T__6:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(T__6);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << NUMBER) | (1L << VARIABLE) | (1L << STRING))) != 0)) {
					{
					{
					setState(41);
					expression(0);
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(42);
						match(T__7);
						setState(43);
						expression(0);
						}
						}
						setState(48);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__8);
				setState(55);
				match(T__2);
				setState(56);
				match(NEWLINE);
				setState(58); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(57);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(60); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class CallContext extends ExpressionContext {
		public TerminalNode VARIABLE() { return getToken(AdvancedCalculatorParser.VARIABLE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdvancedCalculatorListener ) ((AdvancedCalculatorListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdvancedCalculatorVisitor ) return ((AdvancedCalculatorVisitor<? extends T>)visitor).visitCall(this);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				match(T__6);
				setState(66);
				expression(0);
				setState(67);
				match(T__8);
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
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(VARIABLE);
				setState(71);
				match(T__6);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << NUMBER) | (1L << VARIABLE) | (1L << STRING))) != 0)) {
					{
					{
					setState(72);
					expression(0);
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(73);
						match(T__7);
						setState(74);
						expression(0);
						}
						}
						setState(79);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(89);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(92);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(VARIABLE);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(STRING);
				}
				break;
			case T__13:
				_localctx = new ListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(T__13);
				{
				setState(103);
				datacontainer();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(104);
					match(T__7);
					setState(105);
					datacontainer();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(111);
				match(T__8);
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\5\4\"\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\7\4\64"+
		"\n\4\f\4\16\4\67\13\4\3\4\3\4\3\4\3\4\6\4=\n\4\r\4\16\4>\5\4A\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\7\5S"+
		"\n\5\f\5\16\5V\13\5\3\5\5\5Y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5a\n\5\f\5"+
		"\16\5d\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3"+
		"\6\5\6t\n\6\3\6\2\3\b\7\2\4\6\b\n\2\4\3\2\f\r\3\2\16\17\2\u0084\2\17\3"+
		"\2\2\2\4\33\3\2\2\2\6@\3\2\2\2\bX\3\2\2\2\ns\3\2\2\2\f\r\5\4\3\2\r\16"+
		"\7\25\2\2\16\20\3\2\2\2\17\f\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22"+
		"\3\2\2\2\22\3\3\2\2\2\23\24\7\22\2\2\24\30\7\3\2\2\25\31\5\b\5\2\26\31"+
		"\7\23\2\2\27\31\5\6\4\2\30\25\3\2\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31\34"+
		"\3\2\2\2\32\34\5\b\5\2\33\23\3\2\2\2\33\32\3\2\2\2\34\5\3\2\2\2\35\36"+
		"\7\4\2\2\36!\7\5\2\2\37\"\5\b\5\2 \"\7\23\2\2!\37\3\2\2\2! \3\2\2\2\""+
		"A\3\2\2\2#$\7\6\2\2$%\7\22\2\2%&\7\7\2\2&\'\5\b\5\2\'(\7\b\2\2()\5\b\5"+
		"\2)A\3\2\2\2*\65\7\t\2\2+\60\5\b\5\2,-\7\n\2\2-/\5\b\5\2.,\3\2\2\2/\62"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63+\3\2"+
		"\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2"+
		"\289\7\13\2\29:\7\5\2\2:<\7\25\2\2;=\5\4\3\2<;\3\2\2\2=>\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?A\3\2\2\2@\35\3\2\2\2@#\3\2\2\2@*\3\2\2\2A\7\3\2\2\2BC"+
		"\b\5\1\2CD\7\t\2\2DE\5\b\5\2EF\7\13\2\2FY\3\2\2\2GY\5\n\6\2HI\7\22\2\2"+
		"IT\7\t\2\2JO\5\b\5\2KL\7\n\2\2LN\5\b\5\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RJ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2"+
		"UW\3\2\2\2VT\3\2\2\2WY\7\13\2\2XB\3\2\2\2XG\3\2\2\2XH\3\2\2\2Yb\3\2\2"+
		"\2Z[\f\6\2\2[\\\t\2\2\2\\a\5\b\5\7]^\f\5\2\2^_\t\3\2\2_a\5\b\5\6`Z\3\2"+
		"\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2db\3\2\2\2et\7"+
		"\21\2\2ft\7\22\2\2gt\7\23\2\2hi\7\20\2\2in\5\n\6\2jk\7\n\2\2km\5\n\6\2"+
		"lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\13\2"+
		"\2rt\3\2\2\2se\3\2\2\2sf\3\2\2\2sg\3\2\2\2sh\3\2\2\2t\13\3\2\2\2\21\21"+
		"\30\33!\60\65>@OTX`bns";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}