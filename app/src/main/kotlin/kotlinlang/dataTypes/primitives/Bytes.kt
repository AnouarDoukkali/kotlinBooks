package kotlinlang.dataTypes.primitives

/* File: Bytes.kt
 * Author: Anouar Doukkali
 * Created on:  6/21/2024 10:53 AM
 * Description: this file contains functions related to Byte data type in Kotlin
 * Since: v0.1.0
 */

/**
 * A class that provides utility methods for the `Byte` type.
 */
internal object Bytes {
    /**
     * @return The maximum value of a `Byte`.
     */
    fun byteMAXValue() = Byte.MAX_VALUE // 127

    /**
     * @return The minimum value of a `Byte`.
     */
    fun byteMINValue() = Byte.MIN_VALUE // -128

    /**
     * Adds two bytes together will result as an Int.
     * @param a The first byte.
     * @param b The second byte.
     * @return The sum of the two bytes as an Int.
     */
    fun addBytes(a: Byte, b: Byte) = a + b

    /**
     * Adds a byte to a short will result as an Int.
     *
     * @param a The byte.
     * @param b The short.
     * @return The sum of the byte and the short as an Int.
     */
    fun addToShort(a: Byte, b: Short) = a + b

    /**
     * in addition to byte, there is also unsigned byte, which is a positive byte that can have a larger value

     * @return The maximum value an unsigned Byte can have, which is [UByte.MAX_VALUE].
     */
    fun unsignedByteMAxValue() = UByte.MAX_VALUE
}
