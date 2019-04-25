class MyLemonVisitor: LemonBaseVisitor<Value>() {
    companion object{
        // Used to compare floating point numbers
        const val SMALL_VALUE = 0.00000000001
    }

    // Variable storage (only 1 global scope)
    private val memory: Map<String, Value> = mapOf()

    /**
     * {@inheritDoc}
     *
     *
     * The default implementation returns the result of calling
     * [.visitChildren] on `ctx`.
     */
    override fun visitDeclaration(ctx: LemonParser.DeclarationContext?): Value {
        println(ctx!!.text)
        return super.visitDeclaration(ctx)
    }
}