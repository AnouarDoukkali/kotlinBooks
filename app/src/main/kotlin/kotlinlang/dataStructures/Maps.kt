package kotlinlang.dataStructures

private fun initializingMaps() {
    val map1 = mapOf(1 to "one", 2 to "two", 3 to "three")
    // more explicit type declaration
    val map2 = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    val map3: Map<Int, Int> = mapOf<Int, Int>(1 to 2)
    var map4 = mapOf<Int, Int>(1 to 2)
    map4 += 2 to 14 // this creates a new map under the hood
}

private fun iteratingMaps() {
    val map1 = mapOf(1 to "one", 2 to "two", 3 to "three")
    for ((key, value) in map1) {
        println("$key : $value")
    }
}

private fun mapsOperations() {
    val map1 = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map1.getValue(1)) // get value by key, throw exception if not found
    println(map1[10]) // get value by key , return null if not found
    // looping on map
    for ((key, value) in map1) {
        println("$key : $value")
    }
}

fun main() {
    mapsOperations()
}
