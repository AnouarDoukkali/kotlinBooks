package kotlinlang.dataStructures

private fun tripletFunction() {
    val triple = Triple(1, 2, 3)
    val triple2: Triple<Int, Int, String> = Triple(0, 1, "anouar")
    val triple3 = Triple<Int, Double, String>(1, 2.5, "anouar")
}

private fun tripleDestructionDeclaration() {
    val triple = Triple(1, 2, 3)
    val (first, second, third) = triple
    println("first :$first, second :$second, third :$third")
}

fun main() {
    tripleDestructionDeclaration()
}
