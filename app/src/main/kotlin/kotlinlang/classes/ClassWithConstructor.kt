/**
 * File: ClassWithConstructor.kt
 * Author: Anouar Doukkali
 * Created on:  1/3/2024 10:26 AM
 * Description: Demonstrate the use of a class with a primary constructor.
 * @since: v0.1.0
 */
package kotlinlang.classes

/**
 * Represents a class with a primary constructor.
 * @property property1 The first property of the class declared as private.
 * @property property2 The second property of the class with a default value.
 * @constructor Creates a new instance of ClassWithConstructor by taking property1 and property2 as parameters.
 */
internal class ClassWithConstructor(private val property1: String, private val property2: Int = 0) {
    /**
     * A function that returns a string representation of all class properties.
     * @return A string containing the class properties.
     */
    fun printClassProperties(): String {
        return "property1: $property1 , property2: $property2"
    }
}
