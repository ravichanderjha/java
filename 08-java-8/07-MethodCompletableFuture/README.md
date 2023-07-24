1. Creating `CompletableFuture`:
   You can create a `CompletableFuture` in several ways, such as using its constructors or static factory methods like `supplyAsync()`, `runAsync()`, etc.

2. Chaining and Composing:
   `CompletableFuture` provides various methods like `thenApply()`, `thenAccept()`, `thenRun()`, and `thenCombine()`, among others, to chain and compose multiple asynchronous tasks together.

3. Combining Multiple `CompletableFuture`:
   You can use methods like `allOf()` and `anyOf()` to combine multiple `CompletableFuture` instances and wait for all or any of them to complete.

4. Exception Handling:
   `CompletableFuture` allows you to handle exceptions using methods like `exceptionally()` and `handle()`.

Program Example:

Let's create an example to demonstrate the use of `CompletableFuture` to perform asynchronous computations:

```java
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Example 1: Performing a simple async computation using supplyAsync()
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Async computation in progress...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Result from async computation!";
        });

        // Example 2: Chaining and composing CompletableFuture tasks using thenApply()
        CompletableFuture<String> future2 = future1.thenApply(result -> {
            System.out.println("Transforming result...");
            return "Transformed: " + result.toUpperCase();
        });

        // Example 3: Handling exceptions using exceptionally()
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Async computation with exception...");
            throw new RuntimeException("Error occurred during computation!");
        }).exceptionally(ex -> "Handled Exception: " + ex.getMessage());

        // Waiting for CompletableFuture to complete and retrieving the result
        try {
            System.out.println("Result 1: " + future1.get());
            System.out.println("Result 2: " + future2.get());
            System.out.println("Result 3: " + future3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
```

Output:
```
Async computation in progress...
Async computation with exception...
Transforming result...
Result 1: Result from async computation!
Result 2: Transformed: RESULT FROM ASYNC COMPUTATION!
Result 3: Handled Exception: java.lang.RuntimeException: Error occurred during computation!
```

In this example, we demonstrated the use of `CompletableFuture` for asynchronous computations:

1. In Example 1, we used `supplyAsync()` to create a `CompletableFuture` that performs an async computation. We then used `get()` to wait for the result.

2. In Example 2, we used `thenApply()` to chain the first `CompletableFuture`'s result to another computation. The second `CompletableFuture` `future2` depends on the completion of the first `future1`.

3. In Example 3, we demonstrated how to handle exceptions using `exceptionally()`. Even if an exception is thrown during the async computation, we gracefully handle it and return a default value.

`CompletableFuture` provides a powerful and flexible way to work with asynchronous computations, making it easier to handle complex concurrent operations in Java. It is a valuable addition to Java 8 that significantly improves the capabilities for dealing with asynchronous programming scenarios.