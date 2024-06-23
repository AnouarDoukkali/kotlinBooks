@file:Suppress("unused", "UnusedReceiverParameter")

package kotlinlang.functions

import kotlinlang.special.klog

/* File: OverLoading.kt
 * Author: Anouar Doukkali
 * Created on:  6/21/2024 10:08 PM
 * Description: this file demonstrates the use of overloading functions in Kotlin
 * Since: v0.1.0
 */

@Suppress("kotlin:S1144")
private class OverLoaded {
    private fun greeting() {
        klog.debug { "hello" }
    }

    // When overloading functions, parameter lists must be unique
    private fun greeting(name: String) {
        klog.info { "hello $name" }
    }
}

// kotlin will prioritize member function over extension functions unless it is private or has different signature
private fun OverLoaded.greeting(name: String) = println("extension function :  $name")
