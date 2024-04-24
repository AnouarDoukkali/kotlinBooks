package kotlinlang.dataTypes.primitives
/* File: LongsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/24/2024 11:45 AM
 * Description:
 * Since: v0.1.0
 */
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf

@Tags("unitTest")
class LongsTest : DescribeSpec({
    describe("long type") {

        it("can be declared like:") {
            val long1 = 100L
            val long2: Long = 100
            val long3 = 100UL
            long1 shouldBe long2
            long3.shouldBeInstanceOf<ULong>()
        }
        it("should return the maximum value a Long can have") {
            val longMAXValue: Long = Longs.longMAXValue()
            longMAXValue shouldBe 9223372036854775807
        }
        it("should return the minimum value a Long can have") {
            val longMinValue: Long = Longs.longMinValue()
            longMinValue shouldBe -9223372036854775807L - 1L
        }
        it("return the maximum value an unsigned Long can have") {
            val max = Longs.maxUnsignedLong()
            max shouldBe 18446744073709551615u
        }
        it("calling addTwoLongs should prevent overflow") {
            val max = Long.MAX_VALUE

            val result = shouldThrow<IllegalArgumentException> {
                Longs.addTwoLongs(max, max)
            }
            result.message shouldBe "Long overflow"
        }
    }
})
