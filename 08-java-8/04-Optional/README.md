The `Optional` class in Java 8 was introduced to address the problem of dealing with potentially absent (null) values in a more elegant and less error-prone way. It is a container class that may or may not contain a non-null value. Instead of directly returning null from a method, you can use `Optional` to wrap the potential return value, making it clear that the value might be absent and encouraging explicit handling of such cases.

Here's an in-depth explanation and a program example to demonstrate the use of the `Optional` class in Java 8:

In-depth Description:

1. Creating an Optional Object:
   You can create an `Optional` object using its static methods like `of()`, `ofNullable()`, or `empty()`. The `of()` method is used when you are certain that the value is non-null, whereas `ofNullable()` can handle both non-null and potentially null values.

2. Accessing the Value:
   To access the value inside an `Optional`, you can use methods like `get()` (use with caution as it throws an exception if the value is absent), `orElse()`, `orElseGet()`, or `orElseThrow()`.

3. Avoiding NullPointerException:
   By using `Optional`, you can avoid NullPointerExceptions that may occur when dealing with null values directly.

Program Example:

Let's create an example to demonstrate how to use `Optional` to handle a potentially null value:

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional object with a non-null value
        Optional<String> nonNullValue = Optional.of("Hello, World!");

        // Creating an Optional object with a potentially null value
        String nullValue = null;
        Optional<String> potentiallyNullValue = Optional.ofNullable(nullValue);

        // Accessing the value from Optional with non-null value
        System.out.println("Value of nonNullValue: " + nonNullValue.get());

        // Accessing the value from Optional with potentially null value
        if (potentiallyNullValue.isPresent()) {
            System.out.println("Value of potentiallyNullValue: " + potentiallyNullValue.get());
        } else {
            System.out.println("potentiallyNullValue is empty.");
        }

        // Using orElse to provide a default value when Optional is empty
        String defaultValue = potentiallyNullValue.orElse("Default Value");
        System.out.println("Value of potentiallyNullValue with orElse: " + defaultValue);

        // Using orElseGet with a Supplier to provide a default value
        String defaultValueFromSupplier = potentiallyNullValue.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Value of potentiallyNullValue with orElseGet: " + defaultValueFromSupplier);

        // Using orElseThrow to throw an exception when Optional is empty
        try {
            potentiallyNullValue.orElseThrow(() -> new IllegalStateException("Value is absent."));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

Output:
```
Value of nonNullValue: Hello, World!
potentiallyNullValue is empty.
Value of potentiallyNullValue with orElse: Default Value
Value of potentiallyNullValue with orElseGet: Default Value from Supplier
Value is absent.
```

In this example, we created two `Optional` objects, one with a non-null value and another with a potentially null value. We demonstrated different ways of accessing the value inside an `Optional`:

1. Using `get()` method to directly access the value from an `Optional` with a non-null value. Note that using `get()` on an empty `Optional` will throw a `NoSuchElementException`, so it's generally safer to use other methods like `orElse()` or `orElseGet()`.

2. Using `isPresent()` method to check if the `Optional` contains a value.

3. Using `orElse()` to provide a default value if the `Optional` is empty.

4. Using `orElseGet()` with a `Supplier` to provide a default value when the `Optional` is empty. The `Supplier` will be called only if the `Optional` is empty, which can be more efficient than using `orElse()`.

5. Using `orElseThrow()` to throw a custom exception when the `Optional` is empty.

By using the `Optional` class, you can write more robust and expressive code that handles potentially absent values in a clearer and safer way, reducing the chances of NullPointerExceptions and improving the overall code quality.

In Java 8, the `java.util.Optional` class was introduced as a container that may or may not contain a non-null value. It provides a way to handle optional values in a more elegant and safer manner, avoiding the need for explicit null checks and reducing the possibility of null pointer exceptions.

**In-depth Description:**

The `Optional` class includes various methods to work with optional values, such as:

1. **`of` and `ofNullable`**: These methods are used to create instances of `Optional`. `Optional.of(value)` is used when you are certain that the value is not null, whereas `Optional.ofNullable(value)` is used when the value can be null.

2. **`isPresent`**: This method checks whether the `Optional` contains a non-null value. It returns `true` if the value is present, and `false` otherwise.

3. **`ifPresent`**: This method is used to perform an action only if the `Optional` contains a non-null value. It accepts a consumer (lambda expression or method reference) that is executed when the value is present.

4. **`orElse` and `orElseGet`**: These methods provide default values to be used when the `Optional` is empty. `orElse(defaultValue)` returns the provided default value if the `Optional` is empty, whereas `orElseGet(supplier)` takes a `Supplier` and returns the result of the supplier if the `Optional` is empty.

5. **`map` and `flatMap`**: These methods are used to transform the value inside the `Optional`. `map` applies a function to the value and returns a new `Optional` containing the result. `flatMap` is similar, but it expects the transformation function to return another `Optional`, which is then flattened to a single `Optional`.

6. **`filter`**: This method is used to filter the `Optional` based on a predicate (a boolean-valued function). If the value satisfies the predicate, the same `Optional` is returned; otherwise, an empty `Optional` is returned.

**Program Example:**

Let's see an example of how to use `Optional` and its methods in a program:

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Create Optional instances
        Optional<String> nonEmptyOptional = Optional.of("Hello, World!");
        Optional<String> emptyOptional = Optional.empty();

        // isPresent and ifPresent
        System.out.println("Is nonEmptyOptional present? " + nonEmptyOptional.isPresent());
        nonEmptyOptional.ifPresent(System.out::println); // Prints "Hello, World!"

        System.out.println("Is emptyOptional present? " + emptyOptional.isPresent());
        emptyOptional.ifPresent(System.out::println); // No output, as the Optional is empty

        // orElse and orElseGet
        String result1 = nonEmptyOptional.orElse("Default Value");
        String result2 = emptyOptional.orElse("Default Value");
        System.out.println("Result 1: " + result1); // Result 1: Hello, World!
        System.out.println("Result 2: " + result2); // Result 2: Default Value

        String result3 = nonEmptyOptional.orElseGet(() -> "Default Value");
        String result4 = emptyOptional.orElseGet(() -> "Default Value");
        System.out.println("Result 3: " + result3); // Result 3: Hello, World!
        System.out.println("Result 4: " + result4); // Result 4: Default Value

        // map
        Optional<Integer> lengthOptional = nonEmptyOptional.map(String::length);
        lengthOptional.ifPresent(System.out::println); // Prints the length of "Hello, World!" (13)

        // flatMap
        Optional<String> transformedOptional = nonEmptyOptional.flatMap(str -> Optional.of(str.toUpperCase()));
        transformedOptional.ifPresent(System.out::println); // Prints "HELLO, WORLD!"

        // filter
        Optional<String> filteredOptional = nonEmptyOptional.filter(str -> str.contains("World"));
        filteredOptional.ifPresent(System.out::println); // Prints "Hello, World!"
    }
}
```

Output:
```
Is nonEmptyOptional present? true
Hello, World!
Is emptyOptional present? false
Result 1: Hello, World!
Result 2: Default Value
Result 3: Hello, World!
Result 4: Default Value
13
HELLO, WORLD!
Hello, World!
```

In this example, we demonstrate the use of `Optional` and its methods:

1. We create instances of `Optional` using `Optional.of("Hello, World!")` and `Optional.empty()`.

2. We use `isPresent()` to check whether the `Optional` contains a value, and `ifPresent()` to perform an action if the value is present.

3. We use `orElse()` and `orElseGet()` to provide default values when the `Optional` is empty.

4. We use `map()` to transform the value inside the `Optional` and `flatMap()` to perform a transformation that results in another `Optional`.

5. We use `filter()` to filter the `Optional` based on a predicate.

`Optional` is a powerful addition to Java 8, as it encourages a more expressive and safer way to handle optional values, reducing the risk of null pointer exceptions and promoting cleaner and more readable code.