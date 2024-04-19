package kotlinlang.classes

/**
 * File: ClassWithConstructorTest.kt
 * Author: Anouar Doukkali
 * Created on: 1/15/2024 6:20 AM
 * Since: v0.1.0
 */
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ClassWithConstructorTest : StringSpec({
    "should return property1: 0 , property2: 1 when both properties are set" {
        val classWithConstructor = ClassWithConstructor("0", 1)
        val result = classWithConstructor.printClassProperties()
        val expected = "property1: 0 , property2: 1"
        result shouldBe expected
    }

    "should return property1: 1 , property2: 0 when only property1 is set" {
        val classWithConstructor = ClassWithConstructor("1")
        val result = classWithConstructor.printClassProperties()
        val expected = "property1: 1 , property2: 0"
        result shouldBe expected
    }

    "should return property1: , property2: 0 when property1 is empty" {
        val classWithConstructor = ClassWithConstructor("")
        val result = classWithConstructor.printClassProperties()
        val expected = "property1:  , property2: 0"
        result shouldBe expected
    }
})
