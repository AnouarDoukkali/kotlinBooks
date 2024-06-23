@file:Suppress("unused")

package kotlinlang.nullable

import kotlinlang.special.klog

/* File: SafeCall.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 3:41 AM
 * Description: safe call in kotlin
 * Since: v0.1.0
 */

private fun safe(name: String?) {
    // we can call length safely for nullable type using safe call "?.", otherwise it will return null
    klog.debug { name?.length }
}
