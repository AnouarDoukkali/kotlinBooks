package kotlinlang.classes
/* File: ConstructorsTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:00 PM
 * Description: This file demonstrates how to test classes with constructors in Kotlin.
 * Since: v0.1.0
 */

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf

@Tags("unitTest")
internal class ConstructorsTest : DescribeSpec({
    describe("a class") {

        it("can be instantiated with an empty constructor") {
            val defaultConstructor = DefaultConstructor()
            defaultConstructor.shouldBeInstanceOf<DefaultConstructor>()
        }

        it("can be instantiated with a primary constructor") {
            val primary = PrimaryConstructor(prop1 = "property1", prop2 = 1)
            primary.prop1 shouldBe "property1"
        }
    }

    describe("a constructor") {

        it("can be instantiated with default values") {
            val primary = PrimaryConstructor(prop1 = "property1")
            primary.prop2 shouldBe 0
        }
    }
})
