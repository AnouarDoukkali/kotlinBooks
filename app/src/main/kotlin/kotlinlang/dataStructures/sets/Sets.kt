/**
 * File: Sets.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 3:10 PM
 * Description: this file contains examples about sets in Kotlin
 * Since: v0.1.0
 */
package kotlinlang.dataStructures.sets

/**
 * Sets are collections of unique elements. They are used to store elements that are unique.
 * The order of elements in a set is undefined.
 */
@Suppress("unused")
private fun sets() {
    val a = setOf(1, 1, 2)
    val b: Set<Int> = setOf(1, 2, 3)
    val c = emptySet<Int>()
}
