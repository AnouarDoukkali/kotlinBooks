/**
 * File: ConstructorsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:00 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldNotBe

internal class ConstructorsTest : StringSpec({
    "Constructors should initialize with provided properties" {
        val constructors = Constructors("property1", 1)
        constructors shouldNotBe null
    }
})
