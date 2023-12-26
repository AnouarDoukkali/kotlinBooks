package kotlinlang.conditions

private fun whenExpression(number: Int?) {
    when (number) { // The first successful match completes execution of when expression
        1 -> println("one")
        2 -> println("two")
        3, 4, 5 -> println("medium") // test more than a single choice
        is Int -> { // we can perform more than one expression ,trigger if it's another than previous numbers
            println("it's an int")
            println(number) // smart cast of number to int
        }

        null -> println("it's a null")
        else -> println("something else") // else here it's optional since we covered all possible cases
    }
}

private fun whenExpression2(number: Int) {
    when { // check conditions on number
        number > 0 && (number % 2) == 0 -> println("even positive number") // the order here is important
        number > 0 -> println("positive number")
        number < 0 -> println("negative number")
        else -> println("zero")
    }
}

// we could use when to check multiple items using a set
private fun whenCheckMultiple(first: String, second: String) {
    when (setOf(first, second)) {
        setOf("one", "two") -> println("one and two")
        setOf("red", "blue") -> println("red and blue")
    }
}

// using when as a return
private fun whenReturn(number: Int): String {
    return when (number) {
        1 -> "one"
        2 -> "two"
        else -> "something else"
    }
}

fun main() {
    whenExpression2(3)
}
