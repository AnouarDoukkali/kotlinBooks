package kotlinlang.dataTypes.primitives

/* File: Floats.kt
 * Author: Anouar Doukkali
 * Created on: 4/24/2024 1:34 PM
 * Description: This file contains functions related to Float data type in Kotlin.
 * Since: v0.1.0
 */
internal object Floats {
    /**
     * Returns the minimum value a Float can have.
     *
     * @return The minimum value a Float can have, which is [Float.MIN_VALUE].
     */
    fun floatMinValue() = Float.MIN_VALUE

    /**
     * Returns the maximum value a Float can have.
     *
     * @return The maximum value a Float can have, which is [Float.MAX_VALUE].
     */
    fun floatMAXValue() = Float.MAX_VALUE

    /**
     * Adds two Float values and returns the result.
     * Throws an exception if the result is positive infinity, indicating an overflow.
     *
     * @param a The first Float value.
     * @param b The second Float value.
     * @return The result of adding [a] and [b].
     * @throws IllegalArgumentException if the result of adding [a] and [b] is positive infinity.
     */
    fun addTwoFloats(a: Float, b: Float): Float {
        require(a + b != Float.POSITIVE_INFINITY) { "Float Overflow" }
        return a + b
    }
}
