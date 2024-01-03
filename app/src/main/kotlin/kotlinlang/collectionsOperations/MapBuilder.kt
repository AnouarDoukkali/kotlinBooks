package kotlinlang.collectionsOperations

private data class MapPersons(val name: String, val age: Int)

private val names = listOf("Alice", "Bob", "Carol", "Dan", "Eve")

private val ages = listOf(21, 25, 25, 25, 30)

private val peoples: List<MapPersons> = names.zip(ages) { name, age -> MapPersons(name, age) }

// filter persons that has the same age using groupBy
private val map: Map<Int, List<MapPersons>> = peoples.groupBy(MapPersons::age)

private val map2: Map<Int, MapPersons> = peoples.associateBy { it.age }
