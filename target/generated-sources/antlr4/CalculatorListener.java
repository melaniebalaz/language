// Generated from Calculator.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull CalculatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull CalculatorParser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull CalculatorParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull CalculatorParser.NumContext ctx);

	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull CalculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull CalculatorParser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull CalculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull CalculatorParser.MulDivContext ctx);
}