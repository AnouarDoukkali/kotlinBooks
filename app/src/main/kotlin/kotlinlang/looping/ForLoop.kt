package kotlinlang.looping

private fun loopingRange() {
    for (i in 0..10) { // looping an IntRange
        println("normal loop, i=$i")
        break
    }
    for (i in 0 until 10) { // excluding 10 from the range
        println("loop until 9, i=$i")
        break
    }
    for (i in 0..10 step 2) { // stepping by 2
        println("step by 2, i=$i")
        break
    }

    for (i in 10 downTo 0 step 2) { // reverse the count and step by 2 using IntProgression
        println("reverse the count and step by 2, i=$i")
        println(i)
    }

    for (c in 'a'..'z') { // we can also devine a char range
        print(c)
    }
}

fun progressionVSRange(r: IntProgression = 0..10) { // IntProgression is superClass of IntRange
    for (i in r) {
        println(i)
    }
}

fun main() {
    val s = "abc"

    println('c' + 1)
}
