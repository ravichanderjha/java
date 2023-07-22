# Java Collections Framework

The Java Collections Framework provides a set of interfaces and classes that allow you to store, manage, and manipulate groups of objects in Java. It offers a more efficient and flexible way to work with collections of data compared to traditional arrays. The key interfaces in the Java Collections Framework are List, Set, and Map, which are implemented by various classes like ArrayList, LinkedList, HashSet, HashMap, etc.

## Introduction to Collections

Collections in Java are used to store multiple elements in a single unit. They provide useful methods for adding, removing, and accessing elements and offer several algorithms for sorting, searching, and manipulating data.

## List, Set, and Map Interfaces

1. **List**: The List interface extends the Collection interface and allows duplicate elements. It maintains the insertion order of elements, which means the elements can be accessed by their index. Common List implementations include ArrayList and LinkedList.

2. **Set**: The Set interface extends the Collection interface but does not allow duplicate elements. It ensures that each element appears only once in the collection. Common Set implementations include HashSet and TreeSet.

3. **Map**: The Map interface does not extend the Collection interface. It represents a mapping of unique keys to values. Each key can be associated with only one value. Common Map implementations include HashMap and TreeMap.

## ArrayList, LinkedList, HashSet, HashMap, etc.

1. **ArrayList**: It is an implementation of the List interface backed by a dynamic array. It can grow and shrink dynamically as elements are added or removed. ArrayList provides fast random access and is suitable for most list operations.

2. **LinkedList**: It is an implementation of the List interface backed by a doubly-linked list. It provides fast insertions and deletions but slower random access compared to ArrayList.

3. **HashSet**: It is an implementation of the Set interface based on a hash table. It provides constant-time performance for basic operations like add, remove, and contains.

4. **HashMap**: It is an implementation of the Map interface based on a hash table. It provides constant-time performance for basic operations like put and get.

## Sorting and Searching Collections

The Collections class in Java provides various utility methods for sorting and searching collections. For sorting, you can use the `sort()` method, and for searching, you can use the `binarySearch()` method.

Example:

```java
import java.util.ArrayList;
import java.util.Collections;

public class SortingAndSearchingExample {
    public static void main(String[] args) {
        // Sorting ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        System.out.println("Before sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);

        // Searching ArrayList
        int index = Collections.binarySearch(numbers, 15);
        System.out.println("Index of 15: " + index);
    }
}
```

## Iterators

Iterators allow you to traverse through the elements of a collection sequentially. They provide methods like `hasNext()` to check if there are more elements and `next()` to retrieve the next element.

Example:

```java
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
```

---

The Java Collections Framework simplifies data manipulation and management in Java applications. By using interfaces like List, Set, and Map, along with their various implementations like ArrayList, HashSet, and HashMap, you can efficiently work with collections of data. Additionally, the Collections class provides utility methods for sorting and searching collections, and iterators facilitate seamless traversal of collection elements.

In Java, the `List` interface is part of the Java Collections Framework and represents an ordered collection of elements. It extends the `Collection` interface and allows duplicate elements while maintaining the order of insertion. There are several classes that implement the `List` interface, each with its own characteristics and use cases. Let's explore some of the common implementations of the `List` interface in Java.

1. ArrayList:
   `ArrayList` is one of the most commonly used implementations of the `List` interface. It is backed by a dynamic array that grows and shrinks as needed. It provides fast random access but slower insertions and deletions compared to `LinkedList`. It is a good choice when you need frequent read operations and infrequent modifications.

Example:

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicates are allowed

        System.out.println("ArrayList: " + fruits);
    }
}
```

Output:
```
ArrayList: [Apple, Banana, Orange, Apple]
```

2. LinkedList:
   `LinkedList` is another implementation of the `List` interface, backed by a doubly-linked list. It provides fast insertions and deletions, but slower random access compared to `ArrayList`. It is suitable when you need frequent modifications and do not require frequent random access.

Example:

```java
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Lion"); // Duplicates are allowed

        System.out.println("LinkedList: " + animals);
    }
}
```

Output:
```
LinkedList: [Lion, Tiger, Elephant, Lion]
```

3. Vector:
   `Vector` is a synchronized implementation of the `List` interface, which means it is thread-safe. However, due to its synchronized nature, it may be slower than `ArrayList` in multi-threaded scenarios. It is similar to `ArrayList` but offers additional thread safety.

Example:

```java
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Vector: " + numbers);
    }
}
```

Output:
```
Vector: [10, 20, 30]
```

4. Stack:
   `Stack` is a subclass of `Vector` that follows the Last-In-First-Out (LIFO) principle. It is commonly used in applications where elements need to be added and removed from the same end (the top of the stack). It provides methods like `push()` and `pop()`.

Example:

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        String topElement = stack.pop();
        System.out.println("Popped: " + topElement);
        System.out.println("Updated Stack: " + stack);
    }
}
```

Output:
```
Stack: [Java, Python, C++]
Popped: C++
Updated Stack: [Java, Python]
```

These are some of the common implementations of the `List` interface in Java. Each implementation has its own strengths and weaknesses, so it is essential to choose the appropriate implementation based on your specific requirements and performance considerations.

## Set
In Java, the `Set` interface is part of the Java Collections Framework and represents an unordered collection of unique elements. It does not allow duplicate elements, meaning each element can appear only once in the set. The `Set` interface extends the `Collection` interface and provides methods for adding, removing, and checking the presence of elements.

There are several classes that implement the `Set` interface in Java, each with its own characteristics and use cases. Let's explore some of the common implementations of the `Set` interface in Java.

1. HashSet:
   `HashSet` is one of the most commonly used implementations of the `Set` interface. It is backed by a hash table, which provides constant-time performance for basic operations like adding, removing, and checking the presence of elements. However, it does not maintain any specific order of elements.

Example:

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicates are not allowed

        System.out.println("HashSet: " + fruits);
    }
}
```

Output:
```
HashSet: [Orange, Banana, Apple]
```

2. TreeSet:
   `TreeSet` is another implementation of the `Set` interface that stores elements in a sorted order. It uses a Red-Black tree data structure to maintain elements in ascending order. As a result, the elements are always sorted, but the basic operations have O(log n) time complexity.

Example:

```java
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(2); // Duplicates are not allowed

        System.out.println("TreeSet: " + numbers);
    }
}
```

Output:
```
TreeSet: [2, 5, 10]
```

3. LinkedHashSet:
   `LinkedHashSet` is a variation of `HashSet` that maintains the insertion order of elements, along with the uniqueness of elements. It uses a hash table for storing elements and a linked list to maintain the order of insertion.

Example:

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> colors = new LinkedHashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicates are not allowed

        System.out.println("LinkedHashSet: " + colors);
    }
}
```

Output:
```
LinkedHashSet: [Red, Green, Blue]
```

4. EnumSet:
   `EnumSet` is a specialized implementation of the `Set` interface for enumerations. It provides better performance and memory efficiency for sets of enum values compared to other implementations.

Example:

```java
import java.util.EnumSet;
import java.util.Set;

enum Days { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

public class EnumSetExample {
    public static void main(String[] args) {
        Set<Days> weekendDays = EnumSet.of(Days.SATURDAY, Days.SUNDAY);

        System.out.println("Weekend Days: " + weekendDays);
    }
}
```

Output:
```
Weekend Days: [SUNDAY, SATURDAY]
```

These are some of the common implementations of the `Set` interface in Java. Each implementation has its own strengths and weaknesses, so it is essential to choose the appropriate implementation based on your specific requirements and performance considerations. Remember that the `Set` interface guarantees the uniqueness of elements in the set, making it an excellent choice for scenarios where you need to manage a collection of unique elements efficiently.

## Map
In Java, the `Map` interface is part of the Java Collections Framework and represents a collection of key-value pairs. It provides a way to associate a unique key with a corresponding value. Each key in a `Map` must be unique, but multiple keys can be associated with the same value. The `Map` interface does not extend the `Collection` interface but is still an essential part of the Java Collections Framework.

Key Characteristics of Map:
- Each key in a `Map` must be unique.
- A key can be associated with a value, and the value can be retrieved using the key.
- A `Map` does not allow duplicate keys.

The `Map` interface defines several methods for working with key-value pairs, such as `put()`, `get()`, `remove()`, `containsKey()`, and more.

There are several classes that implement the `Map` interface in Java, each with its own characteristics and use cases. Let's explore some of the common implementations of the `Map` interface in Java.

1. HashMap:
   `HashMap` is one of the most commonly used implementations of the `Map` interface. It is backed by a hash table and provides constant-time performance for basic operations like put, get, and remove. It does not maintain any specific order of key-value pairs.

Example:

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("John", 90);
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("John", 92); // Updates the value for key "John"

        System.out.println("HashMap: " + scores);
    }
}
```

Output:
```
HashMap: {Alice=95, Bob=88, John=92}
```

2. TreeMap:
   `TreeMap` is another implementation of the `Map` interface that stores key-value pairs in ascending order of keys. It uses a Red-Black tree data structure to maintain the keys in sorted order. As a result, the keys are always sorted, but the basic operations have O(log n) time complexity.

Example:

```java
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> grades = new TreeMap<>();
        grades.put(80, "A");
        grades.put(70, "B");
        grades.put(90, "A");
        grades.put(60, "C");

        System.out.println("TreeMap: " + grades);
    }
}
```

Output:
```
TreeMap: {60=C, 70=B, 80=A, 90=A}
```

3. LinkedHashMap:
   `LinkedHashMap` is a variation of `HashMap` that maintains the order of key-value pairs based on insertion order. It uses a hash table for storing key-value pairs and a doubly-linked list to maintain the order of insertion.

Example:

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> ages = new LinkedHashMap<>();
        ages.put("John", 30);
        ages.put("Alice", 25);
        ages.put("Bob", 35);

        System.out.println("LinkedHashMap: " + ages);
    }
}
```

Output:
```
LinkedHashMap: {John=30, Alice=25, Bob=35}
```

These are some of the common implementations of the `Map` interface in Java. Each implementation has its own strengths and weaknesses, so it is essential to choose the appropriate implementation based on your specific requirements and performance considerations. The `Map` interface provides a powerful way to associate keys with values and is often used in various Java applications for efficient data retrieval and storage.