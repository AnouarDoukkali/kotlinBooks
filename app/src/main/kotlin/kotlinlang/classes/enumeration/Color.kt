@file:Suppress("unused", "UNUSED_PROPERTY")

package kotlinlang.classes.enumeration

/* File: Color.kt
 * Author: Anouar Doukkali
 * Created on:  4/25/2024 4:24 PM
 * Description: This file contains the definition of an enumeration class `Color`.
 * Since: v0.1.0
 */
/**
 * An enumeration class representing colors.
 */
internal enum class Color(val rgb: Int) {
    /**
     * Represents the color red with an RGB value of 0xFF0000.
     */
    RED(0xFF0000),

    /**
     * Represents the color green with an RGB value of 0x00FF00.
     */
    GREEN(0x00FF00),

    /**
     * Represents the color blue with an RGB value of 0x0000FF.
     */
    BLUE(0x0000FF); // Semicolon is required if the enum class has functions

    /**
     * Returns a string representation of the mixed color of this color and the provided color.
     *
     * @param color The color to mix with this color.
     * @return A string representation of the mixed color.
     */
    fun mixedColor(color: Color): String {
        return when (this) {
            RED -> mixRed(color)
            GREEN -> mixGreen(color)
            BLUE -> mixBlue(color)
        }
    }

    /**
     * Returns a string representation of the mixed color of red and the provided color.
     *
     * @param color The color to mix with red.
     * @return A string representation of the mixed color.
     */
    private fun mixRed(color: Color): String {
        return when (color) {
            GREEN -> "Yellow"
            RED -> "Red"
            BLUE -> "Purple"
        }
    }

    /**
     * Returns a string representation of the mixed color of green and the provided color.
     *
     * @param color The color to mix with green.
     * @return A string representation of the mixed color.
     */
    private fun mixGreen(color: Color): String {
        return when (color) {
            RED -> "Yellow"
            GREEN -> "Green"
            BLUE -> "Cyan"
        }
    }

    /**
     * Returns a string representation of the mixed color of blue and the provided color.
     *
     * @param color The color to mix with blue.
     * @return A string representation of the mixed color.
     */
    private fun mixBlue(color: Color): String {
        return when (color) {
            RED -> "Purple"
            GREEN -> "Cyan"
            BLUE -> "Blue"
        }
    }
}
