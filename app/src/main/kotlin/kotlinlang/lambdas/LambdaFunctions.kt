package kotlinlang.lambdas

import kotlinlang.special.klog

/* File: LambdaFunctions.kt
 * Author: Anouar Doukkali
 * Created on:  6/22/2024 2:26 AM
 * Description: this file demonstrates the use of lambda functions in Kotlin
 * Since: v0.1.0
 */

/**
 *  lambda functions are anonymous functions that are defined first by their siganture only
 *  the work for the lambda is defined later by the user using the curly braces
 */
@Suppress("SameParameterValue")
private fun <T, R> expectingLambda(param: T, lambda: (T) -> R): R {
    return lambda(param) // the work of lambda is defined later by the user
}

// implementing List.filter using lambda
private fun <T> List<T>.myFilter(process: (T) -> Boolean): List<T> {
    val newList = mutableListOf<T>()

    for (i in this) {
        if (process(i)) { // here we call the lambda function without really knowing what does it do
            newList.add(i)
        }
    }
    return newList
}

@Suppress("unused")
private fun main() {
    expectingLambda("anouar") {
        // here it could be anything that return R , or any function that take T and return R
        it.length // the return type R is different from the parameter it of type T
    }

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 9)
    val evenNumbers = list.myFilter { it % 2 == 0 } // the work of lambda function is defined here
    klog.debug { evenNumbers }
}
