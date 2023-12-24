package kotlinlang.functions

import java.util.Locale

/*
adding an extension count to the Class String
to work with this extension in another package , you should import it as kotlin lang.functions.count
*/
private fun String.simpleCount() {
    println("$this contains ${this.length} elements") // we reference to the concerned element by this
}

// we can apply another extension to an existing extension
private fun String.advancedCount() {
    println("////")
    this.uppercase(Locale.getDefault()).simpleCount() // apply a change to the element
    simpleCount() // we can omit the word this here , apply other extension function
    println("////")
}
// ----------------------------------------------------------------------

class Animal(val name: String, val age: Int) {
    fun roar() = "hello $name"
}

// extension functions can be private like member functions
private fun Animal.information() {
    println("name ${this.name} age: ${this.age}")
}

fun main() {
    val name = "anouar"
    // name.count()
    name.advancedCount()
}
