import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Intermediate Operation: Filter numbers greater than 10
        Integer sumOfSquares = numbers.stream()
                .filter(number -> number > 10)

                // Intermediate Operation: Map each number to its square
                .map(number -> number * number)

                // Terminal Operation: Sum all the squares
                .reduce(0, Integer::sum);
        // The above 'reduce' operation sums all the elements using Integer::sum method reference

        // Terminal Operation: Print the final result
        System.out.println("Sum of squares of numbers greater than 10: " + sumOfSquares);
    }
}