package kotlinlang.dataTypes.primitives
/*
 * File: Chars.kt
 * Author: Anouar Doukkali
 * Created on:  4/22/2024 10:27 AM
 * Description: This file contains examples of the `Char` type in Kotlin
 * Since: v0.1.0
 */

/**
 * A class that provides utility functions for the `Char` type.
 */
internal object Chars {

    /**
     * Returns the maximum value of a `Char`.
     */
    fun charMAxValue() = Char.MAX_VALUE

    /**
     * Returns the minimum value of a `Char`.
     */
    fun charMINValue() = Char.MIN_VALUE

    /**
     * Iterates through a string and returns a new string with each character incremented by 1.
     *
     * @param str The input string.
     * @return A new string with each character incremented by 1.
     */
    fun iterateChar(str: String): String {
        val result = StringBuilder()
        for (ch in str) {
            result.append(ch + 1)
        }
        return result.toString()
    }

    /**
     * Checks if a given character is present in a given string.
     * @param char The character to search for.
     * @param str The string to search in.
     * @return True if the character is present in the string, false otherwise.
     */
    fun isCharInString(char: Char, str: String) = char in str
}
