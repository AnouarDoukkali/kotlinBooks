package kotlinlang.classes.enumeration
/* File: ColorTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/25/2024 3:59 PM
 * Description:
 * Since: v0.1.0
 */
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class ColorTest : DescribeSpec({

    describe("Enumeration class") {
        val red = Color.RED
        it("have properties") {

            red.rgb shouldBe 0xFF0000
        }
        it("have functions") {
            red.mixedColor(Color.GREEN) shouldBe "Yellow"
        }
    }
})
