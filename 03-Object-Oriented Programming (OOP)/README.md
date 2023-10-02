# Object-Oriented Programming (OOP) in Java

## 3. Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming paradigm that emphasizes the concept of objects, which encapsulate data and behavior. Java is a fully object-oriented language, and understanding OOP principles is essential for writing efficient and maintainable code.

### Classes and Objects

In Java, a class is a blueprint for creating objects. It defines the structure and behavior of objects of that type. An object is an instance of a class, and it represents a real-world entity with its attributes (data members) and behaviors (methods).

Example:

```java
// Class definition
class Car {
    // Data members
    String make;
    String model;
    int year;

    // Method to display information about the car
    void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Creating objects of the Car class
Car car1 = new Car();
car1.make = "Toyota";
car1.model = "Corolla";
car1.year = 2022;

Car car2 = new Car();
car2.make = "Honda";
car2.model = "Civic";
car2.year = 2021;

// Calling the displayInfo() method on car1 and car2 objects
car1.displayInfo();
car2.displayInfo();
```

### Constructors

Constructors are special methods in a class that are used to initialize the object's state (data members) when it is created. In Java, a constructor has the same name as the class and does not have a return type.

Example:

```java
class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display information about the person
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Creating objects using the constructor
Person person1 = new Person("John", 30);
Person person2 = new Person("Alice", 25);

// Calling the displayInfo() method on person1 and person2 objects
person1.displayInfo();
person2.displayInfo();
```

### Encapsulation and Access Modifiers

Encapsulation is the process of hiding the internal implementation details of an object and providing public methods to interact with it. Access modifiers (e.g., `private`, `public`, `protected`) control the visibility and accessibility of class members (data members and methods).

Example:

```java
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accNumber, double initialBalance) {
        accountNumber = accNumber;
        balance = initialBalance;
    }

    // Getter method to access account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Creating a BankAccount object
BankAccount account = new BankAccount("12345", 1000.0);

// Using public methods to interact with the object
System.out.println("Initial Balance: " + account.getBalance());
account.deposit(500.0);
System.out.println("Balance after deposit: " + account.getBalance());
account.withdraw(300.0);
System.out.println("Balance after withdrawal: " + account.getBalance());
```

### Inheritance

Inheritance is a mechanism in OOP where one class (subclass or derived class) inherits the properties and behaviors of another class (superclass or base class). It allows code reuse and promotes the concept of "is-a" relationship.

Example:

```java
// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Derived class (subclass)
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Derived class (subclass)
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows.");
    }
}

// Creating objects and calling the sound() method
Animal animal = new Animal();
Animal dog = new Dog();
Animal cat = new Cat();

animal.sound(); // Output: Animal makes a sound.
dog.sound();    // Output: Dog barks.
cat.sound();    // Output: Cat meows.
```

### Polymorphism

Polymorphism allows an object to take on multiple forms. In Java, it can be achieved through method overriding (runtime polymorphism) and method overloading (compile-time polymorphism).

Example:

```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square.");
    }
}

// Using method overriding (runtime polymorphism)
Shape circle = new Circle();
Shape square = new Square();

circle.draw(); // Output: Drawing a circle.
square.draw(); // Output: Drawing a square.

// Using method overloading (compile-time polymorphism)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

Calculator calculator = new Calculator();
System.out.println(calculator.add(2, 3));       // Output: 5
System.out.println(calculator.add(2.5, 3.5));   // Output: 6.0
```

### Abstraction



Abstraction allows you to represent the essential features of an object while hiding the unnecessary details. In Java, abstraction can be achieved through abstract classes and interfaces.

Example:

```java
// Abstract class
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square.");
    }
}

// Creating objects and calling the draw() method
Shape circle = new Circle();
Shape square = new Square();

circle.draw(); // Output: Drawing a circle.
square.draw(); // Output: Drawing a square.
```

### Interfaces

Interfaces define a contract for classes, specifying a set of methods that the implementing classes must provide. A class can implement multiple interfaces, enabling multiple inheritance in Java.

Example:

```java
// Interface
interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing a document.");
    }
}

class Image implements Printable {
    public void print() {
        System.out.println("Printing an image.");
    }
}

// Creating objects and calling the print() method
Printable document = new Document();
Printable image = new Image();

document.print(); // Output: Printing a document.
image.print();    // Output: Printing an image.
```

### Packages

Packages are used to organize classes into meaningful groups, helping to avoid naming conflicts and making code management more manageable. Java provides built-in packages, and you can also create your own custom packages.

Example:

```java
// Importing built-in package classes
import java.util.ArrayList;

// Importing custom package classes (assuming the classes are in the package "com.example")
import com.example.MyClass;
import com.example.MyUtility;

// Using ArrayList from java.util package
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Orange");

// Using custom classes from the "com.example" package
MyClass obj = new MyClass();
MyUtility.doSomething();
```

---

This section covered Object-Oriented Programming (OOP) concepts in Java, including creating classes and objects, using constructors, encapsulation with access modifiers, inheritance, polymorphism, abstraction through abstract classes and interfaces, and organizing code with packages. These fundamental concepts form the backbone of Java programming, enabling code reusability, modularity, and maintainability.

### Interfaces
Some Uni