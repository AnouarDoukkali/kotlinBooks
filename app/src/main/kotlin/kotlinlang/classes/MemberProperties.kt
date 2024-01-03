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
