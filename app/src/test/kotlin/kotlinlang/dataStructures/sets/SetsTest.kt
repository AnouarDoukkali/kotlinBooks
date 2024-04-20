/**
 * File: SetsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 3:14 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.dataStructures.sets

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class SetsTest : BehaviorSpec({

    Given("two sets") {
        val set = setOf(1, 1, 2, 3, 4, 4, 5, 7, 10, 10)
        var set2 = setOf(1, 2, 3, 4, 5, 7, 10)

        When("checking the set size") {
            then("redundent elements should be removed") {
                set.size shouldBe 7
            }
        }

        When("set2 contain the same elements") {
            then("the two sets should be equal") {
                set shouldBeEqual (set2)
            }
        }

        When("adding an element to set2 by using '+=' operator") {
            set2 += 8
            then("a new set is created under the hood") {
                set2.size shouldBe 8
            }
        }
    }
})
