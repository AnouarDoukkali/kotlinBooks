@file:Suppress("unused")

package kotlinlang.collections.lists.operations

import kotlinlang.special.Person

/* File: ListOperations.kt
 * Author: Anouar Doukkali
 * Created on:  4/20/2024 9:02 AM
 * Description: This file contains operations that can be performed on a list of Person objects.
 * Since: v0.1.0
 */

/**
 * object  providing operations on lists of Person objects.
 */
internal object ListOperations {
    /**
     * Groups a list of Person objects by their age.
     *
     * @param list The list of Person objects to group.
     * @return A map where the keys are ages and the values are lists of Person objects of that age.
     */
    fun groupPersonByAge(list: List<Person>): Map<Int, List<Person>> {
        return list.groupBy { it.age }
    }

    /**
     * Associates a list of Person objects by their age.
     *
     * @param list The list of Person objects to associate.
     * @return A map where the keys are ages and the values are the last Person object of that age in the list.
     */
    fun associate(list: List<Person>): Map<Int, Person> {
        return list.associateBy { it.age }
    }
}
