@file:Suppress("unused", "UnusedReceiverParameter")

package kotlinlang.extensions

import kotlinlang.special.klog

/* File: ExtensionProperty.kt
 * Author: Anouar Doukkali
 * Created on:  4/26/2024 12:31 PM
 * Description: extension properties
 * Since: v0.1.0
 */

private class ToExtendWithProp

@Suppress("kotlin:S3353")
private var ToExtendWithProp.VarProp: String
    get() = "anouar"
    set(value) {
        require(value.isNotEmpty()) { "Name must not be empty" }
        klog.info { "do some work here, varProp can't be re-assigned" }
    }

private val ToExtendWithProp.ValProp: String
    get() = "anouar"
