package kotlinlang.collectionsOperations

// normal zip return a zip of pairs of zipped elements using zip function
private fun <T, S> normalZip(left: List<T>, right: List<S>): List<Pair<T, S>> {
    return left.zip(right)
}

// custom zip  return a list containing customized elements after transformation
private fun <T, S> customZip(left: List<T>, right: List<S>): List<Map<T, S>> {
    return left.zip(right) { key, value -> mapOf(key to value) }
}

// zip each element with the next one
private fun <T> zipNext(left: List<T>): List<Pair<T, T>> {
    return left.zipWithNext()
}
