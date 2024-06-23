@file:Suppress("unused")

package kotlinlang.conditions

import kotlinlang.special.klog

/* File: When.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 10:24 AM
 * Description: This class encapsulates the evaluation of various conditions.
 * Since: v0.1.0
 */

private fun whenEvaluation(number: Int?) {
    // logs different messages based on the value of the `number` variable.
    when (number) {
        1 -> klog.debug { "one" }
        3, 5 -> klog.debug { "odd number" }
        in 6..10 -> klog.debug { "between 6 and 10" }
        is Int -> {
            klog.debug { "smart cast number to Int: ${number + 5}" }
        }

        null -> {
            klog.debug { "performing some action" }
            klog.debug { "number is null" }
        }

        else -> println("something else")
    }

    // using when without an argument is equivalent to using if/else.
    when {
        number != null && number > 0 -> klog.debug { "positive number" }
    }
}
