@file:Suppress("unused")

// a package name should not start with upper case and should follow camelCase convention
// it's recommended that the directory structure correspond to the fully-qualified package name

package kotlinlang.generalTopics

import kotlinlang.special.klog as log

// we could change the imported file  name using the word as

/* File: Packages.kt
 * Author: Anouar Doukkali
 * Created on:  6/21/2024 10:47 PM
 * Description: this file demonstrates the use of packages in Kotlin
 * Since: v0.1.0
 */

// calling imported variable with alias name 'log'
private fun packageNaming() {
    log.info { }
}
