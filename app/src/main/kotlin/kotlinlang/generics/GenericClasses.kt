package kotlinlang.generics

// after the class name, we tall that we will work with a type T
// difference between using generics and using Any , is that Any allow access only to Any class members
private class GenericHolder<T>(private val value: T) {
    fun getValue(): T = value
}
