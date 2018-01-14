// Generated from AdvancedCalculator.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AdvancedCalculatorParser}.
 */
public interface AdvancedCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull AdvancedCalculatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull AdvancedCalculatorParser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull AdvancedCalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull AdvancedCalculatorParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull AdvancedCalculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull AdvancedCalculatorParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull AdvancedCalculatorParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull AdvancedCalculatorParser.NumContext ctx);

	/**
	 * Enter a parse tree produced by the {@code start}
	 * labeled alternative in {@link AdvancedCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull AdvancedCalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code start}
	 * labeled alternative in {@link AdvancedCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull AdvancedCalculatorParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull AdvancedCalculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull AdvancedCalculatorParser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by the {@code operation}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull AdvancedCalculatorParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull AdvancedCalculatorParser.OperationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull AdvancedCalculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull AdvancedCalculatorParser.MulDivContext ctx);
}