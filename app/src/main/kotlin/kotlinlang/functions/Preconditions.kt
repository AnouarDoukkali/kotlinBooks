@file:Suppress("unused")

package kotlinlang.functions

/* File: Preconditions.kt
 * Author: Anouar Doukkali
 * Created on:  4/26/2024 10:15 AM
 * Description: using check preconditions in Kotlin.
 * Since: v0.1.0
 */

// This function checks if the given parameter is not equal to 0.
// If it is 0, it throws an IllegalArgumentException with the message "param should not be 0".
private fun preConditionCheck(param: Int) {
    // Check if the parameter is 0.
    require(param != 0) { "param should not be 0" }
}
