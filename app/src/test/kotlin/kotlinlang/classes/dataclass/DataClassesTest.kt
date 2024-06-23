/**
 * File: SimpleDataClassTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 5:02 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes.dataclass

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
internal class DataClassesTest : DescribeSpec({
    describe("a data class") {
        val dataClass = DataClass("Anouar", 20)

        it("has a special toString method") {
            dataClass.toString() shouldBe "DataClass(name=Anouar, age=20)"
        }

        it("has a  copy method") {
            val copiedDataClass = dataClass.copy()
            copiedDataClass shouldBe dataClass
        }

        it("has a component1 method") {
            dataClass.component1() shouldBe "Anouar"
        }

        it("is equal to another instance with the same properties") {
            val dataClass2 = DataClass("Anouar", 20)
            (dataClass == dataClass2) shouldBe true
        }

        it("has a hash that is equal to another instance with the same properties") {
            val dataClass2 = DataClass("Anouar", 20)
            dataClass.hashCode() shouldBe dataClass2.hashCode()
        }
    }
})
