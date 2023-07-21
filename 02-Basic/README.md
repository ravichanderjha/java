# Java Basics

## 2. Java Basics

In this section, we will cover the fundamental concepts of Java programming. These basics are essential building blocks that you'll use throughout your Java development journey.

### Hello World Program

Let's start with the classic "Hello World" program. This simple program prints the text "Hello, World!" to the console:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

To run this program, follow these steps:

1. Create a new file named `HelloWorld.java`.
2. Copy and paste the code above into the file.
3. Open a terminal or command prompt and navigate to the directory containing `HelloWorld.java`.
4. Compile the program using the command: `javac HelloWorld.java`.
5. Run the program using the command: `java HelloWorld`.

You should see the output "Hello, World!" displayed in the console.

### Data Types and Variables

Java is a statically-typed language, which means you need to declare the data type of a variable before using it. Java provides various data types to represent different types of data. Here are some common data types:

- `int`: Represents whole numbers (e.g., 10, -5, 100).
- `double`: Represents floating-point numbers (e.g., 3.14, -0.5, 1.0).
- `char`: Represents a single character (e.g., 'A', '$', '1').
- `boolean`: Represents a boolean value (true or false).
- `String`: Represents a sequence of characters (e.g., "Hello", "Java").

Example:

```java
int age = 30;
double pi = 3.14;
char grade = 'A';
boolean isJavaFun = true;
String message = "Hello, Java!";
```

### Operators and Expressions

Java provides various operators to perform operations on variables and values. Operators include arithmetic, relational, logical, assignment, and more.

Example:

```java
int a = 10;
int b = 5;
int sum = a + b;
boolean isGreater = a > b;
boolean isEqual = a == b;
```

### Control Statements (if-else, switch)

Control statements allow you to control the flow of your program based on conditions. Java supports `if-else` statements for decision-making and `switch` statements for multiple choices.

Example:

```java
int age = 25;

if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a minor.");
}

// Switch statement
int dayOfWeek = 2;
String dayName;

switch (dayOfWeek) {
    case 1:
        dayName = "Sunday";
        break;
    case 2:
        dayName = "Monday";
        break;
    // Add cases for other days
    default:
        dayName = "Invalid day";
}

System.out.println("Day of the week: " + dayName);
```

### Loops (for, while, do-while)

Loops allow you to execute a block of code repeatedly. Java supports three types of loops: `for`, `while`, and `do-while`.

Example:

```java
// For loop
for (int i = 1; i <= 5; i++) {
    System.out.println("Number: " + i);
}

// While loop
int count = 1;
while (count <= 5) {
    System.out.println("Count: " + count);
    count++;
}

// Do-while loop
int num = 1;
do {
    System.out.println("Value: " + num);
    num++;
} while (num <= 5);
```

### Arrays and Enhanced for Loop

Arrays are used to store multiple elements of the same data type. Java provides an enhanced for loop (also known as the "for-each" loop) for iterating over array elements.

Example:

```java
int[] numbers = { 1, 2, 3, 4, 5 };

// Standard for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Element at index " + i + ": " + numbers[i]);
}

// Enhanced for loop (for-each loop)
for (int num : numbers) {
    System.out.println("Number: " + num);
}
```

---

This section covered Java basics, including writing a "Hello World" program, declaring variables and data types, using operators and expressions, working with control statements (if-else and switch), using loops (for, while, do-while), and understanding arrays with the enhanced for loop. These foundational concepts will set the stage for further exploration of Java programming.

*Please continue to the next sections for more Java topics and examples.*