# Java Operator Tutorial

This Java Operator tutorial provides a comprehensive overview of operators in the Java programming language. Operators are symbols used to perform specific operations on variables or values in Java. Understanding operators is essential for writing efficient and expressive Java code.

## Table of Contents

1. [Introduction to Operators](#introduction-to-operators)
2. [Arithmetic Operators](#arithmetic-operators)
3. [Assignment Operators](#assignment-operators)
4. [Comparison Operators](#comparison-operators)
5. [Logical Operators](#logical-operators)
6. [Bitwise Operators](#bitwise-operators)
7. [Conditional Operator (Ternary Operator)](#conditional-operator-ternary-operator)
8. [Instanceof Operator](#instanceof-operator)

## 1. Introduction to Operators

Operators in Java are symbols that allow you to perform various operations on variables or constants. These operations include arithmetic calculations, logical evaluations, and bitwise manipulations, among others.

## 2. Arithmetic Operators

Arithmetic operators are used for performing basic mathematical calculations in Java. These operators include addition, subtraction, multiplication, division, and modulus.

```java
int a = 10;
int b = 5;

int sum = a + b; // Addition
int difference = a - b; // Subtraction
int product = a * b; // Multiplication
int quotient = a / b; // Division
int remainder = a % b; // Modulus
```

## 3. Assignment Operators

Assignment operators are used to assign values to variables in Java. They also allow for shorthand expressions.

```java
int x = 10;

x += 5; // Equivalent to x = x + 5;
x -= 3; // Equivalent to x = x - 3;
x *= 2; // Equivalent to x = x * 2;
x /= 4; // Equivalent to x = x / 4;
x %= 3; // Equivalent to x = x % 3;
```

## 4. Comparison Operators

Comparison operators are used to comparing two values or variables in Java. They return a boolean value of either `true` or `false`.

```java
int p = 10;
int q = 20;

boolean isEqual = p == q; // Equal to
boolean isNotEqual = p != q; // Not equal to
boolean isGreater = p > q; // Greater than
boolean isLess = p < q; // Less than
boolean isGreaterOrEqual = p >= q; // Greater than or equal to
boolean isLessOrEqual = p <= q; // Less than or equal to
```

## 5. Logical Operators

Logical operators are used to performing logical operations in Java. These operators include logical AND, logical OR, and logical NOT.

```java
boolean condition1 = true;
boolean condition2 = false;

boolean resultAND = condition1 && condition2; // Logical AND
boolean resultOR = condition1 || condition2; // Logical OR
boolean resultNOT = !condition1; // Logical NOT
```

## 6. Bitwise Operators

Bitwise operators are used to manipulating individual bits of integer types in Java.

```java
int num1 = 5; // Binary: 101
int num2 = 3; // Binary: 011

int resultAND = num1 & num2; // Bitwise AND: 001 (decimal 1)
int resultOR = num1 | num2; // Bitwise OR: 111 (decimal 7)
int resultXOR = num1 ^ num2; // Bitwise XOR: 110 (decimal 6)
int resultComplement = ~num1; // Bitwise complement: 11111111111111111111111111111010 (decimal -6)
```

## 7. Conditional Operator (Ternary Operator)

The conditional operator (also known as the ternary operator) is a shorthand for an if-else statement.

```java
int age = 20;
String message = (age >= 18) ? "You are an adult" : "You are a minor";
```

## 8. Instanceof Operator

The `instanceof` operator is used to check if an object belongs to a particular class or implements an interface.

```java
class Vehicle { }
class Car extends Vehicle { }

Vehicle vehicle = new Car();
boolean isCar = vehicle instanceof Car; // true
```