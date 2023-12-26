package kotlinlang.classes

// data class generates their own toString , equals() and hashCode() functions
// they add the function copy() to copy a data class
private data class User(val username: String, var password: String, val email: String? = null) {
    // can have custom properties
    var log: String = ""
        set(value) {
            require(value != "@")
            field = value
        }

    // can have function
    private fun calculation() {
        println("calculation")
    }
}

fun main() {
    val user1 = User(username = "admin", password = "default")
    val user2 = user1.copy(email = "") // usage of copy
    // null and an empty string are considered equal when comparing hash codes
    println(user1.hashCode() == user2.hashCode())

    // the objects are equal if the data are equals
    println(user1 == user2)

    // the data is presented unlike normal classes
    user1.toString()

    // data class allows destructing declarations
    val (username, password, email) = user1
    println(username)
    println(password)
    println(email)
}
