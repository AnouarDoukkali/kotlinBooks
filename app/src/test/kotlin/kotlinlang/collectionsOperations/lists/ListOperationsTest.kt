/**
 * File: ListOperationsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 8:56 AM
 * Description: This file contains tests for the ListOperations class.
 * Since: v0.1.0
 */
package kotlinlang.collectionsOperations.lists

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
internal class ListOperationsTest : BehaviorSpec({
    Given("a ListOperations instance") {
        val listOperations = ListOperations()
        and("a list of Persons") {
            val persons = listOf(
                Person("Alice", 21),
                Person("Bob", 25),
                Person("Carol", 25),
                Person("Dan", 25),
                Person("Eve", 30)
            )

            When("groupPersonByAge is called") {
                val result = listOperations.groupPersonByAge(persons)

                Then("it should return a map grouped by age") {
                    result[21] shouldBe listOf(Person("Alice", 21))
                    result[25] shouldBe listOf(
                        Person("Bob", 25),
                        Person("Carol", 25),
                        Person("Dan", 25)
                    )
                    result[30] shouldBe listOf(Person("Eve", 30))
                }
            }

            When("associate is called") {
                val result = listOperations.associate(persons)

                Then("it should return a map with the last person of each age") {
                    result[21] shouldBe Person("Alice", 21)
                    result[25] shouldBe Person("Dan", 25)
                    result[30] shouldBe Person("Eve", 30)
                }
            }
        }
    }
})
