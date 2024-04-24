package kotlinlang.collections.sets
/* File: MutableSetsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 3:45 PM
 * Description: demonstrates how to test mutable sets in Kotlin.
 * Since: v0.1.0
 */

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class MutableSetsTest : BehaviorSpec({

    Given("a mutable set of numbers") {
        val numbers = mutableSetOf(1, 1, 1, 2, 3, null, 5, 4, 5, 7, null)
        When("checking the size of the set") {
            then("it should not contain duplicates") {
                numbers.size shouldBe 7
            }
        }
    }
})
