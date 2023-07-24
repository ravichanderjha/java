package example;
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