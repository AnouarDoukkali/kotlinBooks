package kotlinlang.classes
/* File: MemberProperties.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 9:01 AM
 * Description: Demonstrate the use of member properties in Kotlin.
 * Since: v0.1.0
 */

/**
 * This class demonstrates the use of private properties in Kotlin.
 * It has a single private property `prop1` and a method to access it.
 *
 * @property prop1 A private integer property.
 */
internal class PrivatMembers(private val prop1: Int) {
    /**
     * This method returns the value of the private property `prop1`.
     * @return The value of the private property `prop1`.
     */
    fun getPrivateProp() = prop1
}

/**
 * This class demonstrates the use of preconditions in Kotlin.
 * It has a single private property `age` and a precondition in the init block that the age must be fdfd
 * greater than 18.
 * @property age A private integer property representing the age.
 * @throws IllegalArgumentException If the age is not greater than 18.
 */
internal class PreConditionClass(private val age: Int) {
    init {
        require(age > 18) { "Age must be greater than 18" }
    }
}

/**
 * This class demonstrates the use of custom getters and setters in Kotlin.
 * It has a single property `name` with a custom getter and setter.
 * The getter appends "is a kotlin developer!" to the name.
 * The setter requires that the name is not empty.
 *
 * @property name A string property with a custom getter and setter.
 * @throws IllegalArgumentException If the name is empty.
 */
internal class CustomGetterSetter(name: String) {
    var name: String = ""
        get() = "$field is a kotlin developer!"
        set(value) {
            require(value.isNotEmpty()) { "Name cannot be empty" }
            field = value
        }

    init {
        require(name.isNotEmpty()) { "Name cannot be empty" }
        this.name = name
    }
}
