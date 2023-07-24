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
        MessagePrinter messagePrinter = MyMessage::new;
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

class MyMessage {
    public MyMessage(String message) {
        System.out.println(message);
    }
}
