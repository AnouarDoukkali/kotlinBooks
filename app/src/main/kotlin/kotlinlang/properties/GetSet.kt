@file:Suppress("unused")

package kotlinlang.properties

import kotlinlang.special.klog
import java.time.Year

/* File: GetSet.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 3:57 AM
 * Description: this file demonstrates the use of getters and setters in Kotlin
 * Since: v0.1.0
 */
private class CustomGetter {
    var name: String = "anouar"
        get() {
            println("getting $field:") // the backing field is what stored in the variable
            return "hello $field"
        }

        // even if the variable is public , we can make the set private
        private set(value) { // the property should be of type var to be able to set it
            println("setting $field to $value") // value is the new string that will be set
            field = value
        }

    private var age: Int = 0
        get() { // the get here is private as the variable
            println("returning age")
            return field
        }
        set(value) { // set is private as well
            require(value >= 18) { "age must be 18 or higher" } // throw exception if new value <= 18
            field = value
        }

    var address = ""
        private set // here we make only the set private , but the variable can be accessed outside the class.

    fun setProperties() {
        this.name = "Anouar" // can access private set in the same class
        this.age = 10 // will throw exception , can access private set as well
    }

    // we can use properties instead of functions to make simple calculations related to other properties
    val yearOfBirth: Int
        get() = Year.now().value - age
}

private fun main() {
    val cgs = CustomGetter()
    // cgs.name = "bob" - can't set private setter
    klog.debug { cgs.address } // can access only the public getter
}
