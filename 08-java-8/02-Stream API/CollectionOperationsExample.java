import java.util.Arrays;
import java.util.List;

public class CollectionOperationsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // forEach: Print each element of the list
        System.out.println("Printing each element using forEach:");
        numbers.forEach(System.out::println);

        // map: Square each element of the list
        System.out.println("\nSquaring each element using map:");
        numbers.stream()
                .map(num -> num * num)
                .forEach(System.out::println);

        // filter: Filter even numbers
        System.out.println("\nFiltering even numbers using filter:");
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        // reduce: Sum of all elements
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("\nSum of all elements: " + sum);
    }
}
