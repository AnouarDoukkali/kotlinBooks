package kotlinlang.nullable

private fun nonNullAssertion(str: String?, number: Int?) {
    println(str!!.length) // here the developer guarantees that str can't be null
    val num: Int = number!! // we can assign a presumed null variable to a non null number
    // smart cast str to String as we guaranteed that it's not a null previously
    val str2: String = str
}
