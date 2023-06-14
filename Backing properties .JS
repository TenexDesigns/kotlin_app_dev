A backing property in Kotlin is a design pattern used to provide custom accessors (getters or setters) for a property while still
having a separate private property to store the value. 
This pattern is useful when you need to perform additional logic or validation in the accessors while maintaining a separate storage for the actual value.

Heres an example to illustrate the use of a backing property:

class Person {
    private var _name: String = "John Doe"

    var name: String
        get() = _name
        set(value) {
            if (value.isNotBlank()) {
                _name = value
            } else {
                println("Name cannot be blank")
            }
        }
}
In this example, _name is the backing property for the public name property.
The custom setter for name ensures that it cannot be set to a blank value. When accessing or modifying the name property, 
  the backing property _name is used to store the actual value.

Note that this is different from a backing field, which is generated automatically by Kotlin when you use the field identifier in the accessors of a property.
With a backing property, you have more control over the storage and access patterns, 
  but its more verbose than using a backing field. baeldung.com




























MORE EXPLANATION
******************************************************************************************************************************************

In Kotlin, a backing property is a property that is used to store the value of another property. It allows you to define custom logic for property access and modification while keeping the syntax of accessing the property simple.

To create a backing property, you can use the field identifier, which represents the backing field associated with the property. Here's an example:

kotlin
Copy code
class Example {
    var _value: Int = 0
    
    var value: Int
        get() = _value
        set(newValue) {
            _value = newValue * 2
        }
}
In the example above, the Example class has a property named value, which has a backing property named _value. The backing property _value is initialized with a default value of 0.

The value property has a custom getter and setter. The getter retrieves the value from the backing field _value. The setter multiplies the new value by 2 and assigns it to the backing field.

Here's how you can use the Example class:

kotlin
Copy code
fun main() {
    val example = Example()
    println(example.value) // Output: 0
    
    example.value = 5
    println(example.value) // Output: 10
}
In the main function, an instance of Example is created. The initial value of value is printed, which accesses the backing field _value. Then, the value property is set to 5, which triggers the custom setter and modifies the backing field. Finally, the updated value of value is printed, which again accesses the backing field _value.

Backing properties provide a way to encapsulate the logic for property access and modification while still allowing straightforward access to the property itself. They are especially useful when you need to perform additional operations or apply custom transformations when reading or writing a property value.
