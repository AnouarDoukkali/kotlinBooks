@file:Suppress("unused", "UnusedReceiverParameter")

package kotlinlang.functions

import logger

@Suppress("kotlin:S1144")
private class OverLoaded {
    private fun greeting() {
        logger.debug { "hello" }
    }

    // When overloading functions, parameter lists must be unique
    private fun greeting(name: String) {
        logger.info { "hello $name" }
    }
}

// kotlin will prioritize member function over extension functions unless it is private
private fun OverLoaded.greeting(name: String) = println("extension function :  $name")
