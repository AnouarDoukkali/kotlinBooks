package kotlinlang.dataStructures

private fun initializeMutableMaps() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val map2 = mutableMapOf<Int, String>(1 to "one", 2 to "two")
    val map3: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val map4 = mutableMapOf(Pair("one", 1))
}
