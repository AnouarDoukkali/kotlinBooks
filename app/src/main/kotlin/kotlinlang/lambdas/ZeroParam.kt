@file:Suppress("unused")

package kotlinlang.lambdas

/* File: ZeroParam
 * Author: Anouar Doukkali
 * Created on: 6/22/2024 12:28 PM
 * Description: lambda can have zero parameters
 * Since: v0.1.0
 */

private fun zero(process: () -> Unit) {
    process()
}

private fun main() {
    zero { -> println("hello") } // the Kotlin style guide recommends omitting the arrow.
}
