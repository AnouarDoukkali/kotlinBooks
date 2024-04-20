/**
 * File: ConstructorsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:00 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldNotBe

@Tags("unitTest")
internal class ConstructorsTest : BehaviorSpec({
    Given("a class") {
        When("it is initialized with provided properties") {
            val constructors = Constructors("property1", 1)
            Then("it should not be null") {
                constructors shouldNotBe null
            }
        }
    }
})
