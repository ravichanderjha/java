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