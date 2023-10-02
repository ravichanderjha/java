The Open/Closed Principle (OCP) states that software entities (such as classes, modules, or functions) should be open for extension but closed for modification. In other words, you should be able to add new functionality to a module without altering its existing source code.

Here's a simple example in Java that demonstrates the Open/Closed Principle using a shape drawing system:

**Problem Statement:** You have a drawing application that can draw different shapes, such as circles and rectangles. Initially, your code only supports these two shapes. However, you want to extend the system to support more shapes (e.g., triangles) without modifying the existing code for drawing circles and rectangles.

**Solution:** To adhere to the OCP, you can use an abstract class or interface for all shapes and create concrete subclasses for each shape. This way, you can add new shapes by creating new subclasses without modifying the existing drawing code.

```java
// Shape.java (Abstract class representing a shape)
public abstract class Shape {
    public abstract void draw();
}

// Circle.java (Concrete class for drawing circles)
public class Circle extends Shape {
    @Override
    public void draw() {
        // Logic to draw a circle
        System.out.println("Drawing a circle");
    }
}

// Rectangle.java (Concrete class for drawing rectangles)
public class Rectangle extends Shape {
    @Override
    public void draw() {
        // Logic to draw a rectangle
        System.out.println("Drawing a rectangle");
    }
}

// Triangle.java (New shape - Concrete class for drawing triangles)
public class Triangle extends Shape {
    @Override
    public void draw() {
        // Logic to draw a triangle
        System.out.println("Drawing a triangle");
    }
}

// DrawingApplication.java (Client code to draw shapes)
public class DrawingApplication {
    public void drawShape(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        DrawingApplication app = new DrawingApplication();
        
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle(); // Adding a new shape without modifying existing code
        
        app.drawShape(circle);
        app.drawShape(rectangle);
        app.drawShape(triangle);
    }
}
```

In this example:

- The `Shape` class is an abstract class representing a shape. It defines an abstract `draw()` method that concrete subclasses must implement.
- `Circle` and `Rectangle` are concrete classes that extend `Shape` and provide their own implementations of the `draw()` method.
- `Triangle` is a new shape introduced without modifying the existing code. It also extends `Shape` and implements the `draw()` method.
- `DrawingApplication` is the client code that can draw various shapes without knowing the details of each shape's implementation.

By following the Open/Closed Principle, you can easily extend the system to support new shapes (e.g., `Triangle`) without modifying existing classes (`Circle` and `Rectangle`). This makes the code more maintainable and less prone to introducing bugs when extending the functionality.