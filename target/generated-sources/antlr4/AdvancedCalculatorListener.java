// Generated from AdvancedCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AdvancedCalculatorParser}.
 */
public interface AdvancedCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code start}
	 * labeled alternative in {@link AdvancedCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterStart(AdvancedCalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code start}
	 * labeled alternative in {@link AdvancedCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitStart(AdvancedCalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AdvancedCalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AdvancedCalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code express}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpress(AdvancedCalculatorParser.ExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code express}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpress(AdvancedCalculatorParser.ExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standardmethods}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStandardmethods(AdvancedCalculatorParser.StandardmethodsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standardmethods}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStandardmethods(AdvancedCalculatorParser.StandardmethodsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link AdvancedCalculatorParser#function}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AdvancedCalculatorParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link AdvancedCalculatorParser#function}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AdvancedCalculatorParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link AdvancedCalculatorParser#languageconstruct}.
	 * @param ctx the parse tree
	 */
	void enterPrint(AdvancedCalculatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link AdvancedCalculatorParser#languageconstruct}.
	 * @param ctx the parse tree
	 */
	void exitPrint(AdvancedCalculatorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link AdvancedCalculatorParser#languageconstruct}.
	 * @param ctx the parse tree
	 */
	void enterForeach(AdvancedCalculatorParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link AdvancedCalculatorParser#languageconstruct}.
	 * @param ctx the parse tree
	 */
	void exitForeach(AdvancedCalculatorParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(AdvancedCalculatorParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(AdvancedCalculatorParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(AdvancedCalculatorParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(AdvancedCalculatorParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSub(AdvancedCalculatorParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSub(AdvancedCalculatorParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(AdvancedCalculatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(AdvancedCalculatorParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code data}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterData(AdvancedCalculatorParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code data}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitData(AdvancedCalculatorParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunc(AdvancedCalculatorParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunc(AdvancedCalculatorParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(AdvancedCalculatorParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(AdvancedCalculatorParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AdvancedCalculatorParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AdvancedCalculatorParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 */
	void enterNum(AdvancedCalculatorParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 */
	void exitNum(AdvancedCalculatorParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 */
	void enterVar(AdvancedCalculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 */
	void exitVar(AdvancedCalculatorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 */
	void enterString(AdvancedCalculatorParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 */
	void exitString(AdvancedCalculatorParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code list}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 */
	void enterList(AdvancedCalculatorParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 */
	void exitList(AdvancedCalculatorParser.ListContext ctx);
}