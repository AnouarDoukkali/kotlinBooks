package kotlinlang.dataTypes.primitives
/* File: IntegersTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/24/2024 10:08 AM
 * Description:
 * Since: v0.1.0
 */
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf

@Tags("unitTest")
class IntegersTest : DescribeSpec({
    describe("Integers") {

        it("is assigned as primitive by default") {
            val i = 5
            val unsigner = 5u
            i.shouldBeInstanceOf<Int>()
            unsigner.shouldBeInstanceOf<UInt>()
        }
        it("it can use uderscore to simplify reading large numbers") {
            val million = 1_000_000
            million shouldBe 1000000
        }
        it("should return the maximum value an Int can have") {
            val max = Integers.intMAXValue()
            max shouldBe 2147483647
        }
        it("should return the minimum value an Int can have") {
            val min = Integers.intMINValue()
            min shouldBe -2147483648
        }
        it("should add two integers together") {
            val sum = Integers.addInts(5, 10)
            sum shouldBe 15
        }

        it("should prevent integer overflow when calling sum") {
            val max = Integers.intMAXValue()
            val sum = shouldThrow<IllegalArgumentException> {
                Integers.addInts(max, max)
            }
            sum.message shouldBe "Integer overflow"
        }

        it("should return the maximum value an unsigned Int can have") {
            val max = Integers.maxUnsignedInt()
            max shouldBe 4294967295u
        }
    }
})
