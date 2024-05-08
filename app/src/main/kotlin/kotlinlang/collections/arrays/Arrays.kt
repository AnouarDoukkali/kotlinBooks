@file:Suppress("unused")

package kotlinlang.collections.arrays

/* File: Arrays.kt
 * Author: Anouar Doukkali
 * Created on: 4/30/2024 12:20 PM
 * Description:
 * Since: v0.1.0
 */

@Suppress("SpreadOperator")
private fun arrays() {
    val preSizedArray = Array(5) { 0 }
    val arr = arrayOf(1, 2, 3)
    val arr2 = arrayOfNulls<Int>(3)
    val arr3 = Array(3) { it } // contain an array filled with index
    val arr4 = Array(3) { it * 2 } // contain an array filled with index * 2
    // we can spread an array using the spread operator
    val list = listOf(*arr)
}
