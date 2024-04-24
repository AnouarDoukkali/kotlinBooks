package kotlinlang.collections.pairsTriples
/* File: TripleTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/20/2024 4:13 PM
 * Description: demonstrates how to use Triple in Kotlin
 * Since: v0.1.0
 */

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class TripleTest : BehaviorSpec({

    Given("a Triple of three elements") {
        val triple = Triple(1, 2, 3)
        When(" using destructuring declaration") {
            val (a, b, c) = triple
            then("the elements should be assigned to the variables respectively") {
                a shouldBe 1
                b shouldBe 2
                c shouldBe 3
            }
        }
        When("skipping the first element") {
            val (_, b, c) = triple
            then("the first element should be skipped") {
                b shouldBe 2
                c shouldBe 3
            }
        }
    }
})
