Default methods were introduced in Java 8 to provide a way to add new functionality to existing interfaces without breaking backward compatibility. Prior to Java 8, if a new method was added to an interface, all the classes implementing that interface would need to provide an implementation for the new method. This was not feasible in situations where the interface was widely implemented, and modifying all the implementing classes was not practical.

Default methods solve this problem by allowing interfaces to provide a default implementation for new methods. Any class that implements the interface can choose to override the default method if needed, but it is not mandatory. This way, existing classes that implement the interface will automatically inherit the default implementation, making it backward compatible.

Here's an in-depth explanation and an example to demonstrate default methods in Java 8:

In-depth Description:

1. Declaring Default Methods:
   To declare a default method in an interface, simply define the method with the `default` keyword followed by the method signature and implementation.

2. Inheritance of Default Methods:
   If a class implements multiple interfaces that provide default methods with the same signature, the class must explicitly override the method to disambiguate the default behavior.

3. Interface Hierarchies:
   Default methods can create an inheritance hierarchy within interfaces, where interfaces can extend other interfaces and inherit default method implementations.

Program Example:

Let's create an example with a simple interface that contains a default method and two classes that implement this interface:

```java
interface Greeting {
    void greet(); // Abstract method

    // Default method implementation
    default void defaultGreet() {
        System.out.println("Hello, from the defaultGreet() method in the Greeting interface.");
    }
}

class EnglishGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello, World!");
    }
}

class FrenchGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("Bonjour, le monde!");
    }

    // Overriding the default method if needed
    @Override
    public void defaultGreet() {
        System.out.println("Bonjour, from the defaultGreet() method in the FrenchGreeting class.");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Greeting englishGreeting = new EnglishGreeting();
        englishGreeting.greet();
        englishGreeting.defaultGreet(); // Using the default method

        Greeting frenchGreeting = new FrenchGreeting();
        frenchGreeting.greet();
        frenchGreeting.defaultGreet(); // Using the overridden default method
    }
}
```

Output:
```
Hello, World!
Hello, from the defaultGreet() method in the Greeting interface.
Bonjour, le monde!
Bonjour, from the defaultGreet() method in the FrenchGreeting class.
```

In this example, we defined an interface `Greeting` with two methods: `greet()` (an abstract method) and `defaultGreet()` (a default method). The `Greeting` interface provides a default implementation for the `defaultGreet()` method.

The `EnglishGreeting` class implements the `Greeting` interface and provides its implementation for the `greet()` method.

The `FrenchGreeting` class also implements the `Greeting` interface but overrides the `greet()` method with its own implementation. It also overrides the `defaultGreet()` method to provide a custom implementation.

In the `main()` method, we create instances of `EnglishGreeting` and `FrenchGreeting` and call their respective methods. When calling `defaultGreet()` for both classes, the `Greeting` interface's default implementation is used for `EnglishGreeting`, and the overridden implementation in the `FrenchGreeting` class is used for `FrenchGreeting`.

Default methods provide a powerful mechanism to enhance existing interfaces in Java libraries without breaking compatibility and enable a more flexible and extensible design for interfaces.