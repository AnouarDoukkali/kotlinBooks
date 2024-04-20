/**
 * File: FlatMapTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 3:00 AM
 * Description: This file contains the unit tests for the FlatMap class.
 * Since: v0.1.0
 */
package kotlinlang.collectionsOperations

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainExactly

@Tags("unitTest")
class FlatMapTest : StringSpec({

    "flatMapTwoLists returns correct combination of elements" {
        val flatMap = FlatMap(listOf(1, 2), listOf("anouar", "doukkali"))
        flatMap.flatMapOfTwoLists().shouldContainExactly("1 : anouar", "1 : doukkali", "2 : anouar", "2 : doukkali")
    }

    "flatMapSameList returns correct pairs" {
        val flatMap = FlatMap(listOf(1, 2))
        flatMap.flatMapSameList().shouldContainExactly(1 to 1, 1 to 2, 2 to 1, 2 to 2)
    }
})
