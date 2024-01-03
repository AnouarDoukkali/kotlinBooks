package kotlinlang.dataStructures

private fun initializeLists() {
    // initialization of immutable lists
    val alphabets: List<String> = listOf("a", "b", "c", "d", "e") // explicit type declaration
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7) // explicit type declaration
    val chars = listOf('a', 'b', 'c', 'd', 'e') // the type of the list in inferred
    val chars2 = List(10) { 'a' + it } // create a list of chars a,b,c,d,etc. using lambda
    val empty = List(5) { 0 } // a list of Int instances with default size and values
    val lambda = List(10) { it } // the indexes are the value of the list
    val casting: List<Int> = mutableListOf(1, 2, 3) // declaring a list using covariance
}

private fun aliasing() {
    val mutable = mutableListOf(1)
    val immutable: List<Int> = mutable
    println(immutable)
    mutable.add(2)
    println(immutable) // the immutable list sees the changes
}

private fun dynamicAdd() {
    var immutable = listOf(1)
    immutable += 2 // here immutable receive a new created list under the hood that contain 1,2
    println(immutable) // outputs :  [1, 2]
}

private fun iteratingLists() {
    val list = listOf(1, 2, 3)
    for (i in list) {
        println(i)
    }
    // loop list indexes with their values
    for ((index, value) in list.withIndex()) {
        println("$index : $value")
    }
}

private class ListsOperation(
    private val list: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
) {
    fun joinToString() {
        val str = list.joinToString(separator = "|", prefix = "#", postfix = "#")
        println(str)
    }
}
