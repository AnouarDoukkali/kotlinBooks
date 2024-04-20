/**
 * File: MemberPropertiesTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:36 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class MemberPropertiesTest : StringSpec({

    "name property should be initialized with a value" {
        val memberProperties = MemberProperties()
        memberProperties.name = "Anouar"
        memberProperties.name shouldBe "Anouar"
    }
    "name property should throw an exception when accessed before initialization" {
        val memberProperties = MemberProperties()
        try {
            memberProperties.name
        } catch (e: UninitializedPropertyAccessException) {
            e.message shouldBe "lateinit property name has not been initialized"
        }
    }
})
