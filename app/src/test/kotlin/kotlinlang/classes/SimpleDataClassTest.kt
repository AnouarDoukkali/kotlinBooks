/**
 * File: SimpleDataClassTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 5:02 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class SimpleDataClassTest : StringSpec({

    "toString returns correct string representation" {
        val simpleDataClass = SimpleDataClass("Anouar", 20)
        simpleDataClass.toString().shouldBe("SimpleDataClass(name=Anouar, age=20)")
    }

    "equals returns true for identical objects" {
        val simpleDataClass1 = SimpleDataClass("Test")
        val simpleDataClass2 = SimpleDataClass("Test")
        (simpleDataClass1 == simpleDataClass2).shouldBe(true)
    }

    "equals returns false for different objects" {
        val simpleDataClass1 = SimpleDataClass("Test")
        val simpleDataClass2 = SimpleDataClass("Different")
        (simpleDataClass1 == simpleDataClass2).shouldBe(false)
    }

    "copy creates a new object with the same properties" {
        val simpleDataClass1 = SimpleDataClass("Test")
        val simpleDataClass2 = simpleDataClass1.copy()
        (simpleDataClass1 == simpleDataClass2).shouldBe(true)
    }

    "hashCode returns the same value for identical objects" {
        val simpleDataClass1 = SimpleDataClass("Test")
        val simpleDataClass2 = SimpleDataClass("Test")
        simpleDataClass1.hashCode().shouldBe(simpleDataClass2.hashCode())
    }
})
