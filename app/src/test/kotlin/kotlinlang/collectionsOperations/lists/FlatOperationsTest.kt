/**
 * File: FlatOperationsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 6:20 AM
 * Description: This file contains tests for the FlatOperations class.
 * Since: v0.1.0
 */
package kotlinlang.collectionsOperations.lists

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class FlatOperationsTest : BehaviorSpec({
    val flatOperations = FlatOperations()

    Given("two lists") {
        val list1 = listOf("a", "b", "c")
        val list2 = listOf(1, 2, 3)

        When("flatMapOfTwoLists is called") {
            val result = flatOperations.flatMapOfTwoLists(list1, list2)

            Then("it should combine elements from two lists") {
                val expected = listOf("a : 1", "a : 2", "a : 3", "b : 1", "b : 2", "b : 3", "c : 1", "c : 2", "c : 3")
                result shouldBe expected
            }
        }
    }

    Given("an empty list and a non-empty list") {
        val list1 = listOf<String>()
        val list2 = listOf(1, 2, 3)

        When("flatMapOfTwoLists is called") {
            val result = flatOperations.flatMapOfTwoLists(list1, list2)

            Then("it should return an empty list") {
                result shouldBe emptyList<String>()
            }
        }
    }

    Given("a list") {
        val list = listOf("a", "b", "c")

        When("flatMapSameList is called") {
            val result = flatOperations.flatMapSameList(list)

            Then("it should combine elements from the same list") {
                val expected = listOf(
                    "a" to "a",
                    "a" to "b",
                    "a" to "c",
                    "b" to "a",
                    "b" to "b",
                    "b" to "c",
                    "c" to "a",
                    "c" to "b",
                    "c" to "c"
                )
                result shouldBe expected
            }
        }
    }

    Given("an empty list") {
        val list = listOf<String>()

        When("flatMapSameList is called") {
            val result = flatOperations.flatMapSameList(list)

            Then("it should return an empty list") {
                result shouldBe emptyList<Pair<String, String>>()
            }
        }
    }

    Given("multiple lists") {
        val list1 = listOf("a", "b", "c")
        val list2 = listOf(1, 2, 3)
        val list3 = listOf(1.1, 2.2, 3.3)

        When("flatLists is called") {
            val result = flatOperations.flatLists(list1, list2, list3)

            Then("it should combine elements from multiple lists") {
                val expected = listOf("a", "b", "c", 1, 2, 3, 1.1, 2.2, 3.3)
                result shouldBe expected
            }
        }
    }

    Given("multiple empty lists") {
        val list1 = listOf<String>()
        val list2 = listOf<Int>()
        val list3 = listOf<Double>()

        When("flatLists is called") {
            val result = flatOperations.flatLists(list1, list2, list3)

            Then("it should return an empty list") {
                result shouldBe emptyList<Any>()
            }
        }
    }
})
