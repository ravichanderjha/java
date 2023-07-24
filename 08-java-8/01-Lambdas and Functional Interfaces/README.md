Lambdas and Functional Interfaces were introduced in Java 8 to support functional programming, which is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids changing state and mutable data. This feature enables developers to write more concise, expressive, and readable code.

1. Functional Interfaces:
   A functional interface is an interface that has exactly one abstract method (SAM - Single Abstract Method). It can have multiple default or static methods, but as long as it has only one abstract method, it qualifies as a functional interface. Functional interfaces are used to implement lambda expressions in Java.

   To declare a functional interface, you can use the `@FunctionalInterface` annotation (though it is optional). It is used for documentation purposes and enforces the rule of having only one abstract method in the interface.

2. Lambda Expressions:
   A lambda expression is an anonymous function that represents a block of code that can be passed as an argument to a method or stored in a variable. It provides a more concise syntax for implementing functional interfaces.

   The syntax for a lambda expression is as follows:
   `(parameters) -> expression or statement block`

   Here's a step-by-step example to demonstrate the use of functional interfaces and lambda expressions:

Step 1: Define a Functional Interface
```java
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
```

Step 2: Implement Lambda Expressions
```java
public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression to implement addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression to implement subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda expression to implement multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Lambda expression to implement division
        MathOperation division = (a, b) -> a / b;

        // Usage of lambda expressions
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + operateMath(num1, num2, addition));
        System.out.println("Subtraction: " + operateMath(num1, num2, subtraction));
        System.out.println("Multiplication: " + operateMath(num1, num2, multiplication));
        System.out.println("Division: " + operateMath(num1, num2, division));
    }

    // Method that accepts a MathOperation and performs the operation on the given numbers
    private static int operateMath(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
```

Output:
```
Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
```

In this example, we defined a functional interface `MathOperation` with one abstract method `operate()`. We then implemented different mathematical operations (addition, subtraction, multiplication, and division) using lambda expressions. The `operateMath()` method takes two integers and a `MathOperation` interface as arguments and performs the specified operation on the given numbers using the lambda expression.

Lambda expressions provide a cleaner and more concise way to pass behavior as data in Java, making the code easier to read and maintain.


In Java 8, the `java.util.function` package was introduced to provide a set of functional interfaces that represent various types of functions or operations. These functional interfaces are designed to be used with lambda expressions or method references, making it easier to work with functional programming concepts in Java.

**In-depth Description:**

The `java.util.function` package includes several functional interfaces, categorized into four main groups:

1. **Supplier**: Represents a supplier of results. It has a single abstract method `get()` that does not take any arguments but returns a result.

2. **Consumer**: Represents an operation that takes an input and returns no result. It has a single abstract method `accept(T t)`.

3. **Function**: Represents a function that takes an input of type `T` and produces an output of type `R`. It has a single abstract method `apply(T t)`.

4. **Predicate**: Represents a predicate (boolean-valued function) of one argument. It has a single abstract method `test(T t)`.

Using these functional interfaces, you can easily define behavior through lambda expressions and use them as arguments in various methods that expect functional interfaces.

**Program Example:**

Let's see an example of how to use some of the functional interfaces from the `java.util.function` package in a program:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionPackageExample {
    public static void main(String[] args) {
        // Supplier: Create a random integer supplier
        Supplier<Integer> randomIntSupplier = () -> (int) (Math.random() * 100);
        System.out.println("Random Integer: " + randomIntSupplier.get());

        // Consumer: Print each element of the list
        List<String> names = List.of("Alice", "Bob", "Charlie");
        Consumer<String> printName = name -> System.out.println("Hello, " + name);
        names.forEach(printName);

        // Function: Convert strings to integers
        List<String> numStrings = List.of("1", "2", "3", "4", "5");
        Function<String, Integer> stringToIntFunction = Integer::parseInt;
        List<Integer> numbers = new ArrayList<>();
        numStrings.forEach(str -> numbers.add(stringToIntFunction.apply(str)));
        System.out.println("List of Integers: " + numbers);

        // Predicate: Filter even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> evenNumbers = new ArrayList<>();
        numbers.forEach(num -> {
            if (isEven.test(num)) {
                evenNumbers.add(num);
            }
        });
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
```

Output:
```
Random Integer: 38
Hello, Alice
Hello, Bob
Hello, Charlie
List of Integers: [1, 2, 3, 4, 5]
Even Numbers: [2, 4]

```

In this example, we use four functional interfaces from the `java.util.function` package:

1. `Supplier<Integer>`: We create a `randomIntSupplier` that generates a random integer between 0 and 99 using the `get()` method.

2. `Consumer<String>`: We define a `printName` consumer that prints a greeting message for each element in the `names` list using the `forEach()` method.

3. `Function<String, Integer>`: We create a `stringToIntFunction` that converts strings to integers using the `apply()` method.

4. `Predicate<Integer>`: We define a `isEven` predicate that checks whether a number is even using the `test()` method.

We then demonstrate the use of these functional interfaces to perform specific operations, such as generating a random integer, printing names, converting strings to integers, and filtering even numbers.

The `java.util.function` package provides a powerful set of functional interfaces that enable functional programming in Java and promote concise and expressive code using lambda expressions or method references.