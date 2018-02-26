// Generated from at.balaz.lang.AdvancedCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AdvancedCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * at.balaz.lang.operations with no return type.
 */
public interface AdvancedCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code start}
	 * labeled alternative in {@link AdvancedCalculatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AdvancedCalculatorParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AdvancedCalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code express}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress(AdvancedCalculatorParser.ExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standardmethods}
	 * labeled alternative in {@link AdvancedCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardmethods(AdvancedCalculatorParser.StandardmethodsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link AdvancedCalculatorParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AdvancedCalculatorParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link AdvancedCalculatorParser#languageconstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(AdvancedCalculatorParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link AdvancedCalculatorParser#languageconstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(AdvancedCalculatorParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(AdvancedCalculatorParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(AdvancedCalculatorParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(AdvancedCalculatorParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(AdvancedCalculatorParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code data}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(AdvancedCalculatorParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(AdvancedCalculatorParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(AdvancedCalculatorParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AdvancedCalculatorParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(AdvancedCalculatorParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(AdvancedCalculatorParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AdvancedCalculatorParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code list}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(AdvancedCalculatorParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictionary}
	 * labeled alternative in {@link AdvancedCalculatorParser#datacontainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(AdvancedCalculatorParser.DictionaryContext ctx);
}