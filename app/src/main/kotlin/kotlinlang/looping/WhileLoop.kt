package kotlinlang.looping

private fun usingWhile() {
    var i = 0
    while (i < 100) {
        println(i)
        i += 10
    }
}

private fun usingDoWhile() {
    var i = 0
    do {
        println(i)
        i += 10
    } while (i < 100)
}
