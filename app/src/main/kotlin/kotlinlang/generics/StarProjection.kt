package kotlinlang.generics

// When the generic argument type isn’t used, you may replace it with *
// it means that the type is not important and can be Any?
private val List<*>.indices: IntRange

    get() = 0 until size
