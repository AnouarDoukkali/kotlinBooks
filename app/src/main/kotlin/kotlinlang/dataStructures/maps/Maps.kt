/**
 * File: Maps.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 12:07 PM
 * Description: Maps in Kotlin
 * Since: v0.1.0
 */
package kotlinlang.dataStructures.maps

/**
 * A map is a collection of key-value pairs, where each key is unique.
 * @see MapsTest
 */
@Suppress("unused")
private fun maps() {
    val map1 = mapOf(1 to "one", 2 to "two", 3 to "three")

    // more explicit type declaration
    val map2 = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    val map3: Map<Int, Int> = mapOf<Int, Int>(1 to 2)
    var map4 = mapOf<Int, Int>(1 to 2)
}
