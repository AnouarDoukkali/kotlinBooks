@file:Suppress("unused", "UNUSED_VARIABLE")

package kotlinlang.collections.arrays
/* File: PrimitiveArrays.kt
 * Author: Anouar Doukkali
 * Created on: 4/30/2024 12:16 PM
 * Description:
 * Since: v0.1.0
 */

@Suppress("SpreadOperator")
private fun primitiveArrays() {
    val primitiveIntArray: IntArray = intArrayOf(1, 2, 3)
    val primitiveLongArray: LongArray = longArrayOf(1, 2, 3)
    val primitiveShortArray: ShortArray = shortArrayOf(1, 2, 3)
    val primitiveByteArray: ByteArray = byteArrayOf(1, 2, 3)
    val primitiveDoubleArray: DoubleArray = doubleArrayOf(1.0, 2.0, 3.0)
    val primitiveFloatArray: FloatArray = floatArrayOf(1.0f, 2.0f, 3.0f)
    // to spread a primitive array, we need to convert it to an array of Array<out T>
    val list = listOf(*primitiveIntArray.toTypedArray())
}
