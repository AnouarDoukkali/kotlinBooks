package kotlinlang.lambdas

/* lambda functions is kind of generic for functions , it allows us to let the user implement custom logic
of a specific function that can be part of a principal function parameters. */

private fun <T> expectingLambda(str: String, process: (String) -> T): T {
    println("inside expectingLambda body")
    return process(str) // the lambda can do any type of processing since the result is generic
}

private inline fun <T> expectingLambda2(str: String, process: (String) -> T): T {
    println("inside expectingLambda2 body")
    return process(str)
}
// we could make expectingLambda even complicated by getting a type and return different type

private fun <S, T> genericLambda(str: S, process: (S) -> T): T {
    println("inside expectingLambda body")
    return process(str) // the lambda can do any type of processing since the result is generic
}

// implementing List.filter using lambda
private fun <T> List<T>.myFilter(process: (T) -> Boolean): List<T> {
    val newList = mutableListOf<T>()

    for (i in this) {
        if (process(i)) {
            newList.add(i)
        }
    }
    return newList
}

// a function that has the signature (String)->String
private fun replaceIt(str: String): String {
    return str.replace(oldChar = 'a', newChar = 'o')
}
