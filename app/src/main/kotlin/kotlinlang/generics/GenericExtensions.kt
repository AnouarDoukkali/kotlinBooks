package kotlinlang.generics

import kotlinlang.special.klog

/* File: GenericExtensions.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 1:15 AM
 * Description: this file demonstrates the use of generic extensions in Kotlin
 * Since: v0.1.0
 */

/**
 * an extension function that can be parameterized with types
 */
private fun <T> List<T>.boundTotal(): List<T> {
    for (i in this) {
        klog.debug { i }
    }
    return this
}
