@file:Suppress("unused", "UnusedVariable", "kotlin:S3353")

package kotlinlang.nullable

import kotlinlang.special.klog

/* File: NullableTypes.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 3:39 AM
 * Description: nullable types in kotlin
 * Since: v0.1.0
 */

private fun nullable(str: String?) { // str can be a string or null
    var number: Int? = null // number can be either Int or null
    if (str != null) klog.debug { str.length } // smart cast str to String when it can be null
}
