/**
 * File: MemberFunctionsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:27 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.functions

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
class MemberFunctionsTest : BehaviorSpec({
    given("a class MemberFunction") {
        When("instanciated with name Anouar") {
            val memberFunctions = MemberFunctions("Anouar")
            Then("accessAnotherMember  should return correct string") {
                memberFunctions.accessAnotherMember() shouldBe "your name is: Anouar"
            }
        }
    }
})
