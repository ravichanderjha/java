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