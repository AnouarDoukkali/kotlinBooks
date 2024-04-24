package kotlinlang.dataTypes.primitives
/* File: FloatsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/24/2024 1:42 PM
 * Description:
 * Since: v0.1.0
 */
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class FloatsTest : DescribeSpec({
    describe("a Float") {

        it("is declared this way") {
            val float = 0.3f
            val float2: Float = .3f
            float shouldBe float2
        }
        it("return the minimum value a Float can have") {
            Floats.floatMinValue() shouldBe 1.4E-45f
        }
        it("return the maximum value a Float can have") {
            Floats.floatMAXValue() shouldBe 3.4028235E38f
        }
        it("should prevent float overflow") {
            val result = shouldThrow<IllegalArgumentException> {
                Floats.addTwoFloats(Float.MAX_VALUE, Float.MAX_VALUE)
            }
            result.message shouldBe "Float Overflow"
        }
    }
})
