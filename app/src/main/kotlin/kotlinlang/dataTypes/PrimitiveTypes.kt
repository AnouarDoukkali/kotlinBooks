package kotlinlang.dataTypes

private fun characters() {
    val c = 'c'
    val charMAx = Char.MAX_VALUE
    val charMIN = Char.MIN_VALUE
    println("c=$c is of type CHAR , the max value is: $charMAx , the min value is: $charMIN")
    // adding to char
    println("Characters in Unicode are numbers; adding an integer changes the Unicode value : c+1=${c + 1}")
    for (ch in "Jnskhm ") print(ch + 1)
    println('k' in "kotlin") // here k is a char, not a variable. this will print true.
}

private fun bytes() {
    val b: Byte = 5 // should be explicit or will be Int by default
    val byteMAX = Byte.MAX_VALUE
    val byteMIN = Byte.MIN_VALUE
    println("b=$b is of type BYTE, the max value is: $byteMAX, the min value is: $byteMIN")
}

// Short
private fun shorts() {
    val s: Short = 5 // should be explicit or will be Int by default
    val shortMAX = Short.MAX_VALUE
    val shortMIN = Short.MIN_VALUE
    println("s=$s is of type SHORT, the max value is: $shortMAX, the min value is: $shortMIN")
}

// Int
private fun ints() {
    val i = 10 // Int by default
    val million = 1_000_000 // For readability, Kotlin allows underscores within numerical values.
    val intMAX = Int.MAX_VALUE
    val intMIN = Int.MIN_VALUE
    println("i=$i is of type INT, the max value is: $intMAX, the min value is: $intMIN")
    println("ex : forcing Long calculation to avoid int overflow : ${0L + intMAX + intMAX}")
}

// Long
private fun longs() {
    val l = 5L // can be explicit by setting the type :Long or adding 'L'
    val longMAX = Long.MAX_VALUE
    val longMIN = Long.MIN_VALUE
    println("l=$l is of type LONG, the max value is: $longMAX, the min value is: $longMIN")
}

// Float
private fun floats() {
    val f = .5f // can be explicit by setting the type :Float or adding 'f'
    val floatMAX = Float.MAX_VALUE
    val floatMIN = Float.MIN_VALUE
    println("f=$f is of type FLOAT, the max value is: $floatMAX, the min value is: $floatMIN")
}

// Double
private fun doubles() {
    val d = .5 // Double by default
    val doubleMAX = Double.MAX_VALUE
    val doubleMIN = Double.MIN_VALUE
    println("d=$d is of type DOUBLE, the max value is: $doubleMAX, the min value is: $doubleMIN")
}

private fun additionResult() {
    // when adding multiple primitives, the result is in the higher order
    val total = 0.5f + 0.10
}
