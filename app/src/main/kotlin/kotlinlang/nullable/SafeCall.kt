package kotlinlang.nullable

private fun safe(name: String?) {
    // we can call length safely for nullable type using safe call "?.", otherwise it will return null
    println(name?.length)
}

fun main() {
    safe(null)
}
