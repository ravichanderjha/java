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
        CompletableFuture<Object> future3 = CompletableFuture.supplyAsync(() -> {
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
