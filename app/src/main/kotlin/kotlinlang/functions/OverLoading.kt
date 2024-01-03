package kotlinlang.functions

private class OverLoaded {
    fun greeting() {
        println("hello")
    }

    fun greeting(name: String) { // When overloading functions, the parameter lists must be unique
        println("hello $name")
    }
}

// if extension function has the signature of member function ,which is nonsense , kotlin prioritize member function
private fun OverLoaded.greeting(name: String) = println("extension function :  $name")
