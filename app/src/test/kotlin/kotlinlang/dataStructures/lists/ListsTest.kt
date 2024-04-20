/**
 * File: ListsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 11:05 AM
 * Description: This file demonstrates how to test the lists in Kotlin.
 * Since: v0.1.0
 */
package kotlinlang.dataStructures.lists

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class ListsTest : BehaviorSpec({

    // demonstrates how to alias a mutable list to an immutable list
    Given("a mutable list") {
        val mutable = mutableListOf(1)
        When("a an immutable list is aliased to the mutable list") {
            val immutable: List<Int> = mutable
            and("the mutable list is updated") {
                mutable.add(2)
            }
            Then("the immutable list should be updated") {
                immutable shouldBe listOf(1, 2)
            }
        }
    }

    // demonssrates the use of the '+= sign' to add an element to an immutable list
    Given("an immutable list") {
        var immutable = listOf(1, 2, 3)
        When("using '+= signe' to add a new element") {
            // This operation does not modify the original list but creates a new list with the added element
            immutable += 4
            Then("a new list is created under the hood") {
                immutable shouldBe listOf(1, 2, 3, 4)
            }
        }
    }

    // demonstrates iterating over a list
    Given("a list") {
        val list = listOf(1, 2, 3)
        When("iterating over the list") {
            for (i in list) {
                then("the iterator should return the elements in the list") {
                    i shouldBe list[i - 1]
                }
            }
        }
        When("using the 'withIndex()' function") {
            for ((index, value) in list.withIndex()) {
                then(" the index should be the position of the value in the list") {
                    index shouldBe list.indexOf(value)
                }
            }
        }
    }
})
