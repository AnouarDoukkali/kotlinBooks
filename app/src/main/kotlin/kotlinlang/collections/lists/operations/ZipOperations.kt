package kotlinlang.collections.lists.operations
/* File: ZipOperations.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 9:10 AM
 * Description: This file contains operations that can be performed on lists using the zip function.
 * Since: v0.1.0
 */

/**
 * object  providing operations on lists using the zip function.
 */
internal object ZipOperations {

    /**
     * Zips two lists together into a list of pairs.
     *
     * @param left The first list to zip.
     * @param right The second list to zip.
     * @return A list of pairs where each pair contains an element from the first list
     * and the corresponding element from the second list.
     */
    fun <T, S> normalZip(left: List<T>, right: List<S>): List<Pair<T, S>> {
        return left.zip(right)
    }

    /**
     * Zips two lists together into a list of maps.
     *
     * @param left The first list to zip.
     * @param right The second list to zip.
     * @return A list of maps where each map contains a key from the first list
     * and the corresponding value from the second list.
     */
    fun <T, S> customZip(left: List<T>, right: List<S>): List<Map<T, S>> {
        return left.zip(right) { key, value -> mapOf(key to value) }
    }

    /**
     * Zips a list with its next element.
     *
     * @param left The list to zip.
     * @return A list of pairs where each pair contains an element and its next element in the list.
     */
    fun <T> zipNext(left: List<T>): List<Pair<T, T>> {
        return left.zipWithNext()
    }
}
