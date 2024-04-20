package kotlinlang.dataStructures.lists

/**
 * This file demonstrates how to create and initialize lists in Kotlin.
 * @see ListsTest
 */
@Suppress("unused")
private fun initializeLists() {
    // initialization of immutable lists
    val alphabets: List<String> = listOf("a", "b", "c", "d", "e") // explicit type declaration
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7) // explicit type declaration
    val chars = listOf('a', 'b', 'c', 'd', 'e') // the type of the list in inferred to be Char
    val chars2 = List(10) { 'a' + it } // create a list of chars a,b,c,d,etc. using lambda,'it' refer to size
    val empty = List(5) { 0 } // a list of Int instances with default size and values of '0's
    val lambda = List(10) { it } // the indexes are the value of the list
    val casting: List<Int> = mutableListOf(1, 2, 3) // declaring a list using covariance
}
