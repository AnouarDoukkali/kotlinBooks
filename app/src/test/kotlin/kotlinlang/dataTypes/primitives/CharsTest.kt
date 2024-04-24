package kotlinlang.dataTypes.primitives
/* File: CharsTest.kt
 * Author: Anouar Doukkali
 * Created on:  4/24/2024 9:46 AM
 * Description: This file contains tests for the Chars.kt file
 * Since: v0.1.0
 */

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class CharsTest : BehaviorSpec({

    given("a CharacterType instance") {
        When("calling charMAxValue") {
            then("it should return the correct maximum value of a char") {
                val result = Chars.charMAxValue()
                result shouldBe 65535.toChar()
            }
        }
        When("calling charMINValue") {
            then("it should return the correct minimum value of a char") {
                val result = Chars.charMINValue()
                result shouldBe 0.toChar()
            }
        }
        When("calling iterateChar") {
            then("it should return a new string with each character incremented by 1") {
                val result = Chars.iterateChar("jnskhm")
                result shouldBe "kotlin"
            }
        }
        When("calling isCharInString") {
            then("it should return true if the character is present in the string, false otherwise") {
                val result = Chars.isCharInString('a', "abc")
                result shouldBe true
            }
        }
    }
})
