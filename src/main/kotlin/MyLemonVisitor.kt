class MyLemonVisitor: LemonBaseVisitor<Value>() {
    companion object{
        // Used to compare floating point numbers
        const val SMALL_VALUE = 0.00000000001
    }

    // Variable storage (only 1 global scope)
    private val memory: MutableMap<String, Value> = mutableMapOf()

    override fun visitDeclaration(ctx: LemonParser.DeclarationContext?): Value {
        val identifier = ctx!!.IDENTIFIER().text
        val value = visit(ctx.expression())
        return memory.put(identifier, value) ?: Value.VOID
    }

    override fun visitExpressionArithmetic(ctx: LemonParser.ExpressionArithmeticContext?) = visit(ctx!!.arithmetic_expression())

    override fun visitArithmeticExpressionMult(ctx: LemonParser.ArithmeticExpressionMultContext?): Value {
        val left = visit(ctx!!.arithmetic_expression(0))
        val right = visit(ctx.arithmetic_expression(1))

        return Value(left.asDouble() * right.asDouble())
    }

    override fun visitArithmeticExpressionDiv(ctx: LemonParser.ArithmeticExpressionDivContext?): Value {
        val left = visit(ctx!!.arithmetic_expression(0))
        val right = visit(ctx.arithmetic_expression(1))

        return Value(left.asDouble() / right.asDouble())
    }

    override fun visitArithmeticExpressionMod(ctx: LemonParser.ArithmeticExpressionModContext?): Value {
        val left = visit(ctx!!.arithmetic_expression(0))
        val right = visit(ctx.arithmetic_expression(1))

        return Value(left.asDouble() % right.asDouble())
    }

    /**
     * Prints the memory to the console
     */
    fun printMemory(){
        println("MyLemonVisitor Memory:")
        memory.forEach { k, v -> println("\t$k = $v") }
    }
}