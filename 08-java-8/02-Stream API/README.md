The Stream API is one of the significant features introduced in Java 8. It allows developers to perform functional-style operations on sequences of elements, such as arrays or collections, in a declarative and concise manner. Streams provide a high-level abstraction that enables parallel processing and optimization, making it easier to work with large datasets efficiently.

The Stream API consists of two main types of operations: intermediate and terminal operations. Intermediate operations are used to transform or filter the data, while terminal operations produce a final result or side effect, closing the stream.

Let's dive into an in-depth description and a program example to illustrate the use of the Stream API:

In-depth Description:

1. Creating a Stream:
   You can create a stream from various data sources, such as arrays, collections, or using Stream factories like `Stream.of()` or `Stream.generate()`.

2. Intermediate Operations:
   These operations are applied on the stream to transform or filter the data. Intermediate operations are lazy, meaning they don't produce a result until a terminal operation is invoked.

3. Terminal Operations:
   Terminal operations are used to produce a result or side effect. They close the stream and trigger the evaluation of intermediate operations.

Program Example:

Let's consider a program that uses the Stream API to work with a list of integers. We'll demonstrate how to use intermediate and terminal operations to manipulate the data:

```java
import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Intermediate Operation: Filter numbers greater than 10
        numbers.stream()
               .filter(number -> number > 10)

               // Intermediate Operation: Map each number to its square
               .map(number -> number * number)

               // Terminal Operation: Sum all the squares
               .reduce(0, Integer::sum);
               // The above 'reduce' operation sums all the elements using Integer::sum method reference

        // Terminal Operation: Print the final result
        System.out.println("Sum of squares of numbers greater than 10: " + sumOfSquares);
    }
}
```

Output:
```
Sum of squares of numbers greater than 10: 1160
```

In this example, we have a list of integers `numbers`. We first create a stream from this list using the `stream()` method. Then, we apply two intermediate operations: `filter` to keep only the numbers greater than 10 and `map` to square each number.

Finally, we use a terminal operation `reduce` to sum all the squared numbers. The `reduce` operation accumulates the stream elements using the `Integer::sum` method reference, starting from an initial value of 0.

The Stream API enables us to perform complex data manipulations in a more readable and expressive manner, reducing the need for explicit loops and making the code more concise and maintainable. Additionally, the Stream API can be parallelized automatically, taking advantage of multi-core processors for improved performance when working with large datasets.

In Java 8, several new methods were added to the `java.util.Collection` interfaces, such as `forEach`, `map`, `filter`, `reduce`, and others. These methods support functional-style operations, which allow you to perform various transformations and aggregations on collections using lambda expressions or method references.

**In-depth Description:**

1. **forEach**: The `forEach` method is used to perform an action on each element of the collection. It accepts a lambda expression or a method reference that represents the action to be executed on each element.

2. **map**: The `map` method is used to transform each element of the collection using a given function. It creates a new stream representing the transformed elements.

3. **filter**: The `filter` method is used to filter elements from the collection based on a condition specified by a predicate (a boolean-valued function). It creates a new stream containing only the elements that satisfy the condition.

4. **reduce**: The `reduce` method is used to aggregate elements of the collection into a single value. It takes a binary operator and performs a reduction operation on the elements of the collection to produce a result.

**Program Example:**

Let's see an example of how to use these functional-style operations with the `List` interface, which is a subtype of `Collection`, to perform various transformations and aggregations:

```java
import java.util.Arrays;
import java.util.List;

public class CollectionOperationsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // forEach: Print each element of the list
        System.out.println("Printing each element using forEach:");
        numbers.forEach(System.out::println);

        // map: Square each element of the list
        System.out.println("\nSquaring each element using map:");
        numbers.stream()
               .map(num -> num * num)
               .forEach(System.out::println);

        // filter: Filter even numbers
        System.out.println("\nFiltering even numbers using filter:");
        numbers.stream()
               .filter(num -> num % 2 == 0)
               .forEach(System.out::println);

        // reduce: Sum of all elements
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("\nSum of all elements: " + sum);
    }
}
```

Output:
```
Printing each element using forEach:
1
2
3
4
5
6
7
8
9
10

Squaring each element using map:
1
4
9
16
25
36
49
64
81
100

Filtering even numbers using filter:
2
4
6
8
10

Sum of all elements: 55
```

In this example, we have a list of integers called `numbers`. We demonstrate how to use the functional-style operations:

1. `forEach` to print each element of the list.
2. `map` to square each element of the list and print the results.
3. `filter` to filter out the even numbers and print them.
4. `reduce` to calculate the sum of all elements in the list.

Using functional-style operations, we can perform these operations on collections in a concise and expressive manner, leveraging the power of lambda expressions or method references. This style of programming encourages a more declarative and functional approach to working with collections, making the code more readable and maintainable.