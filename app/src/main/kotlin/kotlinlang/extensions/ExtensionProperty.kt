package kotlinlang.extensions

import java.util.*

private class ExtensionProp

// property extension could have also a setter but not with a backing field
private var ExtensionProp.name: String
    get() = Random().nextInt().toString()
    set(value) {
        println("setting name to $value")
    }

// property extension that use  generics
private val <T> List<T>.special: T?
    get() = if (isNotEmpty()) this[0] else null
