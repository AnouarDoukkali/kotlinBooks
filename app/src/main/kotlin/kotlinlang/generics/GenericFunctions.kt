package kotlinlang.generics

// generic function that accept and return type T
private fun <T> genericFunction(value: T): T {
    println("value: $value")
    return value
}
