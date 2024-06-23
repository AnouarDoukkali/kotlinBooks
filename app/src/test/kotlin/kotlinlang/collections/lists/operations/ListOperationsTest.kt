package kotlinlang.collections.lists.operations
/* File: ListOperationsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 8:56 AM
 * Description: This file contains tests for the  operations on lists.
 * Since: v0.1.0
 */

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import kotlinlang.special.Person

@Tags("unitTest")
internal class ListOperationsTest : DescribeSpec({
    describe("a List") {
        val persons = listOf(
            Person("Alice", 21),
            Person("Bob", 25),
            Person("Carol", 25),
            Person("Dan", 25),
            Person("Eve", 30)
        )
        it("can be grouped by age") {
            val result = ListOperations.groupPersonByAge(persons)

            result[21] shouldBe listOf(Person("Alice", 21))
            result[25] shouldBe listOf(
                Person("Bob", 25),
                Person("Carol", 25),
                Person("Dan", 25)
            )
            result[30] shouldBe listOf(Person("Eve", 30))
        }
        it("can be associated") {
            val result = ListOperations.associate(persons)
            result[21] shouldBe Person("Alice", 21)
            result[25] shouldBe Person("Dan", 25)
            result[30] shouldBe Person("Eve", 30)
        }
    }
})
