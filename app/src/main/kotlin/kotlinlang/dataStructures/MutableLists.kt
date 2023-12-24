package kotlinlang.dataStructures

private fun initializeMutableLists() {
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5) // we can add to mutable lists

    val alphabet = MutableList(5) { "A" }
    alphabet[1] = "B" // we can add to mutable lists // we can modify list contents

    val chars = mutableListOf<Char>() // empty list of char
    val doubles: MutableList<Double> = mutableListOf() // empty list of double
}
