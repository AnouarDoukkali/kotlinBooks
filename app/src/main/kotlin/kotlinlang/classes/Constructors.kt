package kotlinlang.classes
/* File: ClassWithConstructor.kt
 * Author: Anouar Doukkali
 * Created on:  1/3/2024 10:26 AM
 * Description: This file demonstrates how to create classes with constructors in Kotlin.
 * @since: v0.1.0
 */

/**
 * This is a class with a default constructor.
 * It does not have any properties or methods.
 */
internal class DefaultConstructor

/**
 * This is a class with a primary constructor.
 * It has two properties: prop1 and prop2.
 *
 * @property prop1 A string property.
 * @property prop2 An integer property with a default value of 0.
 */
internal class PrimaryConstructor(val prop1: String, val prop2: Int = 0)
