package kotlinlang.classes
/*
 * File: ClassWithConstructor.kt
 * Author: Anouar Doukkali
 * Created on:  1/3/2024 10:26 AM
 * Description: Demonstrate the use of a class with a primary constructor.
 * @since: v1.0.0
 */

/**
 * Represents a class with a primary constructor.
 * @property property1 The first property of the class.
 * @property property2 The second property of the class with a default value.
 * @constructor Creates a new instance of ClassWithConstructor by taking property1 and property2 as parameters.
 * @author Anouar Doukkali
 * @since v1.0.0
 */
internal class ClassWithConstructor(private val property1: String, private val property2: Int = 0) {
    /**
     * Speaks the name and age of the alien species.
     *@return A string containing the class properties.
     *@author Anouar Doukkali
     *@since v1.0.0
     */
    fun speak(): String {
        return "property1: $property1 , property2: $property2"
    }
}
