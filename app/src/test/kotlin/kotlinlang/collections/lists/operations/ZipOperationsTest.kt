package kotlinlang.collections.lists.operations
/* File: ZipOperationsTest.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 10:00 AM
 * Description: This file contains tests for the ZipOperations Object.
 * Since: v0.1.0
 */

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class ZipOperationsTest : BehaviorSpec({
    Given("two lists") {

        val list1 = listOf(1, 2, 3)
        val list2 = listOf("a", "b", "c")

        When("they are zipped") {
            val result = ZipOperations.normalZip(list1, list2)

            Then("it should return a list of pairs") {
                result shouldBe listOf(Pair(1, "a"), Pair(2, "b"), Pair(3, "c"))
            }
        }
        When("they are custom zipped") {
            val result = ZipOperations.customZip(list1, list2)

            Then("it should return a list of maps") {
                result shouldBe listOf(mapOf(1 to "a"), mapOf(2 to "b"), mapOf(3 to "c"))
            }
        }
    }
    given("a list") {
        val list1 = listOf(1, 2, 3)

        When("it is zipped with next element") {
            val result = ZipOperations.zipNext(list1)

            Then("it should return a list of pairs with each element and its next") {
                result shouldBe listOf(Pair(1, 2), Pair(2, 3))
            }
        }
    }
})
