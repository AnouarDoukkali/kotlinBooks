package kotlinlang.dataTypes.primitives

/* File: Integers.kt
 * Author: Anouar Doukkali
 * Created on: 4/24/2024 10:02 AM
 * Description: This file contains functions related to Int data type in Kotlin.
 * Since: v0.1.0
 */
internal object Integers {
    /**
     * Returns the maximum value an Int can have.
     * @return The maximum value an Int can have, which is [Int.MAX_VALUE].
     */
    fun intMAXValue() = Int.MAX_VALUE

    /**
     * Returns the minimum value an Int can have.
     * @return The minimum value an Int can have, which is [Int.MIN_VALUE].
     */
    fun intMINValue() = Int.MIN_VALUE

    /**
     * Adds two integers together and checks for integer overflow.
     * @param a The first integer to add.
     * @param b The second integer to add.
     * @throws IllegalArgumentException if the sum of [a] and [b] would result in an integer overflow.
     * @return The sum of [a] and [b].
     */
    fun addInts(a: Int, b: Int): Int {
        require(!(a > 0 && b > 0 && a + b < 0)) { "Integer overflow" }
        return a + b
    }

    /**
     * in addition to Int, there is also unsigned Int, which is a positive Int that can have a larger value
     *
     * Returns the maximum value an unsigned Int can have.
     * @return The maximum value an unsigned Int can have, which is [UInt.MAX_VALUE].
     */
    fun maxUnsignedInt() = UInt.MAX_VALUE
}
