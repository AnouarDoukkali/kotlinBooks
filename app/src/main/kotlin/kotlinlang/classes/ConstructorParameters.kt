package kotlinlang.classes
private class AlienSpecies(private val name: String, var age: Int = 0) {

    fun speak() {
        println("I am $name , I'm $age years old")
    }
}

fun main() {
    val alien = AlienSpecies("pojo")
    alien.age = 10
    alien.speak()
}
