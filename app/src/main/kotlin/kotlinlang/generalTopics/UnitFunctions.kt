package kotlinlang.generalTopics

fun main() {
    val result1 = if (11 > 42) 9 else 5

    val result2 = if (1 < 2) {
        val a = 11 + 42
    } else {
        42
    }

    val result3 =
        if ('x' < 'y') {
            println("x < y")
        } else {
            println("x > y")
        }

    println(result1)
    println(result2)
    println(result3)
    /*output
    x < y // evaluating result3 calls println(), and the evaluation occurs when result3 is defined.
    5
    kotlin.Unit
    kotlin.Unit
     */
}
