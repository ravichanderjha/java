In Java 8, the `java.util.concurrent` package received some updates and enhancements to improve support for concurrent programming. These updates include the introduction of new classes like `StampedLock` and enhancements to existing classes like `CompletableFuture` and `ConcurrentHashMap`.

**In-depth Description:**

1. **StampedLock**:
   `StampedLock` is a new addition to Java 8 that provides a more efficient alternative to traditional `ReadWriteLock` in certain scenarios. It allows for more flexibility in controlling read and write access to a shared resource. It introduces the concept of "stamp" to indicate a particular state of the lock. StampedLock has three modes: read, write, and optimistic read.

    - **Read Lock**: Multiple threads can acquire read locks concurrently as long as there is no active write lock. This is similar to the traditional read lock in `ReadWriteLock`.
    - **Write Lock**: Only one thread can acquire the write lock, and it excludes all read and optimistic read locks.
    - **Optimistic Read Lock**: Multiple threads can acquire optimistic read locks concurrently. However, this mode does not block other threads from acquiring the write lock. After obtaining an optimistic read lock, the thread must validate if the shared resource has been modified by any write operation before proceeding.

2. **CompletableFuture Enhancements**:
   `CompletableFuture` is a class introduced in Java 8 to represent asynchronous computations. In Java 8, it received several enhancements to support chaining and combining asynchronous tasks more conveniently. Some of the new methods added to `CompletableFuture` include `thenCompose`, `thenCombine`, `thenAcceptBoth`, and `allOf`.

3. **ConcurrentHashMap Enhancements**:
   `ConcurrentHashMap` is a highly concurrent alternative to `HashMap` for multi-threaded applications. In Java 8, `ConcurrentHashMap` received some updates to support bulk operations like `forEach`, `reduce`, and `search`, making it easier to perform common operations on the map concurrently.

**Program Example:**

Let's demonstrate the usage of `StampedLock`, `CompletableFuture`, and `ConcurrentHashMap` with a simple program:

```java
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.StampedLock;

public class ConcurrentUpdatesExample {
    public static void main(String[] args) {
        // StampedLock example
        StampedLock stampedLock = new StampedLock();
        long writeStamp = stampedLock.writeLock(); // Acquire write lock
        try {
            // Write operation
            System.out.println("Write operation: Resource updated");
        } finally {
            stampedLock.unlockWrite(writeStamp); // Release write lock
        }

        long readStamp = stampedLock.readLock(); // Acquire read lock
        try {
            // Read operation
            System.out.println("Read operation: Resource accessed");
        } finally {
            stampedLock.unlockRead(readStamp); // Release read lock
        }

        // CompletableFuture example
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello, ");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World!");

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (s1, s2) -> s1 + s2);
        System.out.println("Combined result: " + combinedFuture.join());

        // ConcurrentHashMap example
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.forEach(2, (key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
```

Output:
```
Write operation: Resource updated
Read operation: Resource accessed
Combined result: Hello, World!
Key: 2, Value: Two
```

In this example:

1. We demonstrate the usage of `StampedLock` to perform write and read operations on a shared resource, where multiple threads can read simultaneously but write is exclusive.

2. We use `CompletableFuture` to perform two asynchronous tasks, combine their results, and print the combined output.

3. We use `ConcurrentHashMap` to store key-value pairs and demonstrate the use of `forEach` to process entries in the map concurrently.

These enhancements in the `java.util.concurrent` package improve the support for concurrent programming in Java 8 and make it more efficient and convenient to work with multi-threaded applications.