@file:Suppress("unused")

package kotlinlang.operators

import kotlinlang.special.klog

/* File: Incrementation.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 3:56 AM
 * Description: incrementing operators in kotlin
 * Since: v0.1.0
 */
fun incrementationOrder() {
    var i = 10
    klog.debug { i++ } // prints 10 and increments i to 11
    klog.debug { i } // prints 11
    var j = 20
    klog.debug { ++j } // increments j to 21 and then prints it
    klog.debug { j } // prints 21
}

fun increment() {
    var i = 1
    klog.debug { i++ + ++i } // i++ : place 1 then increment i to 2 , ++i : increment i to 3 then place 3. (1+3)
}

private fun main() {
    incrementationOrder()
    increment()
}
