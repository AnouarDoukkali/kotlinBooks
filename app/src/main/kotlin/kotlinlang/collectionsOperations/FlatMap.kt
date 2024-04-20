/**
 * File: FlatMap.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 3:33 AM
 * Description: This class represents a FlatMap operation on two lists.
 * Since: v0.1.0
 */

package kotlinlang.collectionsOperations

/**
 * This class represents a FlatMap operation on two lists.
 * It contains two functions, flatMapOfTwoLists and flatMapSameList, which perform flatMap operations on the lists.
 *
 * @property numbers The first list of integers to be used in the flatMap operations.
 * @property names The second list of strings to be used in the flatMap operations. Default is an empty list.
 *
 * @see FlatMapTest
 */
internal data class FlatMap(val numbers: List<Int>, val names: List<String> = emptyList()) {

    /**
     * This function performs a flatMap operation on the numbers and names lists.
     * It returns a new list of strings where each string is a combination of a number and a name.
     *
     * @return A list of strings where each string is a combination of a number and a name.
     */
    fun flatMapOfTwoLists(): List<String> {
        return numbers.flatMap { a -> names.map { b -> "$a : $b" } }
    }

    /**
     * This function performs a flatMap operation on the numbers list with itself.
     * It returns a new list of pairs where each pair is a combination of two numbers.
     *
     * @return A list of pairs where each pair is a combination of two numbers.
     */
    fun flatMapSameList(): List<Pair<Int, Int>> {
        return numbers.flatMap { a -> numbers.map { b -> a to b } }
    }
}
