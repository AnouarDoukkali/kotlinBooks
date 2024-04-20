package kotlinlang.dataStructures.lists

/**
 * File: MutableLists.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 11:51 AM
 * Description: This file demonstrates how to create and initialize mutable lists in Kotlin.
 * Since: v0.1.0
 */

/**
 * This function demonstrates how to create and initialize mutable lists in Kotlin.
 * @see MutableListsKtTest
 */
@Suppress("unused")
private fun initializeMutableLists() {
    val default = MutableList(5) { it } // a mutable list of Int instances with default size and values of '0's
    val a = mutableListOf("A", "B", "C", "D", "E") // a mutable list of String instances
    val b = mutableListOf<Int>() // empty list of Int
    val c: MutableList<String> = mutableListOf() // empty list of String
}
