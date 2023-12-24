package kotlinlang.classes

// this is a top level property
private const val CONST = 0

private class Cup {
    private var percentFull = 0
    private val max = 100
    fun add(increase: Int) {
        percentFull += increase // modify a class property value
        if (percentFull > max) percentFull = max // access class property value
        println("percentFull:$percentFull")
    }
}

fun main() {
    val cup = Cup()
    cup.add(10) // we can change a mutable member property even if the object cup is immutable
    cup.add(20)
    cup.add(60)
    cup.add(200)

    var cup2 = Cup()
    // cup2.max=200 we can't change an immutable member property even if the object cup2 is immutable
    cup2 = cup // changing cup2 object
    println("cup: $cup cup2:$cup2")
}
