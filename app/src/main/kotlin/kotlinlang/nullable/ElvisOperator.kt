@file:Suppress("unused")

package kotlinlang.nullable

import kotlinlang.special.klog

/* File: ElvisOperator.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 3:23 AM
 * Description: usage of elvis operator in kotlin
 * Since: v0.1.0
 */
private fun elvis(str: String?) {
    // the Elvis operator is typically used after a safe call. it allows us to return something else instead of null
    klog.debug { str?.length ?: "str is null" }
}
