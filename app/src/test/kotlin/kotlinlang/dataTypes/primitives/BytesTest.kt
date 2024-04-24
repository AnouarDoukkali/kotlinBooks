package kotlinlang.dataTypes.primitives
/* File: BytesTest.kt
 * Author: Anouar Doukkali
 * Created on:  4/24/2024 9:43 AM
 * Description: A class that tests the functionality of the Bytes class
 * Since: v0.1.0
 */

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf

internal class BytesTest : DescribeSpec({
    describe("a Byte type") {
        it("is declared as this:") {
            val byte: Byte = 5
            byte shouldBe 5.toByte()
        }

        it("have another type called unsigned Byte, which is a positive byte that can have a larger value") {
            val unsignedByte: UByte = 5u
            unsignedByte shouldBe 5.toUByte()
        }

        it("return the correct maximum value of a Byte") {
            val result = Bytes.byteMAXValue()
            result shouldBe 127.toByte()
        }

        it("return the correct minimum value of a Byte") {
            val result = Bytes.byteMINValue()
            result shouldBe (-128).toByte()
        }

        it("return an Int when added to another Byte") {
            val result = Bytes.addBytes(5, 10)
            result.shouldBeTypeOf<Int>()
        }
        it("return the correct maximum value of an unsigned Byte") {
            val result = Bytes.unsignedByteMAxValue()
            result shouldBe 255.toUByte()
        }
        it("return an Int when added to another Short") {
            val result = Bytes.addToShort(5, 10)
            result.shouldBeTypeOf<Int>()
        }
    }
})
