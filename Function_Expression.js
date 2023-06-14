In Kotlin, function expressions allow you to define functions concisely using a shorthand syntax. Function expressions are also known as lambda expressions or anonymous functions. They are useful for creating small, one-time functions without the need for declaring a separate named function.

Here's the general syntax of a function expression:

kotlin
Copy code
val functionName: (parameters) -> ReturnType = { arguments -> functionBody }
In the above syntax:

functionName is an optional variable name you can give to the function expression.
(parameters) represents the parameters that the function takes.
ReturnType is the return type of the function.
arguments represents the actual arguments passed to the function.
functionBody is the code block that defines the functionality of the function.
Here's an example of a function expression that calculates the square of a number:

kotlin
Copy code
val square: (Int) -> Int = { x -> x * x }

fun main() {
    val result = square(5)
    println(result) // Output: 25
}
In this example, the function expression square takes an Int parameter and returns an Int. The code block { x -> x * x } represents the function body, which multiplies the input x by itself.

Function expressions can also be used as higher-order functions, which means they can be passed as arguments to other functions or returned as results. Here's an example of using a function expression as a parameter to the map() function:

kotlin
Copy code
val numbers = listOf(1, 2, 3, 4, 5)
val squares = numbers.map { x -> x * x }

println(squares) // Output: [1, 4, 9, 16, 25]
In this example, the map() function takes a function expression { x -> x * x } as an argument and applies it to each element of the numbers list, returning a new list squares with the squared values.

Function expressions provide a concise and expressive way to define functions on the fly. They are particularly useful when working with higher-order functions, functional programming paradigms, and scenarios where you need to pass behavior as an argument.




