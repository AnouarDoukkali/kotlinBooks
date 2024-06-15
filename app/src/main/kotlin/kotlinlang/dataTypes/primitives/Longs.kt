package kotlinlang.dataTypes.primitives

/* File: Longs.kt
 * Author: Anouar Doukkali
 * Created on: 4/24/2024 11:34 AM
 * Description: This file contains functions related to Long data type in Kotlin.
 * Since: v0.1.0
 */
internal object Longs {
    /**
     * Returns the maximum value a Long can have.
     *
     * @return The maximum value a Long can have, which is [Long.MAX_VALUE].
     */
    fun longMAXValue() = Long.MAX_VALUE

    /**
     * Returns the minimum value a Long can have.
     *
     * @return The minimum value a Long can have, which is [Long.MIN_VALUE].
     */
    fun longMinValue() = Long.MIN_VALUE

    /**
     * Adds two Long values and returns the result.
     * if the sum of [a] and [b] would result in a Long overflow, an IllegalArgumentException is thrown.
     * @param a The first Long value.
     * @param b The second-Long value.
     * @return The result of adding [a] and [b].
     */
    fun addTwoLongs(a: Long, b: Long): Long {
        require(!(a > 0 && b > 0 && a + b < 0)) { "Long overflow" }
        return a + b
    }

    fun maxUnsignedLong() = ULong.MAX_VALUE
}
