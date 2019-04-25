class LemonVisitor: LemonBaseVisitor<Value>() {
    companion object{
        // Used to compare floating point numbers
        const val SMALL_VALUE = 0.00000000001
    }

    private val memory: Map<String, Value> = mapOf()
}