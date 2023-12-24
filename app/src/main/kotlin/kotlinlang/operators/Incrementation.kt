package kotlinlang.operators

fun incrementationOrder() {
    var i = 10
    println(i++)
    println(i)
    var j = 20
    println(++j)
    println(j)
}

fun increment() {
    var i = 1
    println(i++ + ++i) // Kotlin sets i to 1, increments it to 2, increments it again to 3, and then adds the resulting
// value of i (3) to the initial value (1), giving us (1 + 3)
}

fun main() {
    increment()
}
