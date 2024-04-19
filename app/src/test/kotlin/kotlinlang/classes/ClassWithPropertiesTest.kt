/**
 * File: ClassWithPropertiesTest.kt
 * Author: Anouar Doukkali
 * Created on: 1/28/2024 7:23 AM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ClassWithPropertiesTest : StringSpec({
    val classWithProperties = MemberProperties()

    "fillTheCup() increases percentFull by given amount when not exceeding max" {
        val result = classWithProperties.fillTheCup(50)
        result shouldBe "you added 50 percent"
    }

    "fillTheCup() sets percentFull to max when trying to exceed max" {
        val result = classWithProperties.fillTheCup(150)
        result shouldBe "the cup is already full!"
    }

    "fillTheCup() sets percentFull to max when exactly reaching max" {
        val result = classWithProperties.fillTheCup(100)
        result shouldBe "the cup is already full!"
    }
})
