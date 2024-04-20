/**
 * File: SimpleClassTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 4:56 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.types.shouldBeInstanceOf

class SimpleClassTest : StringSpec({

    "SimpleClass instance creation" {
        val simpleClass = SimpleClass()
        simpleClass.shouldBeInstanceOf<SimpleClass>()
    }
})
