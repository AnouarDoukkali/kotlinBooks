package kotlinlang.nullable

private fun elvis(str: String?) {
    // he Elvis operator is typically used after a safe call it allows us to return something else instead of null
    println(str?.length ?: "str is null")
}
