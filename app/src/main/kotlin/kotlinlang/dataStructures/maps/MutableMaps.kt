/**
 * File: MutableMaps.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 12:26 PM
 * Description: Mutable Maps in Kotlin
 * Since: v0.1.0
 */
package kotlinlang.dataStructures.maps

/**
 * demonstrates how to initialize mutable maps in Kotlin
 * @see MutableMapsTest
 */
@Suppress("unused")
private fun mutableMaps() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val map2 = mutableMapOf<Int, String>(1 to "one", 2 to "two")
    val map3: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val map4 = mutableMapOf(Pair("one", 1))
}
