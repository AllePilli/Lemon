data class Value(val value: Any) {
    companion object{
        val VOID = Value(Any())
    }

    fun asBoolean() = value as Boolean
    fun asDouble() = value as Double
    fun asString() = value.toString()

    fun isDouble() = value is Double

    override fun equals(other: Any?): Boolean {
        if (value == other) return true
        if (other == null || other.javaClass != value.javaClass) return false

        val that = other as Value

        return value == that.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = asString()
}