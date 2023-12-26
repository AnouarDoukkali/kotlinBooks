package kotlinlang.extensions

private class Record(val id: Int?)

// this extension function allows to perform a check even for nullable variables
private fun Record?.isNull(): Boolean = this == null || id == null

fun main() {
    val rec: Record = Record(null)

    // if the extension didn't allow nullable, we will be forced to use safe call here and result may be null
    //  instead of boolean
    val result: Boolean = rec.isNull()
    println(result)
}
