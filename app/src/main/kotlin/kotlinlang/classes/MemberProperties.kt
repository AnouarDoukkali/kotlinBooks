package kotlinlang.classes

/**
 * A constant value declared at the top level of a file.
 */
private const val PI = 3.14

/**
 * A class with two private properties and a late-initialized string.
 * @property pi a private property initialized by a constant value.
 * @property max a private immutable property.
 * @property sum a late-initialized string.
 */
internal class MemberProperties {
    private val pi = PI
    private val max = 100
    lateinit var name: String
}
