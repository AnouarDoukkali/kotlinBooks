package books.book.b1.atomicKotlin.section1

// a comment in kotlin

/* multiline
comment
in kotlin */

/**
 * also multiple comment in kotlin
 * */

fun section1() {
    // expressions are evaluated and produce a value
    val i: Int = 1 + 2

    // statements perform an action but do not produce a value
    repeat(i) {
        println("hello world")
    }

    // variable are mutable
    // the type of 'a' is inferred as Int
    var a = 1
    a = 2 // we can re-assign a variable

    // values are immutable
    val b = a // b=7 --error

    // multiple line string in Kotlin

    var name = """
        multiple lines string
    """.trimIndent()
}
