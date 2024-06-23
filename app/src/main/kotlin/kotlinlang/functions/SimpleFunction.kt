@file:Suppress("unused")

package kotlinlang.functions

import kotlinlang.special.klog

/* File: SimpleFunction.kt
 * Author: Anouar Doukkali
 * Created on:  4/26/2024 3:18 PM
 * Description: Simple Functions in Kotlin.
 * Since: v0.1.0
 */

// The combination of name, parameters and return type is called the function signature.
private fun simpleFunction(param1: Int, param2: Int): Int {
    return param1 + param2
}

@Suppress("NoUnitReturn", "RedundantUnitReturnType")
private fun unitReturn() {
    klog.debug { "a function that does not have a defined return type is returning Unit by default" }
}

/**
 * a function that return Nothing type is  a function that never returns.
 */
private fun neverReturn(): Nothing {
    error("never return")
}
