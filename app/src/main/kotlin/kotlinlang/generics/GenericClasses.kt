package kotlinlang.generics

/* File: GenericClasses.kt
 * Author: Anouar Doukkali
 * Created on:  6/21/2024 10:49 PM
 * Description: this file demonstrates the use of generic classes in Kotlin
 * Since: v0.1.0
 */

/**
 * a generic class is a class that can be parameterized with types
 * @property value the value of the generic type
 */
private class GenericHolder<T>(private val value: T) {
    fun getValue(): T = value
}
