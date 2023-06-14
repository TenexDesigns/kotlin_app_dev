In Kotlin, you can use lambdas in combination with collection functions to work with predicates and perform operations on collections. Here are some commonly used collection functions that utilize lambdas for predicates:

1.all: The all function checks if all elements in a collection satisfy a given predicate. It returns true if the predicate is true for all elements, otherwise false.

kotlin
Copy code
val numbers = listOf(1, 2, 3, 4, 5)

val allGreaterThanZero = numbers.all { it > 0 }
println(allGreaterThanZero) // Output: true

val allEven = numbers.all { it % 2 == 0 }
println(allEven) // Output: false


2.any: The any function checks if at least one element in a collection satisfies a given predicate. It returns true if the predicate is true for any element, otherwise false.

kotlin
Copy code
val numbers = listOf(1, 2, 3, 4, 5)

val hasEvenNumber = numbers.any { it % 2 == 0 }
println(hasEvenNumber) // Output: true

val hasNegativeNumber = numbers.any { it < 0 }
println(hasNegativeNumber) // Output: false


3.count: The count function counts the number of elements in a collection that satisfy a given predicate. It returns the count as an integer.

kotlin
Copy code
val numbers = listOf(1, 2, 3, 4, 5)

val countEvenNumbers = numbers.count { it % 2 == 0 }
println(countEvenNumbers) // Output: 2

val countOddNumbers = numbers.count { it % 2 != 0 }
println(countOddNumbers) // Output: 3




4.find: The find function returns the first element in a collection that satisfies a given predicate. It returns null if no element is found.

kotlin
Copy code
data class Person(val name: String, val age: Int)

val people = listOf(
    Person("John", 25),
    Person("Alice", 30),
    Person("Bob", 40)
)

val alice = people.find { it.name == "Alice" }
println(alice) // Output: Person(name=Alice, age=30)

val seniorCitizen = people.find { it.age >= 60 }
println(seniorCitizen) // Output: null
These collection functions, combined with lambdas, allow you to apply predicates and perform various operations on
collections in a concise and expressive way.



















..
