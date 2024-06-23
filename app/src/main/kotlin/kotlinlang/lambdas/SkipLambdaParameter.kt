@file:Suppress("unused", "SameParameterValue")

package kotlinlang.lambdas

import kotlinlang.special.klog

/* File: SkipLambdaParameter
 * Author: Anouar Doukkali
 * Created on: 6/22/2024 12:19 PM
 * Description: using lambda function with two parameters and skip the second one
 * Since: v0.1.0
 */

private fun skip(param: String, process: (String, Int) -> String): String {
    return process(param, param.length)
}

private fun main() {
    val result = skip("anouar") { a, _ -> // here we skip the second parameter of the lambda and kept the first one
        a.uppercase() // the work of lambda
    }

    klog.info { result }
}
