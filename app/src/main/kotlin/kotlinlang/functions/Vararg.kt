package kotlinlang.functions

private fun sumOfNumbers(vararg numbers: Int) {
    var sum = 0
    for (n in numbers) sum += n
    println(sum)
}
