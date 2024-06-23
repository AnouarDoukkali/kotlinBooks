package kotlinlang.generics

import kotlinlang.special.klog

/* File: GenericFunctions.kt
 * Author: Anouar Doukkali
 * Created on:  6/21/2024 11:15 PM
 * Description: this file demonstrates the use of generic functions in Kotlin
 * Since: v0.1.0
 */

/**
 * a generic function that can be parameterized with types
 */
private fun <T> genericFunction(value: T): T {
    klog.debug { "value: $value" }
    return value
}
