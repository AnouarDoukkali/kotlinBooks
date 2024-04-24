package kotlinlang.classes.types
/* File: SimpleDataClass.kt
 * Author: Anouar Doukkali
 * Created on:  1/15/2024 6:31 AM
 * Description: A simple data class in Kotlin.
 * Since: v0.1.0
 */

/**
 * This is a simple data class in Kotlin.
 * It has two properties: `name` and `age`.
 * `name` is a read-only (val) property of type String.
 * `age` is a mutable (var) property of type Int with a default value of 0.
 *
 * @property name The name of the person.
 * @property age The age of the person. Default value is 0.
 */
internal data class DataClass(val name: String, var age: Int = 0)
