/**
 * File: MemberFunctionsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:27 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.functions

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class MemberFunctionsTest : StringSpec({
    "accessMember should return correct string when called with name Anouar" {
        val memberFunctions = MemberFunctions("Anouar")
        memberFunctions.accessAnotherMember() shouldBe "your name is: Anouar"
    }
})
