/**
 * File: MemberFunctionsTest.kt
 * Author: Anouar Doukkali
 * Created on: 1/28/2024 6:52 AM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MemberFunctionsTest : StringSpec({
    "MemberFunctionsTest" {
        val memberFunctions = MemberFunctions().accessMember()
        memberFunctions shouldBe "this is a member function"
    }
    "TopLevelFunctionsTest" {
        val topLevelFunctions = topLevelFunction()
        topLevelFunctions shouldBe "this is a top-level function"
    }
})
