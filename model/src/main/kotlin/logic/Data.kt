package logic

/**
 * @since 1.0
 *@constructor Logic class constructor with id and name
 *@property id id of logic class
 *@property name name of logic class
 */
@Suppress("unused")
private class LogicClass(val id: String, val name: String) {
    /**
     *@return DataLogger object id of the data logger
     */
    fun info(): String {
        return "id: $id, name: $name"
    }
}
