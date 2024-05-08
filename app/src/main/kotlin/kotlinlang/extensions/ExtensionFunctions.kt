@file:Suppress("unused")

package kotlinlang.extensions

/* File: ExtensionFunctions.kt
 * Author: Anouar Doukkali
 * Created on:  4/26/2024 12:30 PM
 * Description: this file demonstrates the use of extension functions in Kotlin
 * Since: v0.1.0
 */
import logger

// a class that will be extended
private class ToExtent(val name: String)

// extension function of the class
private fun ToExtent.addExtension() {
    logger.debug { "this is an extension function that, it can act like a member function" }
    logger.debug { "it can access the members of the class as well: ${this.name}" }
}

// check if a nullable ToExtent object is null
private fun ToExtent?.isNull(): Boolean = this == null

// generic extension function
private fun <T> ToExtent.genericExtensionFunction(value: T) {
    logger.debug { "this is a generic extension function, it can be used with any type: $value" }
    logger.debug { "calling another extension function from this extension function: ${this.addExtension()}" }
}

private fun main() {
    val toExtent = ToExtent("anouar")
    toExtent.addExtension()
    toExtent.genericExtensionFunction(10)
}
