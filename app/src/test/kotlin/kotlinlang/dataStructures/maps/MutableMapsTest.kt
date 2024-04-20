/**
 * File: MutableMapsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 12:28 PM
 * Description: Unit tests for Mutable Maps in Kotlin
 * Since: v0.1.0
 */
package kotlinlang.dataStructures.maps

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class MutableMapsTest : BehaviorSpec({
    Given("a mutable map") {
        val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

        When("adding a new key-value pair") {
            map[4] = "four"
            Then("the map should contain the new key-value pair") {
                map[4] shouldBe "four"
            }
        }

        When("removing a key-value pair") {
            map.remove(1)
            Then("the map should not contain the removed key-value pair") {
                map[1] shouldBe null
            }
        }

        When("updating a key-value pair") {
            map[2] = "deux"
            Then("the map should contain the updated key-value pair") {
                map[2] shouldBe "deux"
            }
        }

        When("clearing the map") {
            map.clear()
            Then("the map should be empty") {
                map.isEmpty() shouldBe true
            }
        }
    }
})
