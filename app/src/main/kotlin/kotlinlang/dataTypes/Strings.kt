@file:Suppress("unused")

package kotlinlang.dataTypes

import logger

/* File: Strings.kt
 * Author: Anouar Doukkali
 * Created on:  4/24/2024 5:09 PM
 * Description: Strings in Kotlin
 * Since: v0.1.0
 */

private fun stringTemplates() {
    val name = "anouar"
    logger.debug { "printing the value of the variable name : $name" }
    logger.debug { "escaping special characters by using backslach \$name " }
    logger.debug { "printing special characters  quote:\" dollar:\$ " }
    logger.debug { """   "we can escape single quotes inside triple quotes"  """ }
    logger.debug {
        """
            trimIndent   
            removes the common indentation in all lines.
            another line.
        """.trimIndent()
    }
}
