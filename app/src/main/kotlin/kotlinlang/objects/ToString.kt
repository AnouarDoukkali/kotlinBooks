package kotlinlang.objects

private class RawInformation

private class Information {
    override fun toString(): String = "this is an Information object"
}

fun main() {
    val rawInformation = RawInformation()
    val information = Information()
    println(rawInformation) // call default toString when a string is needed
    println(information) // call override toString when a string is needed
}
