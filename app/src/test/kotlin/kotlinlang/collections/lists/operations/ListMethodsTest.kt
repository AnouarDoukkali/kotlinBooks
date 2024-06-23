@file:Suppress("unused", "UnusedVariable")

package kotlinlang.collections.lists.operations

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.equals.shouldBeEqual
import io.kotest.matchers.shouldBe
import kotlinlang.special.Person
import kotlinlang.special.Student
import kotlin.collections.flatMap

/* File: ListAllMethodsTest.kt
 * Author: Anouar Doukkali
 * Created on: 6/22/2024 1:42 PM
 * Description:
 * Since: v0.1.0
 */

@Tags("unitTest", "slow", "list")
internal class ListMethodsTest : FreeSpec({
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val alphabet = listOf("a", "b", "c", "d", "e", "f")
    val persons = listOf(
        Person("Alice", 20),
        Person("Jack", 20),
        Person("Bob", 25),
        Person("Eve", 30)
    )
    "partition" - {
        // "split the list into two lists using the predicat"
        val (even, odd) = numbers.partition { it % 2 == 0 }
        val (young, adult) = persons.partition { it.age < 30 }
        even shouldBe listOf(2, 4, 6, 8, 10)
        odd shouldBe listOf(1, 3, 5, 7, 9)
        young shouldBe listOf(Person("Alice", 20), Person("Jack", 20), Person("Bob", 25))
        adult shouldBe listOf(Person("Eve", 30))
    }
    "map" - {
        // return a new list with the result of applying the given transform function to each element in the list
        numbers.map { it * 2 } shouldBe listOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
        numbers.map(Int::inc) shouldBe listOf(2, 3, 4, 5, 6, 7, 8, 9, 10, 11) // calling inc by reference
    }
    "mapIndexed" - {
        val names = listOf("anouar", "bob")
        val result = names.mapIndexed(::Student) // creating a new list of students by calling constructor
        val result2 = names.mapIndexed { index, value -> Student(index, value) } // similar to this
        result shouldBeEqual result2
        val alphabets = alphabet.mapIndexed { index, value -> "[$index:$value]" }
        alphabets shouldBe listOf("[0:a]", "[1:b]", "[2:c]", "[3:d]", "[4:e]", "[5:f]")
    }
    "flatMap" - {
        // when using flatmap ,it take each element from the first list and process it to every element
        // on the second list , then it flat them all
        (1..2).flatMap { left -> (10..11).map { right -> left + right } } shouldBe listOf(
            11, 12, 12, 13
        )
        // we could use flatmap with only one list to map and flatten in same time
        val bigList = listOf(
            Pair(1, listOf("a", "b")), Pair(2, listOf("c", "d")), Pair(3, listOf("e", "f"))
        )
        // here we map the list to take only the second items , then kotlin flat them all
        bigList.flatMap { it.second } shouldBe listOf("a", "b", "c", "d", "e", "f")
    }
    "zip" - {
        // zipping two lists provide a list of pairs of elements from both lists
        numbers.zip(alphabet) shouldBe listOf(
            Pair(1, "a"), Pair(2, "b"), Pair(3, "c"), Pair(4, "d"),
            Pair(5, "e"), Pair(6, "f")

        )
        // we can zip a range to a a list
        (10..13).zip(numbers) shouldBe listOf(10 to 1, 11 to 2, 12 to 3, 13 to 4)
        // we can perform custom operation while zipping
        (10..13).zip(numbers) { left, right -> left + right } shouldBe listOf(
            11, 13, 15, 17
        )
        // the same result using reference call operator
        (10..13).zip(numbers, Int::plus) shouldBe listOf(
            11, 13, 15, 17
        )
    }
    "associateWith" - {
    }
})
