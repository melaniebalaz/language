// Generated from Calculator.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull CalculatorParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(@NotNull CalculatorParser.NumContext ctx);

	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull CalculatorParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull CalculatorParser.MulDivContext ctx);
}