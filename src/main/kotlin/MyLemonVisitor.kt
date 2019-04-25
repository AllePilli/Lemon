class MyLemonVisitor: LemonBaseVisitor<Value>() {
    companion object{
        // Used to compare floating point numbers
        const val SMALL_VALUE = 0.00000000001
    }

    // Variable storage (only 1 global scope)
    private val memory: MutableMap<String, Value> = mutableMapOf()

    /**
     * {@inheritDoc}
     *
     *
     * The default implementation returns the result of calling
     * [.visitChildren] on `ctx`.
     */
    override fun visitDeclaration(ctx: LemonParser.DeclarationContext?): Value {
        val identifier = ctx!!.IDENTIFIER().text
        val value = visit(ctx.expression())
        return memory.put(identifier, value) ?: Value.VOID
    }

    /**
     * {@inheritDoc}
     *
     *
     * The default implementation returns the result of calling
     * [.visitChildren] on `ctx`.
     */
    override fun visitExpressionArithmetic(ctx: LemonParser.ExpressionArithmeticContext?) = visit(ctx!!.arithmetic_expression())

    /**
     * Prints the memory to the console
     */
    fun printMemory(){
        println("MyLemonVisitor Memory:")
        memory.forEach { k, v -> println("\t$k = $v") }
    }
}