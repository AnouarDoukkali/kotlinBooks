@file:Suppress("unused", "UNUSED_VARIABLE")

package kotlinlang.collections.maps
/* File: MutableMaps.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 12:26 PM
 * Description: Mutable Maps in Kotlin
 * Since: v0.1.0
 */

/**
 * demonstrates how to initialize mutable maps in Kotlin
 */
@Suppress("unused")
private fun mutableMaps() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val map3: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val map4 = mutableMapOf(Pair("one", 1))
}
