@file:Suppress("unused")

package kotlinlang.looping

import kotlinlang.special.klog

/* File: Labels.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 2:51 AM
 * Description: using labels in kotlin
 * Since: v0.1.0
 */

/**
 * labels are used to name the loop where we are , they can have any name we want
 */
private fun labels() {
    outer@ for (i in 0..10) { // we can name the loop where we are
        for (j in 0..10) {
            if (i != 1) continue@outer // this will continue to next element whenever even number is encountered
            klog.debug { "i:$i j:$j" } // this will print only i:1 j:0 to 10
        }
    }

    odd@ for (i in 0..10) {
        for (j in 0..10) {
            klog.debug { "i:$i j:$j" }
            if (i == 1 || j == 1) break@odd // this will exit superior loop and terminate everything
        }
    }
}
