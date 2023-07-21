# Java Array Tutorial

This Java Array tutorial provides a comprehensive guide to working with arrays in the Java programming language. Arrays are used to store multiple elements of the same data type in a single variable. Understanding how to create, manipulate, and process arrays is essential for Java developers.

## Table of Contents

1. [Introduction to Arrays](#introduction-to-arrays)
2. [Creating Arrays](#creating-arrays)
3. [Accessing Array Elements](#accessing-array-elements)
4. [Array Initialization](#array-initialization)
5. [Array Length and Iteration](#array-length-and-iteration)
6. [Multidimensional Arrays](#multidimensional-arrays)
7. [Array Copying](#array-copying)
8. [Common Array Problems](#common-array-problems)

## 1. Introduction to Arrays

An array in Java is a fixed-size data structure that stores elements of the same type in contiguous memory locations. Arrays provide a convenient way to work with collections of data, such as numbers, strings, or custom objects.

## 2. Creating Arrays

You can create arrays in Java using square brackets `[]` with the data type, followed by the array name and the number of elements inside curly braces `{}`.

```java
// Creating an array of integers
int[] numbers = { 1, 2, 3, 4, 5 };

// Creating an array of strings
String[] fruits = { "Apple", "Banana", "Orange", "Mango" };
```

## 3. Accessing Array Elements

Array elements are accessed using their index, starting from 0 for the first element.

```java
int firstNumber = numbers[0]; // Accessing the first element
String thirdFruit = fruits[2]; // Accessing the third element
```

## 4. Array Initialization

Arrays can also be initialized with a specific size and then filled with elements.

```java
int[] scores = new int[5]; // Array with size 5
scores[0] = 80;
scores[1] = 90;
scores[2] = 75;
scores[3] = 85;
scores[4] = 95;
```

## 5. Array Length and Iteration

The `length` property of an array is used to get the number of elements in the array. You can use loops to iterate over the elements of an array.

```java
int[] numbers = { 1, 2, 3, 4, 5 };

int length = numbers.length; // Length of the array
for (int i = 0; i < length; i++) {
    System.out.println(numbers[i]);
}
```

## 6. Multidimensional Arrays

Java supports multidimensional arrays, which are arrays of arrays. They can be used to represent matrices or tables.

```java
int[][] matrix = {
    { 1, 2, 3 },
    { 4, 5, 6 },
    { 7, 8, 9 }
};
```

## 7. Array Copying

Java provides methods to copy arrays, allowing you to create a new array with the same or a subset of elements.

```java
int[] sourceArray = { 1, 2, 3, 4, 5 };
int[] destinationArray = new int[sourceArray.length];

// Copy the entire array
System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

// Copy a subset of the array
int[] subsetArray = Arrays.copyOfRange(sourceArray, 1, 4);
```

## 8. Common Array Problems

This section covers common array-related problems, such as finding the maximum or minimum element, searching for an element, and sorting the array.

```java
int[] numbers = { 5, 2, 9, 1, 7 };

int maxNumber = Arrays.stream(numbers).max().getAsInt();
int minNumber = Arrays.stream(numbers).min().getAsInt();
int searchIndex = Arrays.binarySearch(numbers, 9);
Arrays.sort(numbers);
```

---