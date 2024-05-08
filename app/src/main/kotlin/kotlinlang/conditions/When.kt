@file:Suppress("unused")

package kotlinlang.conditions

import logger

/* File: When.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 10:24 AM
 * Description: This class encapsulates the evaluation of various conditions.
 * Since: v0.1.0
 */

private fun whenEvaluation(number: Int?) {
    // logs different messages based on the value of the `number` variable.
    when (number) {
        1 -> logger.debug { "one" }
        3, 5 -> logger.debug { "odd number" }
        in 6..10 -> logger.debug { "between 6 and 10" }
        is Int -> {
            logger.debug { "smart cast number to Int: ${number + 5}" }
        }

        null -> {
            logger.debug { "performing some action" }
            logger.debug { "number is null" }
        }

        else -> println("something else")
    }

    // using when without an argument is equivalent to using if/else.
    when {
        number != null && number > 0 -> println("positive number")
    }
}
