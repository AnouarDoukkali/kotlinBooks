@file:Suppress("unused")

package kotlinlang.functions

/* File: SimpleFunction.kt
 * Author: Anouar Doukkali
 * Created on:  4/26/2024 3:18 PM
 * Description: Simple Functions in Kotlin.
 * Since: v0.1.0
 */
import logger

// The combination of name, parameters and return type is called the function signature.
private fun simpleFunction(param1: Int, param2: Int): Int {
    return param1 + param2
}

private fun unitReturn() {
    logger.debug { "a function that does not have a defined return type is returning Unit by default" }
}

private fun neverReturn(): Nothing {
    error("never return")
}
