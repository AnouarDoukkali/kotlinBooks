package kotlinlang.collectionsOperations

private fun <T> flatten(vararg lists: List<T>): List<T> {
    return listOf(*lists).flatten()
}
