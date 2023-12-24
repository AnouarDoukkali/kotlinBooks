package kotlinlang.looping

fun repeatLoop() {
    repeat(2) {
        println("hi")
    }
}

fun unitFun() {
    return Unit
}

fun main() {
    println(unitFun())
    val u1: Unit = println(42)
    println(u1)
    val u2 = println(0) // Type inference
    println(u2)
}
