package kotlinlang.extensions

private class ExtensionProp

// property extension could have also a setter but not with a backing field
private var ExtensionProp.name: String
    get() = "hello world"
    set(value) {
        println("setting name to $value")
    }

// property extension that use  generics
private val <T> List<T>.special: T?
    get() = if (isNotEmpty()) this[0] else null

fun main() {
    val ext = ExtensionProp()
    val list = listOf<Int?>(null)
    println(list.special)
}
