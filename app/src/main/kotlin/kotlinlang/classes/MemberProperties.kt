package kotlinlang.classes

/**
 * a constant value can be declared at the top level of a file
 */
private const val CONST = 0

/**
 * a class with two private properties
 *@property percentFull a mutable property initialized by a constant value
 * @property max an immutable property
 */
internal class MemberProperties {
    private var percentFull = CONST
    private val max = 100

    /**
     * increase the value of percentFull
     *@param
     *@return the increase percent or a message if the cup is already full
     */
    fun fillTheCup(increase: Int): String {
        require(increase > 0) { "increase must be positive" }
        percentFull += increase
        // if the cup is full, set percentFull to 100
        if (percentFull > max) {
            percentFull = max
            return "the cup is already full!"
        }
        return "you added $increase percent"
    }
}
