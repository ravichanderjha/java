// Base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Derived class (subclass)
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Derived class (subclass)
class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Using method overriding (runtime polymorphism)
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw(); // Output: Drawing a circle.
        square.draw(); // Output: Drawing a square.

        // Using method overloading (compile-time polymorphism)
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));       // Output: 5
        System.out.println(calculator.add(2.5, 3.5));   // Output: 6.0
    }
}

// Utility class with method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
