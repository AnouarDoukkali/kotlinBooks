@file:Suppress("unused")

package kotlinlang.looping

import kotlinlang.special.klog

private fun loopingRange() {
    for (i in 0..10) { // looping an IntRange
        klog.debug { "normal loop, i=$i" }
        break
    }
    for (i in 0 until 10) { // excluding 10 from the range
        klog.debug { "loop until 9, i=$i" }
        break
    }
    for (i in 0..10 step 2) { // stepping by 2
        klog.debug { "step by 2, i=$i" }
        break
    }

    for (i in 10 downTo 0 step 2) { // reverse the count and step by 2 using IntProgression
        klog.debug { "reverse the count and step by 2, i=$i" }
        klog.debug { i }
    }

    for (c in 'a'..'y') { // we can also loop a char range
        klog.debug { c + 1 }
    }
}
