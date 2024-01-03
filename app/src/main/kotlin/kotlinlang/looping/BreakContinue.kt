package kotlinlang.looping

private fun forLoop() {
    val list = mutableListOf(0)
    @Suppress("LoopWithTooManyJumpStatements")
    for (i in 4 until 100 step 4) {
        when (i) {
            8 -> continue // this will skip 8 and continue the loop
            40 -> break // this will exit the loop
            else -> list.add(i)
        }
    }
    println(list)
}

private fun whileLoop() {
    val list = mutableListOf(0)
    var i = 0
    @Suppress("LoopWithTooManyJumpStatements")
    while (i < 100) {
        i += 4
        if (i == 8) continue //
        if (i == 40) break
        list.add(i)
    }
    println(list)
}

fun doWhileLoop() {
    val nums = mutableListOf(0)
    var i = 0
    @Suppress("LoopWithTooManyJumpStatements")
    do {
        i += 4
        if (i == 8) continue
        if (i == 40) break
        nums.add(i)
    } while (i < 100)
}
