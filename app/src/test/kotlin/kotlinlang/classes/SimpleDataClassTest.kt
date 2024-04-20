/**
 * File: SimpleDataClassTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 5:02 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
internal class SimpleDataClassTest : BehaviorSpec({
    Given("a SimpleDataClass instance") {
        val simpleDataClass = SimpleDataClass("Anouar", 20)

        When("toString is called") {
            val result = simpleDataClass.toString()

            Then("it should return the correct string representation") {
                result shouldBe "SimpleDataClass(name=Anouar, age=20)"
            }
        }

        When("copy is called") {
            val simpleDataClass2 = simpleDataClass.copy()

            Then("it should create a new object with the same properties") {
                (simpleDataClass == simpleDataClass2) shouldBe true
            }
        }
    }

    Given("two identical SimpleDataClass instances") {
        val simpleDataClass1 = SimpleDataClass("Test")
        val simpleDataClass2 = SimpleDataClass("Test")

        Then("they should be equal and their hashCodes should be the same") {
            (simpleDataClass1 == simpleDataClass2) shouldBe true
            simpleDataClass1.hashCode() shouldBe simpleDataClass2.hashCode()
        }
    }

    Given("two different SimpleDataClass instances") {
        val simpleDataClass1 = SimpleDataClass("Test")
        val simpleDataClass2 = SimpleDataClass("Different")

        Then("they should not be equal") {
            (simpleDataClass1 == simpleDataClass2) shouldBe false
        }
    }
})
