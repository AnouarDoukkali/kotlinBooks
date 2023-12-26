package kotlinlang.enumerations
// we normally use wildcard *
import kotlinlang.enumerations.Color.Blue
import kotlinlang.enumerations.Color.Green
import kotlinlang.enumerations.Color.Red

// simple enum class
@Suppress("UnusedPrivateClass")
private enum class Levels {
    Medium,
    High,
    Low
}

// enum class with properties and functions
private enum class Color(val code: Int) {

    Red(1),
    Green(2),
    Blue(3);

    fun showCode() { // we can declare functions inside enum classes
        println("this color code is : $code")
    }
}

private enum class Direction(val notation: String) {
    North("N"),
    South("S"),
    East("E"),
    West("W");
    val opposite: Direction
        get() = when (this) {
            North -> South
            South -> North
            East -> West
            West -> East
        }
}

// we can check enum elements using when
private fun enumCheck(color: Color) {
    when (color) {
        Red -> println("this is Red")
        Green -> println("Green boy")
        Blue -> println("Blue moon")
    }
}

fun main() {
    val red = Color.Red // declaring an enum member
    val blue = Blue // to use enum member directly we should import the enum in the current file
    val blueCode = Blue.code
}
