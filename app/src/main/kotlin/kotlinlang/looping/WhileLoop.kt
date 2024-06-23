@file:Suppress("unused")

package kotlinlang.looping

import kotlinlang.special.klog

/* File: WhileLoop.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 2:59 AM
 * Description: while loop in kotlin
 * Since: v0.1.0
 */
private fun usingWhile() {
    var i = 0
    while (i < 100) {
        klog.debug { i }
        i += 10
    }
}

fun usingDoWhile() {
    var i = 0
    do {
        klog.debug { i }
        i += 10
    } while (i < 100)
}
