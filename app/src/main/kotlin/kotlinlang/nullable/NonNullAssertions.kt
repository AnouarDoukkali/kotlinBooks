@file:Suppress("unused", "SameParameterValue", "UnusedVariable", "TooGenericExceptionCaught")

package kotlinlang.nullable

import kotlinlang.special.klog

private fun nonNullAssertion(str: String?, number: Int?) {
    try {
        val lenght: Int = str!!.length // here the developer guarantees that str can't be null
        val num: Int = number!! // we can assign a presumed null variable to a non null number
        // smart cast str to String as we guaranteed that it's not a null previously
        val str2: String = str
    } catch (e: NullPointerException) {
        klog.debug {
            "exception: ${e.message}"
        }
    }
}
