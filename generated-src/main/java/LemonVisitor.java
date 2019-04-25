// Generated from Lemon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LemonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LemonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LemonParser#rule_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_set(LemonParser.Rule_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#single_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_rule(LemonParser.Single_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#if_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_s(LemonParser.If_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#else_if_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_s(LemonParser.Else_if_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#else_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_s(LemonParser.Else_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LemonParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#conclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusion(LemonParser.ConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalEntity}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalEntity(LemonParser.LogicalEntityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(LemonParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionInParen(LemonParser.LogicalExpressionInParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionAnd(LemonParser.LogicalExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionOr(LemonParser.LogicalExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link LemonParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionWithOperator(LemonParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionParens}
	 * labeled alternative in {@link LemonParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionParens(LemonParser.ComparisonExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#comparison_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operand(LemonParser.Comparison_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_operator(LemonParser.Comp_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionMult}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionMult(LemonParser.ArithmeticExpressionMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionMinus}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionMinus(LemonParser.ArithmeticExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionMod}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionMod(LemonParser.ArithmeticExpressionModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionParens}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionParens(LemonParser.ArithmeticExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionNumericEntity}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionNumericEntity(LemonParser.ArithmeticExpressionNumericEntityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionDiv}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionDiv(LemonParser.ArithmeticExpressionDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionPlus}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionPlus(LemonParser.ArithmeticExpressionPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionNegation}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionNegation(LemonParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalConst}
	 * labeled alternative in {@link LemonParser#logical_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalConst(LemonParser.LogicalConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogivalVariable}
	 * labeled alternative in {@link LemonParser#logical_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogivalVariable(LemonParser.LogivalVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link LemonParser#numeric_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConst(LemonParser.NumericConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumbericVariable}
	 * labeled alternative in {@link LemonParser#numeric_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbericVariable(LemonParser.NumbericVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LemonParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LemonParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(LemonParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionArithmetic}
	 * labeled alternative in {@link LemonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArithmetic(LemonParser.ExpressionArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLogical}
	 * labeled alternative in {@link LemonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLogical(LemonParser.ExpressionLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionAtom}
	 * labeled alternative in {@link LemonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtom(LemonParser.ExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link LemonParser#number_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(LemonParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatAtom}
	 * labeled alternative in {@link LemonParser#number_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAtom(LemonParser.FloatAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link LemonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(LemonParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link LemonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(LemonParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanAtom}
	 * labeled alternative in {@link LemonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(LemonParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierAtom}
	 * labeled alternative in {@link LemonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAtom(LemonParser.IdentifierAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link LemonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(LemonParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NulAtom}
	 * labeled alternative in {@link LemonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNulAtom(LemonParser.NulAtomContext ctx);
}