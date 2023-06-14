In Kotlin, collections are an important part of the language and are used to store and manipulate groups of data.
Kotlin provides a rich set of collection types and various operations to work with them. Here are some commonly used collection types in Kotlin:




1.List: A list is an ordered collection of elements. In Kotlin, you can create a list using the listOf() or mutableListOf() functions.
The former creates an immutable (read-only) list, while the latter creates a mutable list that allows modifications.

val immutableList = listOf(1, 2, 3)
val mutableList = mutableListOf("apple", "banana", "orange")




2.Set: A set is a collection of unique elements. Kotlin provides setOf() and mutableSetOf() functions to create immutable and mutable sets, respectively.


val immutableSet = setOf("red", "green", "blue")
val mutableSet = mutableSetOf(1, 2, 3)



3.Map: A map is a collection of key-value pairs. Each key in the map is unique.
In Kotlin, you can create a map using mapOf() for an immutable map and mutableMapOf() for a mutable map.


val immutableMap = mapOf("name" to "John", "age" to 25)
val mutableMap = mutableMapOf("country" to "USA", "city" to "New York")




4.Array: An array is a fixed-size collection that contains elements of the same type.
In Kotlin, you can create an array using the arrayOf() function.


val array = arrayOf(1, 2, 3)




5.Collection Operations: Kotlin provides a rich set of operations to work with collections. 
These include forEach, filter, map, reduce, and many more. These operations allow you to perform common tasks on collections,
  such as iterating over elements, filtering elements based on a condition, transforming elements, and aggregating values.


val numbers = listOf(1, 2, 3, 4, 5)

numbers.forEach { println(it) } // Print each element

val filteredList = numbers.filter { it % 2 == 0 } // Filter even numbers

val doubledList = numbers.map { it * 2 } // Double each element

val sum = numbers.reduce { acc, number -> acc + number } // Compute sum of elements



These are just a few examples of the collection types and operations available in Kotlin.
The Kotlin standard library provides many more useful functions and extensions for working with collections,
  allowing you to write expressive and concise code when dealing with groups of data.









COLLECTION METHODS
**********************************************************************************************************************




Here are some commonly used methods available for each of the collection types in Kotlin:

1,Common Methods Available for All Collections:

size: Returns the number of elements in the collection.
isEmpty: Returns true if the collection is empty, false otherwise.
contains(element): Returns true if the collection contains the specified element, false otherwise.
containsAll(elements): Returns true if the collection contains all the specified elements, false otherwise.
iterator(): Returns an iterator over the elements in the collection.


2.List-Specific Methods:

get(index): Returns the element at the specified index.
indexOf(element): Returns the index of the first occurrence of the specified element, or -1 if not found.
lastIndexOf(element): Returns the index of the last occurrence of the specified element, or -1 if not found.
subList(fromIndex, toIndex): Returns a new list containing the elements from the specified range.



3.MutableList-Specific Methods:

add(element): Appends the specified element to the end of the list.
addAll(elements): Appends all the specified elements to the end of the list.
remove(element): Removes the first occurrence of the specified element from the list.
removeAt(index): Removes the element at the specified index from the list.
removeAll(elements): Removes all occurrences of the specified elements from the list.
clear(): Removes all elements from the list.




4.Set-Specific Methods:

add(element): Adds the specified element to the set.
addAll(elements): Adds all the specified elements to the set.
remove(element): Removes the specified element from the set.
clear(): Removes all elements from the set.



5.MutableSet-Specific Methods:

add(element): Adds the specified element to the set.
addAll(elements): Adds all the specified elements to the set.
remove(element): Removes the specified element from the set.
clear(): Removes all elements from the set.


6.Map-Specific Methods:

get(key): Returns the value associated with the specified key, or null if the key is not present.
keys: Returns a set containing all the keys in the map.
values: Returns a collection containing all the values in the map.
containsKey(key): Returns true if the map contains the specified key, false otherwise.
containsValue(value): Returns true if the map contains the specified value, false otherwise.



7.MutableMap-Specific Methods:

put(key, value): Associates the specified value with the specified key in the map.
putAll(map): Adds all the key-value pairs from the specified map to the map.
remove(key): Removes the key-value pair with the specified key from the map.
clear(): Removes all key-value pairs from the map.



These are just a few examples of the methods available for each collection type. 
The Kotlin standard library provides additional methods and extensions for each collection type, 
  offering a wide range of operations and flexibility when working with collections.



































































...
