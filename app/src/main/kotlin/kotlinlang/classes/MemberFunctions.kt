/**
 * File: MemberFunctions.kt
 * Author: Anouar Doukkali
 * Created on:  1/28/2024 6:48 AM
 * Description:
 * Since: v0.1.0
 */
package kotlinlang.classes

internal class MemberFunctions {
    /**
     * Member functions are functions that are defined inside a class or object.
     * @return a hard coded string
     */
    @Suppress("FunctionOnlyReturningConstant")
    private fun memberFunction(): String = "this is a member function"

    /**
     * Member functions can access member properties and other member functions of the same class.
     * @return a return from another member function
     */
    fun accessMember(): String {
        return memberFunction() // reference to a member function in the same class
    }
}

/**
 * Top-level functions exist by themselves and are not part of a class
 * @return a hard coded string
 */
@Suppress("FunctionOnlyReturningConstant")
internal fun topLevelFunction(): String = "this is a top-level function"
