package kotlinlang.exceptions

// try catch block
private fun calculate() {
    try {
        println(5 / 0)
    } catch (e: ArithmeticException) {
        print(e.localizedMessage)
    } finally {
        println("\nthis block is optional and will run in both cases")
    }
}

@Suppress("UseRequire")
// throwing an exception
private fun forbiddenName(name: String) {
    if (name == "danger") throw IllegalArgumentException("this name is forbidden")
    require(name != "fatal") // will also throw an exception if name is 'fatal'
}

fun main() {
    calculate()
    // forbiddenName("danger")
    // forbiddenName("fatal")
}
