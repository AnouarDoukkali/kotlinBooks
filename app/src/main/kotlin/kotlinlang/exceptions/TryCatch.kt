@file:Suppress("unused")

package kotlinlang.exceptions

import kotlinlang.special.klog

/* File: TryCatch.kt
 * Author: Anouar Doukkali
 * Created on:  4/26/2024 12:29 PM
 * Description: This file demonstrates try-catch-finally blocks.
 * Since: v0.1.0
 */

// This method demonstrates try-catch-finally blocks.
private fun tryCatchMethod(number: Int) {
    try {
        // Attempt to divide 5 by the provided number.
        // This will throw an ArithmeticException if number is 0.
        println(5 / number)
    } catch (e: ArithmeticException) {
        // If an exception occurs, log the exception message.
        klog.debug { "Exception: ${e.message}" }
    } finally {
        // The finally block is always executed, regardless of whether an exception occurs.
        // It is commonly used for cleanup tasks.
        klog.debug { "\nthis block is optional and will run in both cases" }
    }
}

// This method demonstrates the use of the 'throw' keyword.
private fun usingThrow(number: Int?): Int {
    // Check if the number is null.
    // If it is, throw an IllegalArgumentException with a message.
    when (number) {
        null -> throw IllegalArgumentException("Number cannot be null")
        else -> return number
    }
}
