@file:Suppress("unused", "UnusedReceiverParameter")

package kotlinlang.extensions
/* File: ExtensionProperty.kt
 * Author: Anouar Doukkali
 * Created on:  4/26/2024 12:31 PM
 * Description: extension properties
 * Since: v0.1.0
 */

import logger

private class ToExtendWithProp

@Suppress("kotlin:S3353")
private var ToExtendWithProp.VarProp: String
    get() = "anouar"
    set(value) {
        require(value.isNotEmpty()) { "Name must not be empty" }
        logger.info { "do some work here" }
    }

private val ToExtendWithProp.ValProp: String
    get() = "anouar"
