package kotlinlang.dataTypes.primitives
/* File: ShortsTest.kt
 * Author: Anouar Doukkali
 * Created on:  4/24/2024 9:47 AM
 * Description: A test file that tests the functionality of the ShortType object
 * Since: v0.1.0
 */
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ShortsTest : DescribeSpec({
    describe("a Short type") {
        it("is declared like this:") {
            val short: Short = 5
            short shouldBe 5.toShort()
        }
        it("has another type called unsigned Short, which is a positive Short that can have a larger value") {
            val unsignedShort: UShort = 5u
            unsignedShort shouldBe 5.toUShort()
        }
        it("should return the correct maximum value of a short") {
            val result = Shorts.shortMAXValue()
            result shouldBe 32767.toShort()
        }

        it("should return the correct minimum value of a short") {
            val result = Shorts.shortMINValue()
            result shouldBe (-32768).toShort()
        }

        it("should return the correct maximum value of an unsigned short") {
            val result = Shorts.unsignedByteMAxValue()
            result shouldBe 65535.toUShort()
        }

        it("should return an Int when added to another Short") {
            val result = Shorts.addShorts(5, 10)
            result shouldBe 15
        }
    }
})
