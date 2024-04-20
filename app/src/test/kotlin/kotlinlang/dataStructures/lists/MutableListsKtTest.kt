/**
 * File: MutableListsKtTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 11:58 AM
 * Description: This file demonstrates how to test the mutable lists in Kotlin.
 * Since: v0.1.0
 */
package kotlinlang.dataStructures.lists

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class MutableListsKtTest : BehaviorSpec({
    Given("a mutable list of Int") {
        val list = mutableListOf(1, 2, 3)
        When("adding an element to the list") {
            list.add(4)
            Then("the list should contain the new element") {
                list.contains(4) shouldBe true
            }
        }
        When("removing an element from the list") {
            list.remove(2)
            Then("the list should not contain the removed element") {
                list.contains(2) shouldBe false
            }
        }
        When("clearing the list") {
            list.clear()
            Then("the list should be empty") {
                list.isEmpty() shouldBe true
            }
        }
    }
})
