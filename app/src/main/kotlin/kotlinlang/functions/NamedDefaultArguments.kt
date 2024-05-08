@file:Suppress("unused")

package kotlinlang.functions

/* File: NamedDefaultArguments.kt
 * Author: Anouar Doukkali
 * Created on:  4/26/2024 1:02 PM
 * Description: Demonstrates the use of default arguments in functions.
 * Since: v0.1.0
 */

import logger

/**
 * Demonstrates the use of default arguments in functions.
 *
 * @param param1 The first parameter, with a default value of 1.
 * @param param2 The second parameter, with a default value of 2.
 */
private fun defaultNamedArguments(param1: Int = 1, param2: Int = 2) {
    logger.debug { "default arguments in functions: $param1, $param2" }
}
