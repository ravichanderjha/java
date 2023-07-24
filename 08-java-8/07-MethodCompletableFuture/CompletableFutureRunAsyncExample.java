import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureRunAsyncExample{
    public static void main(String[] args) {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
// Simulate some background computation
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 1: Processing step " + i);
            }
        });
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2: Background computation completed.");
        });
        try{
            future1.get();
            future2.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}