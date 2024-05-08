@file:Suppress("unused")

package kotlinlang.functions

import logger

/*
 * File: TopLevelFunctions.kt
 * Author: Anouar Doukkali
 * Created on: 4/19/2024 3:25 PM
 * Description: Top-level functions.
 * Since: v0.1.0
 */

/**
 * Top-level functions exist by themselves and are not part of a class
 * @return Unit
 */
@Suppress("FunctionOnlyReturningConstant")
internal fun topLevelFunction() = logger.debug { "this is a top-level function" }
