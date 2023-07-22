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