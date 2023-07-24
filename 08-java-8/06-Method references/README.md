Method references in Java 8 provide a concise and readable way to refer to methods using lambda expressions. It is a shorthand syntax that simplifies the code when the lambda expression simply calls an existing method. Method references allow you to reuse existing methods as lambda expressions, making the code more expressive and easier to understand.

There are four types of method references:

1. Reference to a static method.
2. Reference to an instance method of a particular object.
3. Reference to an instance method of an arbitrary object of a particular type.
4. Reference to a constructor.

The syntax for method references depends on the type of method reference and the context in which it is used. The general syntax for method references is `Class::methodName` or `object::methodName`.

Now, let's dive into an in-depth explanation and a program example to illustrate the use of method references in Java 8:

In-depth Description:

1. Reference to a Static Method:
   It is used to refer to a static method of a class. The syntax is `ClassName::staticMethodName`.

2. Reference to an Instance Method of a Particular Object:
   It is used to refer to an instance method of a particular object. The syntax is `object::instanceMethodName`.

3. Reference to an Instance Method of an Arbitrary Object of a Particular Type:
   It is used to refer to an instance method of an arbitrary object of a particular type. The syntax is `ClassName::instanceMethodName`.

4. Reference to a Constructor:
   It is used to refer to a constructor of a class. The syntax is `ClassName::new`.

Program Example:

Let's create an example to demonstrate each type of method reference:

```java
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Reference to a static method
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(MethodReferenceExample::print);

        // Reference to an instance method of a particular object
        Greeting greeting = new Greeting();
        names.forEach(greeting::printName);

        // Reference to an instance method of an arbitrary object of a particular type
        names.forEach(String::toUpperCase);

        // Reference to a constructor
        MessagePrinter messagePrinter = Message::new;
        messagePrinter.print("Hello, Method References!");
    }

    public static void print(String name) {
        System.out.println(name);
    }
}

class Greeting {
    public void printName(String name) {
        System.out.println("Hello, " + name);
    }
}

interface MessagePrinter {
    void print(String message);
}

class Message {
    public Message(String message) {
        System.out.println(message);
    }
}
```

Output:
```
Alice
Bob
Charlie
Hello, Alice
Hello, Bob
Hello, Charlie
ALICE
BOB
CHARLIE
Hello, Method References!
```

In this example, we have demonstrated each type of method reference:

1. Reference to a static method (`MethodReferenceExample::print`): We used the `forEach` method on the list of names to print each name using the static method `print`.

2. Reference to an instance method of a particular object (`greeting::printName`): We created an instance of the `Greeting` class and used the `forEach` method to print each name using the instance method `printName`.

3. Reference to an instance method of an arbitrary object of a particular type (`String::toUpperCase`): We used the `forEach` method to convert each name to uppercase using the instance method `toUpperCase` of the `String` class.

4. Reference to a constructor (`Message::new`): We used the method reference `Message::new` to create a new `Message` object and called the `print` method on the newly created object.

Method references provide a clean and concise way to represent method calls using lambda expressions. They improve code readability and encourage the reuse of existing methods in functional programming scenarios.