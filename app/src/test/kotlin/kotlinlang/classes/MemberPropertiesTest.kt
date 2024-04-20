/**
 * File: MemberPropertiesTest.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:36 PM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

@Tags("unitTest")
internal class MemberPropertiesTest : BehaviorSpec({
    isolationMode = IsolationMode.InstancePerLeaf

    Given("a MemberP  isolationMode = IsolationMode.InstancePerLeaf") {
        val memberProperties = MemberProperties()

        When("name property is initialized with a value") {
            memberProperties.name = "Anouar"

            Then("it should return the initialized value") {
                memberProperties.name shouldBe "Anouar"
            }
        }

        When("name property is accessed before initialization") {
            var message: String? = null
            try {
                memberProperties.name
            } catch (e: UninitializedPropertyAccessException) {

                message = e.message
            }

            Then("it should throw an UninitializedPropertyAccessException") {
                message shouldBe "lateinit property name has not been initialized"
            }
        }
    }
})
