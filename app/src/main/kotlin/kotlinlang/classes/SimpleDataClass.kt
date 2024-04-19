/**
 * File: SimpleDataClass.kt
 * Author: Anouar Doukkali
 * Created on:  1/15/2024 6:31 AM
 * Description:
 * Since: v0.1.0
 */

package kotlinlang.classes

/**
 * Data class is a class that only holds data.
 *@constructor
 *@property
 *@author Anouar Doukkali
 *@since v0.1.0
 */
internal data class SimpleDataClass(val name: String) {
    lateinit var log: String

    // can have function
    fun message() = toString()
}
