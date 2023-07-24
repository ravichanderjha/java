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