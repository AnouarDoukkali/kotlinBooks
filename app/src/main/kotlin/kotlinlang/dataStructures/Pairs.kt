package kotlinlang.dataStructures

private fun pairDeclarations() {
    val pair = Pair(5, 6)
    val pair2 = 5 to 6
    // explicit type declaration
    val pair3: Pair<Int, Int> = Pair(10, 20)
    val pair4 = Pair<Int, Int>(10, 20)
}

private fun pairDestructingDeclarations() {
    val pair = Pair(5, 6)
    val (first, second) = pair
    println(first)
    println(second)
}

fun main() {
    pairDestructingDeclarations()
}
