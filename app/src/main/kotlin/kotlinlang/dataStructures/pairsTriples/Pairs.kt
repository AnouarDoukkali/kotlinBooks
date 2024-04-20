/**
 * File: Pairs.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 3:52 PM
 * Description: Pairs in Kotlin
 * Since: v0.1.0
 */
package kotlinlang.dataStructures.pairsTriples

/**
 * ways of declaring a pair of two integer
 */
@Suppress("unused")
private fun pairDeclarations() {
    val pair = Pair(5, 6)
    val pair2 = 5 to 6
    // explicit type declaration
    val pair3: Pair<Int, Int> = Pair(10, 20)
    val pair4 = Pair<Int, Int>(10, 20)
}
