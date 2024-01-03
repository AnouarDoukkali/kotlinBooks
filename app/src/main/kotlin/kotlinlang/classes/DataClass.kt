package kotlinlang.classes

private data class User(val username: String, var password: String, val email: String? = null) {
    // can have custom properties
    var log: String = ""
        set(value) {
            require(value != "@")
            calculation()
            field = value
        }

    // can have function
    private fun calculation() {
        println("calculation")
    }
}
