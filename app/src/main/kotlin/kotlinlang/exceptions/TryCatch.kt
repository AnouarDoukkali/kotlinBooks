package kotlinlang.exceptions

// try catch block
private fun calculate(number: Int) {
    try {
        println(5 / number)
    } catch (e: ArithmeticException) {
        print(e.localizedMessage)
    } finally {
        println("\nthis block is optional and will run in both cases")
    }
}

@Suppress("UseRequire")
// throwing an exception
private fun forbiddenName(name: String) {
    require(name != "danger ") { "this name is forbidden" }
    require(name != "fatal") // will also throw an exception if name is 'fatal'
}
