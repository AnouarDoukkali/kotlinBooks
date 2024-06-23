@file:Suppress("unused")

package kotlinlang.collections.lists.operations

import kotlinlang.special.klog

/* File: JoinToString
 * Author: Anouar Doukkali
 * Created on: 6/22/2024 12:06 PM
 * Description: using the joinToString function
 * Since: v0.1.0
 */

// this function demonstrates how to use the joinToString function
private fun <T> join(list: List<T>): String {
    return list.joinToString("#") { "[$it]" }
}

private fun main() {
    klog.info { join(listOf(1, 2, 3, 4, 5)) }
}
