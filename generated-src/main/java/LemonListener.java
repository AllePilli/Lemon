// Generated from Lemon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LemonParser}.
 */
public interface LemonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LemonParser#rule_set}.
	 * @param ctx the parse tree
	 */
	void enterRule_set(LemonParser.Rule_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#rule_set}.
	 * @param ctx the parse tree
	 */
	void exitRule_set(LemonParser.Rule_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#single_rule}.
	 * @param ctx the parse tree
	 */
	void enterSingle_rule(LemonParser.Single_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#single_rule}.
	 * @param ctx the parse tree
	 */
	void exitSingle_rule(LemonParser.Single_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#if_s}.
	 * @param ctx the parse tree
	 */
	void enterIf_s(LemonParser.If_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#if_s}.
	 * @param ctx the parse tree
	 */
	void exitIf_s(LemonParser.If_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#else_if_s}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_s(LemonParser.Else_if_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#else_if_s}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_s(LemonParser.Else_if_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#else_s}.
	 * @param ctx the parse tree
	 */
	void enterElse_s(LemonParser.Else_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#else_s}.
	 * @param ctx the parse tree
	 */
	void exitElse_s(LemonParser.Else_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LemonParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LemonParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void enterConclusion(LemonParser.ConclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void exitConclusion(LemonParser.ConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalEntity}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalEntity(LemonParser.LogicalEntityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalEntity}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalEntity(LemonParser.LogicalEntityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(LemonParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(LemonParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionInParen(LemonParser.LogicalExpressionInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionInParen(LemonParser.LogicalExpressionInParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionAnd(LemonParser.LogicalExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionAnd(LemonParser.LogicalExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionOr(LemonParser.LogicalExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link LemonParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionOr(LemonParser.LogicalExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link LemonParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionWithOperator(LemonParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link LemonParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionWithOperator(LemonParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionParens}
	 * labeled alternative in {@link LemonParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionParens(LemonParser.ComparisonExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionParens}
	 * labeled alternative in {@link LemonParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionParens(LemonParser.ComparisonExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#comparison_operand}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operand(LemonParser.Comparison_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#comparison_operand}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operand(LemonParser.Comparison_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterComp_operator(LemonParser.Comp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitComp_operator(LemonParser.Comp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionMult}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionMult(LemonParser.ArithmeticExpressionMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionMult}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionMult(LemonParser.ArithmeticExpressionMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionMinus}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionMinus(LemonParser.ArithmeticExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionMinus}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionMinus(LemonParser.ArithmeticExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionParens}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionParens(LemonParser.ArithmeticExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionParens}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionParens(LemonParser.ArithmeticExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionNumericEntity}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionNumericEntity(LemonParser.ArithmeticExpressionNumericEntityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionNumericEntity}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionNumericEntity(LemonParser.ArithmeticExpressionNumericEntityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionDiv}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionDiv(LemonParser.ArithmeticExpressionDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionDiv}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionDiv(LemonParser.ArithmeticExpressionDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionPlus}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionPlus(LemonParser.ArithmeticExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionPlus}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionPlus(LemonParser.ArithmeticExpressionPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionNegation}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionNegation(LemonParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionNegation}
	 * labeled alternative in {@link LemonParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionNegation(LemonParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalConst}
	 * labeled alternative in {@link LemonParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConst(LemonParser.LogicalConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalConst}
	 * labeled alternative in {@link LemonParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConst(LemonParser.LogicalConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogivalVariable}
	 * labeled alternative in {@link LemonParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void enterLogivalVariable(LemonParser.LogivalVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogivalVariable}
	 * labeled alternative in {@link LemonParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void exitLogivalVariable(LemonParser.LogivalVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link LemonParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void enterNumericConst(LemonParser.NumericConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link LemonParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void exitNumericConst(LemonParser.NumericConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumbericVariable}
	 * labeled alternative in {@link LemonParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void enterNumbericVariable(LemonParser.NumbericVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumbericVariable}
	 * labeled alternative in {@link LemonParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void exitNumbericVariable(LemonParser.NumbericVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LemonParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LemonParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LemonParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(LemonParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LemonParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(LemonParser.ShowContext ctx);
}