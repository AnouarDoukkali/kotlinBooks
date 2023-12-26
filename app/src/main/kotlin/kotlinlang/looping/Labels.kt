package kotlinlang.looping

fun main() {
    outer@ for (i in 0..10) { // we can name the loop where we are
        for (j in 0..10) {
            if (i != 1) continue@outer // this will continue to next element whenever even number is encountered
            println("i:$i j:$j") // this will print only i:1 j:0 to 10
        }
    }

    odd@ for (i in 0..10) {
        for (j in 0..10) {
            println("i:$i j:$j")
            if (i == 1 || j == 1) break@odd // this will exit superior loop and terminate everything
        }
    }
}
