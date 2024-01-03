package kotlinlang.visibility

// private top level property accessible in this file only
private var index = 0

// private class accessible by other members in this file only
private class Animal(private val name: String = "name is accessible inside the class only") {
    override fun toString() = name
}

// top level function accessible by other members in this file only
private fun helloMember() {
    // can initialize private class but not accessing private class members like name
    val animal = Animal("Horse")

    println("index: $index , name: $animal") // animal.toString is called here
}
