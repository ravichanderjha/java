The Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. In other words, a subclass should adhere to the contract defined by its superclass. Here's a simple Java example to illustrate the Liskov Substitution Principle:

**Problem Statement:** You have a class hierarchy representing different types of birds. There's a `Bird` superclass and two subclasses, `Sparrow` and `Penguin`. The program has a method to make each bird fly. However, penguins cannot fly, so you need to ensure that using a `Penguin` object doesn't break the program.

**Solution:** You should design your classes so that a `Penguin` object can be used interchangeably with a `Bird` object without causing issues.

```java
// Bird.java (Superclass)
public class Bird {
    public void fly() {
        System.out.println("This bird can fly.");
    }
}

// Sparrow.java (Subclass for flying birds)
public class Sparrow extends Bird {
    // Inherits the fly() method from Bird
}

// Penguin.java (Subclass for non-flying birds)
public class Penguin extends Bird {
    @Override
    public void fly() {
        // Penguins cannot fly, so override the fly() method to do nothing
        System.out.println("Penguins cannot fly.");
    }
}

// BirdTest.java (Client code to test Liskov Substitution)
public class BirdTest {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        Bird bird2 = new Penguin();
        
        bird1.fly(); // Outputs: This bird can fly.
        bird2.fly(); // Outputs: Penguins cannot fly.
    }
}
```

In this example:

- `Bird` is the superclass, and it defines a `fly()` method.
- `Sparrow` is a subclass representing a bird that can fly. It doesn't override the `fly()` method because it can fly like a regular bird.
- `Penguin` is a subclass representing a bird that cannot fly. It overrides the `fly()` method to provide its own implementation indicating that penguins cannot fly.
- `BirdTest` demonstrates that you can use objects of `Sparrow` and `Penguin` interchangeably with `Bird` objects, and the program behaves correctly. The Liskov Substitution Principle is upheld because `Penguin` is a valid substitute for a `Bird`.

By adhering to the Liskov Substitution Principle, you ensure that subclasses can be used seamlessly in place of their superclass without causing unexpected behavior, making your code more robust and maintainable.