package kotlinlang.collectionsOperations

// flatMap on one list only to create new elements from the same list
private fun <T> myFlatMap(list: List<T>): List<Pair<T, T>> {
    return list.flatMap { a -> list.map { b -> a to b } }
}

// ---------------------------------------------------------------------------------------------------
// flatmap on two lists to create combination of new elements from two lists
private data class FlatMapPersons(val name: String, val lastName: String, val age: Int)

private val names = listOf("Alice", "Bob", "Charles")

private val lastNames = listOf("Smith", "Jones", "Brown")

private val ages = listOf(20, 30, 40)

// it is best to define the type of persons explicitly to know what is expected to get from a complex operation
// we can go as deep as we want when using flatMap
private val persons: List<FlatMapPersons> = names.flatMap { name ->
    lastNames.flatMap { lastName ->
        ages.map { age ->
            FlatMapPersons(name, lastName, age)
        }
    }
}
