package kotlinlang.dataStructures

// A Set is a collection that allows only one element of each value. order is not important in sets
private fun initializingSets() {
    val numbers = setOf(1, 1, 1, 2, 3, 4, 5, 6, 4, 3, 10)
    println(numbers) // redundant elements will not show up here
    println(numbers.size) // also the size omit redundant elements

    // Two sets are equal if they contain the same elements.
    val chars1: Set<Char> = setOf('c', 'b', 'a', 'a', 'a') // explicit type declaration
    var chars2 = setOf<Char>('a', 'b', 'c', 'b') // explicit type declaration
    println(chars1 == chars2) // true

    chars2 += chars1 // this creates a new set under the hood
}

private fun iteratingSets() {
    val numbers = setOf(1, 1, 1, 2, 3, 4, 5, 6, 4, 3, 10)
    for (i in numbers) {
        println(i)
    }
}
