package kotlinlang.functions

// The combination of name, parameters and return type is called the function signature.
private fun simpleFunction(param1: Int, param2: Int, name: String = "default value"): Int {
    val expression = param1 + param2
    return expression + name.length
}

private fun unitReturn() {
    println("a function that does not have a defined return type is returning Unit by default")
    return Unit
}

private fun neverReturn(): Nothing {
    error("never return")
}

private fun oneLineReturn(a: Int, b: Int) = """
    | Kotlin infers the return type of a function
    | that has an expression body. ${a + b}
    | 
""".trimMargin()
