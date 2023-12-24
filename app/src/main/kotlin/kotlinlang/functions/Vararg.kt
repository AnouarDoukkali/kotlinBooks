package kotlinlang.functions

private fun sumOfNumbers(vararg numbers: Int) {
    var sum = 0
    for (n in numbers) sum += n
    println(sum)
}

fun main() {
    sumOfNumbers(1, 2, 3, 4, 5)
    // we can spread the content of an array by using the spread operator *
    val arr = intArrayOf(1, 2, 3, 4, 5)
    @Suppress("SpreadOperator")
    sumOfNumbers(*arr) // *performance* spread operator copy the full array before calling the method
    @Suppress("SpreadOperator")
    sumOfNumbers(*listOf(10, 21, 22).toIntArray()) // we can spread a list by converting it to an array
}
