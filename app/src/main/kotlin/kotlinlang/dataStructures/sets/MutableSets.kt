/**
 * File: MutableSets.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 3:51 PM
 * Description: This file contains examples about mutable sets in Kotlin.
 * Since: @version
 */
package kotlinlang.dataStructures.sets

private fun mutableSets() {
    val numbers = mutableSetOf(1, 2, 3, 4, 5, 7)
    numbers.add(8) // we can add to a mutableSet
    val alphabet = mutableSetOf<String>("a", "b", "c", "d", "e", "f")
    alphabet += "p" // the char is added directly and no extra set is created
    val chars: MutableSet<Char> = mutableSetOf('a', 'b', 'c', 'd', 'e', 'f')
}
