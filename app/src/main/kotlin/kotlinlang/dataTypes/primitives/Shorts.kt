package kotlinlang.dataTypes.primitives

/* File: Shorts.kt
 * Author: Anouar Doukkali
 * Created on:  4/24/2024 3:15 PM
 * Description: This file contains functions related to Short data type in Kotlin.
 * Since: v0.1.0
 */
/**
 * A class that provides utility methods for the `Short` type.
 */
internal object Shorts {

    /**
     * @return The maximum value of a `Short`.
     */
    fun shortMAXValue() = Short.MAX_VALUE // 32767

    /**
     * @return The minimum value of a `Short`.
     */
    fun shortMINValue() = Short.MIN_VALUE // -32768

    /**
     * Adds two `Short` values together result as an Int.
     * @param a The first `Short` value.
     * @param b The second `Short` value.
     * @return The sum of the two `Short` values.
     */
    fun addShorts(a: Short, b: Short) = a + b

    /**
     * in addition to short, there is also unsigned short, which is a positive short that can have a larger value

     * @return The maximum value an unsigned short can have, which is [UShort.MAX_VALUE].
     */
    fun unsignedByteMAxValue() = UShort.MAX_VALUE
}
