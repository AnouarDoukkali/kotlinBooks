package kotlinlang.collections.lists.operations
/* File: FlatOperations.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 3:33 AM
 * Description: This file contains operations that can be performed on lists of elements
 * Since: v0.1.0
 */
/**
 * This object  provides methods to perform various flatMap operations on lists.
 */
internal object FlatOperations {
    /**
     * This function takes two lists and returns a new list of strings.
     * Each string is a combination of an element from the first list and an element from the second list.
     * The combination is in the format "element1 : element2".
     *
     * @param myList1 The first list of elements.
     * @param myList2 The second list of elements.
     * @return A new list of strings, each string is a combination of an element from myList1,
     * and an element from myList2.
     */
    fun <T, R> flatMapOfTwoLists(myList1: List<T>, myList2: List<R>): List<String> {
        return myList1.flatMap { a -> myList2.map { b -> "$a : $b" } }
    }

    /**
     * This function takes a list and returns a new list of pairs.
     * Each pair is a combination of two elements from the input list.
     *
     * @param myList The input list of elements.
     * @return A new list of pairs, each pair is a combination of two elements from myList.
     */
    fun <T> flatMapSameList(myList: List<T>): List<Pair<T, T>> {
        return myList.flatMap { a -> myList.map { b -> a to b } }
    }

    /**
     * This function takes a variable number of lists and returns a new list,
     * that is a combination of all the input lists.
     * @param myLists The input lists of elements.
     * @return A new list that is a combination of all the input lists.
     */
    fun <T> flatLists(vararg myLists: List<T>): List<T> {
        return listOf(*myLists).flatten()
    }
}
