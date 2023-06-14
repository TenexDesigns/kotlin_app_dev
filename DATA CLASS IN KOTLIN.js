In Kotlin, a data class is a special type of class that is primarily used to hold data and represents a simple structure. Data classes are designed to automatically generate useful methods such as equals(), hashCode(), toString(), and copy(), based on the properties defined in the class. This feature saves developers from writing repetitive boilerplate code.

To declare a data class in Kotlin, you use the data keyword before the class keyword. Heres an example of a data class:


data class Person(val name: String, val age: Int)
In the example above, Person is a data class with two properties: name of type String and age of type Int. When you create an instance of a data class, you can access and modify its properties as usual:


val person = Person("John", 30)
println(person.name) // Output: John

person.age = 35
println(person.age) // Output: 35
Data classes automatically provide the following functionalities:

Component functions: Data classes automatically generate component functions for all properties declared in the primary constructor. These component functions allow you to destructure objects of the data class into their individual properties. For example:


val (name, age) = person
println(name) // Output: John
println(age) // Output: 35
Equals and hashCode: Data classes automatically generate equals() and hashCode() methods based on the properties declared in the primary constructor. These methods compare the values of the properties to determine equality and generate hash codes accordingly.

toString(): Data classes generate a toString() method that provides a string representation of the object, including the property names and their values. For example:

println(person.toString()) // Output: Person(name=John, age=35)
Copy function: Data classes provide a copy() function that allows you to create a copy of an existing object with modified values for selected properties. For example:


val modifiedPerson = person.copy(age = 40)
println(modifiedPerson) // Output: Person(name=John, age=40)
Data classes can also have additional functions, properties, and secondary constructors, just like regular classes. However, its important to note that data classes must fulfill specific requirements:

The primary constructor must have at least one parameter.
The parameters of the primary constructor must be marked as either val or var (to make them properties).
Data classes cannot be abstract, sealed, or inner classes.
Overall, data classes in Kotlin provide a concise and convenient way to represent and manipulate data structures while automatically generating commonly used methods, reducing boilerplate code, and improving code readability.
