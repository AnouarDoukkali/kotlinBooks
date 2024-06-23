package kotlinlang.lambdas

import kotlinlang.special.klog

/* File: FunctionCallByReference.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 2:25 AM
 * Description: this file demonstrates the call of a function by reference in Kotlin
 * Since: v0.1.0
 */

@Suppress("SameParameterValue")
private fun screen(message: String, process: (value: String) -> String): String {
    return process(message)
}

// calling a lambda by it's reference.
private val referenceID: () -> String = { " hello world!" }

@Suppress("unused")
private fun main() {
    // calling a function with a lambda as argument by using :: operator
    klog.info { screen("anouar", String::uppercase) } // uppercase function has the same signature as display lambda

    // calling a lambda reference like a normal function
    klog.info { referenceID() }
}
