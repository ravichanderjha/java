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