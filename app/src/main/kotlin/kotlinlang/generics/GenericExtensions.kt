package kotlinlang.generics

private fun <T> List<T>.boundTotal(): List<T> {
    for (i in this) {
        println(i)
    }
    return this
}
