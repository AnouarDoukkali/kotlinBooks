package kotlinlang.collections.lists.operations
/* File: FlatOperationsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 6:20 AM
 * Description: This file contains tests for flat operations.
 * Since: v0.1.0
 */

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
internal class FlatOperationsTest : DescribeSpec({

    describe("two lists") {
        val list1 = listOf("a", "b", "c")
        val list2 = listOf(1, 2, 3)

        it("can be flatten for each individual element") {
            val result = FlatOperations.flatMapOfTwoLists(list1, list2)
            val expected = listOf("a : 1", "a : 2", "a : 3", "b : 1", "b : 2", "b : 3", "c : 1", "c : 2", "c : 3")
            result shouldBe expected
        }
    }
    describe("multiple lists") {
        val list1 = listOf("a", "b", "c")
        val list2 = listOf(1, 2, 3)
        val list3 = listOf(1.1, 2.2, 3.3)

        it("can be flatten") {
            val result = FlatOperations.flatLists(list1, list2, list3)
            val expected = listOf("a", "b", "c", 1, 2, 3, 1.1, 2.2, 3.3)
            result shouldBe expected
        }
    }

    describe("a list") {
        val list = listOf("a", "b", "c")

        it("can be flatten for each individual element") {
            val result = FlatOperations.flatMapSameList(list)
            val expected = listOf(
                "a" to "a", "a" to "b", "a" to "c",
                "b" to "a", "b" to "b", "b" to "c",
                "c" to "a", "c" to "b", "c" to "c"
            )
            result shouldBe expected
        }
    }
})
