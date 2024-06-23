@file:Suppress("unused")

package kotlinlang.looping

import kotlinlang.special.klog

/* File: Repeat.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 2:58 AM
 * Description: usage of repeat function in kotlin
 * Since: v0.1.0
 */

fun repeatLoop() {
    repeat(2) {
        klog.debug { "hello" }
    }
}
