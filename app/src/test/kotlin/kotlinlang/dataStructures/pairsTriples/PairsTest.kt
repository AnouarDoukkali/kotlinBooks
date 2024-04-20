/**
 * File: PairsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 4:00 PM
 * Description: demonstrates how to test the Pairs class
 * Since: v0.1.0
 */
package kotlinlang.dataStructures.pairsTriples

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class PairsTest : BehaviorSpec({

    Given("a pair") {
        val pair = Pair(1, 2)

        When("using destructing declaration") {
            val (first, second) = pair
            Then("the first element should be 1 and the second should be 2") {
                first shouldBe 1
                second shouldBe 2
            }
        }
    }
})
