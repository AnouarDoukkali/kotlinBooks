@file:Suppress("unused", "UNUSED_PARAMETER")

package kotlinlang.functions

import logger

/* File: Vararg.kt
 * Author: Anouar Doukkali
 * Created on:  4/30/2024 11:46 AM
 * Description: this file demonstrate the usage of vararg in Kotlin
 * Since: v0.1.0
 */

// Vararg is a keyword in Kotlin that allows you to pass a variable number of arguments to a function.
// you can make the last parameter of a function a vararg parameter
private fun sumOfNumbers(param1: Int, param2: Int, vararg numbers: Int) {
    for (n in numbers) {
        logger.debug { n }
    }
}

// we can spread a vararg parameter since it is an array of Array<out T>
private fun <T> spredVararg(vararg elements: T) {
    val list = listOf(*elements)
    logger.debug { list }
}

@Suppress("SpreadOperator")
// we can spread a vararg parameter if it is an array of primitive using toTypedArray()
private fun spreadPrimitiveVararg(vararg elements: Int) {
    val list = listOf(*elements.toTypedArray())
    logger.debug { list }
}
