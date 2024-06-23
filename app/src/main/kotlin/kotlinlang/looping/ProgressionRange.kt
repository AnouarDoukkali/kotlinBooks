@file:Suppress("unused")

package kotlinlang.looping

import kotlinlang.special.klog

/* File: ProgressionRange.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 2:48 AM
 * Description: progression and range in kotlin
 * Since: v0.1.0
 */

// IntProgression is superClass of IntRange
private fun progressionVSRange(
    p: IntProgression = 0..10 step 2,
    r: IntRange = 0..10
) {
    for (i in p) {
        klog.debug { i }
    }
    for (i in r) {
        klog.debug { i }
    }
}
