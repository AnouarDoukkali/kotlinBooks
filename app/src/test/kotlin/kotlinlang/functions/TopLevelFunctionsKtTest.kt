/**
 * File: TopLevelFunctionsKtTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:31 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.functions

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class TopLevelFunctionsKtTest : StringSpec({

    "topLevelFunction should return correct string" {
        topLevelFunction() shouldBe "this is a top-level function"
    }
})
