@file:Suppress("unused")

package kotlinlang.dataTypes

import kotlinlang.special.klog

/* File: Strings.kt
 * Author: Anouar Doukkali
 * Created on:  4/24/2024 5:09 PM
 * Description: Strings in Kotlin
 * Since: v0.1.0
 */

private fun stringTemplates() {
    val name = "anouar"
    klog.debug { "printing the value of the variable name : $name" }
    klog.debug { "escaping special characters by using backslach \$name " }
    klog.debug { "printing special characters  quote:\" dollar:\$ " }
    klog.debug { """   "we can escape single quotes inside triple quotes"  """ }
    klog.debug {
        """
            trimIndent   
            removes the common indentation in all lines.
            another line.
        """.trimIndent()
    }
}
