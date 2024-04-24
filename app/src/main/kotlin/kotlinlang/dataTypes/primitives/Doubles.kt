package kotlinlang.dataTypes.primitives

/* File: Doubles.kt
 * Author: Anouar Doukkali
 * Created on: 4/24/2024 1:34 PM
 * Description: A Kotlin file that demonstrates the usage of Double in Kotlin.
 * Since: v0.1.0
 */
internal object Doubles {
    /**
     * Returns the minimum value a Double can have.
     *
     * @return The minimum value a Double can have, which is [Double.MIN_VALUE].
     */
    fun doubleMinValue() = Double.MIN_VALUE

    /**
     * Returns the maximum value a Double can have.
     *
     * @return The maximum value a Double can have, which is [Double.MAX_VALUE].
     */
    fun doubleMAXValue() = Double.MAX_VALUE

    /**
     * Adds two Double values and returns the result.
     * Throws an exception if the result is positive infinity, indicating an overflow.
     *
     * @param a The first Double value.
     * @param b The second Double value.
     * @return The result of adding [a] and [b].
     * @throws IllegalArgumentException if the result of adding [a] and [b] is positive infinity.
     */
    fun addTwoDoubles(a: Double, b: Double): Double {
        require(a + b != Double.POSITIVE_INFINITY) { "Double Overflow" }
        return a + b
    }
}
