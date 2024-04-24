package kotlinlang.collections.maps
/* File: MapsKtTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 12:11 PM
 * Description: Unit tests for Maps in Kotlin
 * Since: v0.1.0
 */

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class MapsTest : BehaviorSpec({

    Given("a map") {
        val map = mapOf(1 to "one", 2 to "two", 3 to "three")

        When("getting a value by key") {
            val value = map[1]
            Then("the value should be correct") {
                value shouldBe "one"
            }
        }

        When("getting a value by key that does not exist") {
            val value = map[10]
            Then("the value should be null") {
                value shouldBe null
            }
        }

        When("looping on the map") {
            var result = ""
            for ((key, value) in map) {
                result += "$key : $value\n"
            }
            Then("the result should be the keys and values") {
                result shouldBe "1 : one\n2 : two\n3 : three\n"
            }
        }
    }
})
