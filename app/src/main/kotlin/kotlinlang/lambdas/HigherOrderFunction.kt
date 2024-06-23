package kotlinlang.lambdas

import kotlinlang.special.klog

/* File: HigherOrderFunction.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 1:30 AM
 * Description: this file demonstrates the use of HOF in Kotlin
 * Since: v0.1.0
 */

// HOF is a function that accepts lambda as argument
fun hof(str: String, process: (String) -> Int) {
    klog.debug { process(str) }
}

private fun main() {
    hof("anouar") {
        it.length
    }
}
