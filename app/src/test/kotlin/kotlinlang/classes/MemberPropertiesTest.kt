/* File: MemberPropertiesTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:36 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.throwables.shouldThrowUnit
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
internal class MemberPropertiesTest : DescribeSpec({
    describe("a class") {

        it("can have private properties") {
            val privateMembers = PrivatMembers(prop1 = 10)
            privateMembers.getPrivateProp() shouldBe 10
        }

        it("can validate properties inside init block") {
            val error = shouldThrow<IllegalArgumentException> { PreConditionClass(age = 0) }
            error.message shouldBe "Age must be greater than 18"
        }
    }

    describe("a class with custom getter and setter") {
        val customGetterSetter = CustomGetterSetter(name = "Anouar")

        it("can have parameters in constructor to initialize properties") {
            val error = shouldThrow<IllegalArgumentException> { CustomGetterSetter(name = "") }
            error.message shouldBe "Name cannot be empty"
        }

        it("can have custom getter") {
            customGetterSetter.name shouldBe "Anouar is a kotlin developer!"
        }

        it("can have custom setter") {
            customGetterSetter.name = "Anouar Doukkali"
            customGetterSetter.name shouldBe "Anouar Doukkali is a kotlin developer!"
        }

        it("can validate setter") {
            val error = shouldThrowUnit<IllegalArgumentException> {
                customGetterSetter.name = ""
            }
            error.message shouldBe "Name cannot be empty"
        }
    }
})
