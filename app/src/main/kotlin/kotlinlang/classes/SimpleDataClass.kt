/**
 * File: SimpleDataClass.kt
 * Author: Anouar Doukkali
 * Created on:  1/15/2024 6:31 AM
 * Description: A simple data class that holds a name and an age
 * Since: v0.1.0
 */

package kotlinlang.classes

/**
 * Data class is a class that only holds data.
 *@constructor Creates a simple data class with a name
 *@property name the name of the data class
 */
internal data class SimpleDataClass(val name: String, var age: Int = 0)
