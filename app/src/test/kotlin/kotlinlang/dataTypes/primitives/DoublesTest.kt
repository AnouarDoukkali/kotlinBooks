package kotlinlang.dataTypes.primitives
/* File: DoublesTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/24/2024 2:22 PM
 * Description: A Kotlin file that test the functionality of the Doubles object.
 * Since: v0.1.0
 */
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class DoublesTest : DescribeSpec({

    describe("a Double") {

        it("is declared this way") {
            val double = 0.3
            val double2: Double = .3
            double shouldBe double
        }
        it("return the minimum value a double  can have") {
            Doubles.doubleMinValue() shouldBe 4.9E-324
        }
        it("return the maximum value a double can have") {
            Doubles.doubleMAXValue() shouldBe 1.7976931348623157E308
        }
        it("should prevent double overflow") {
            val result = shouldThrow<IllegalArgumentException> {
                Doubles.addTwoDoubles(Double.MAX_VALUE, Double.MAX_VALUE)
            }
            result.message shouldBe "Double Overflow"
        }
    }
})
