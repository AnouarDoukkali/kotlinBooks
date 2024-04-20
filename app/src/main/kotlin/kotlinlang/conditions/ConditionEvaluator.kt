/**
 * File: ConditionEvaluator.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 10:24 AM
 * Description: This class encapsulates the evaluation of various conditions.
 * Since: v0.1.0
 */
package kotlinlang.conditions

/**
 * This class encapsulates the evaluation of various conditions.
 *
 * @property number The number to be evaluated. Can be null.
 * @property first The first string to be evaluated in pair.
 * @property second The second string to be evaluated in pair.
 */
class ConditionEvaluator(private val number: Int?, private val first: String, private val second: String) {

    /**
     * Evaluates the number property based on various conditions and prints the result.
     */
    fun evaluateNumber() {
        when (number) {
            1 -> println("one")
            2 -> println("two")
            3, 4, 5 -> println("medium")
            is Int -> {
                println("it's an int")
                println(number)
            }
            null -> println("it's a null")
            else -> println("something else")
        }
    }

    /**
     * Evaluates the number property based on its value and prints the result.
     */
    fun evaluateNumberConditions() {
        when {
            number != null && number > 0 && (number % 2) == 0 -> println("even positive number")
            number != null && number > 0 -> println("positive number")
            number != null && number < 0 -> println("negative number")
            else -> println("zero")
        }
    }

    /**
     * Evaluates the pair of strings (first and second properties) and prints the result.
     */
    fun evaluateStringPair() {
        when (setOf(first, second)) {
            setOf("one", "two") -> println("one and two")
            setOf("red", "blue") -> println("red and blue")
        }
    }

    /**
     * Converts the number property to a string representation and returns it.
     *
     * @return A string that represents the number property.
     */
    fun numberToString(): String {
        return when (number) {
            1 -> "one"
            2 -> "two"
            else -> "something else"
        }
    }

    /**
     * Checks if a given integer is greater than 10 and returns a specific value based on the check.
     *
     * @param a The integer to check.
     * @return 11 if the integer is greater than 10, otherwise 9.
     */
    fun ifElseReturn(a: Int): Int {
        return if (a > 10) 11 else 9
    }
}
