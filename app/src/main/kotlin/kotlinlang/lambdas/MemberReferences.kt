package kotlinlang.lambdas

private fun screen(message: String, display: (value: String) -> Unit) {
    display(message)
}

private fun convert(value: String, process: (String) -> Double?): Double? {
    return process(value).also { println(it) }
}
