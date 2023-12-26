package kotlinlang.nullable

private fun nullable(str: String?) { // str can be a string or null
    var number: Int? = null // number can be either Int or null
    if (str != null) println(str.length) // smart cast str to String when it can be null
}
