/**
 * File: MemberFunctions.kt
 * Author: Anouar Doukkali
 * Created on:  1/28/2024 6:48 AM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.functions

internal class MemberFunctions(private val name: String) {
    /**
     * Member functions are functions that are defined inside a class or object.
     * @return hard coded string
     */
    @Suppress("FunctionOnlyReturningConstant")
    private fun memberFunction(): String = "your name is: $name"

    /**
     * Member functions can access member properties and other member functions of the same class.
     * @return another member function
     */
    fun accessAnotherMember(): String {
        return memberFunction() // reference to a member function in the same class
    }
}
