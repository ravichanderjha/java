import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionPackageExample {
    public static void main(String[] args) {
        // Supplier: Create a random integer supplier
        Supplier<Integer> randomIntSupplier = () -> (int) (Math.random() * 100);
        System.out.println("Random Integer: " + randomIntSupplier.get());

        // Consumer: Print each element of the list
        List<String> names = List.of("Alice", "Bob", "Charlie");
        Consumer<String> printName = name -> System.out.println("Hello, " + name);
        names.forEach(printName);

        // Function: Convert strings to integers
        List<String> numStrings = List.of("1", "2", "3", "4", "5");
        Function<String, Integer> stringToIntFunction = Integer::parseInt;
        List<Integer> numbers = new ArrayList<>();
        numStrings.forEach(str -> numbers.add(stringToIntFunction.apply(str)));
        System.out.println("List of Integers: " + numbers);

        // Predicate: Filter even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> evenNumbers = new ArrayList<>();
        numbers.forEach(num -> {
            if (isEven.test(num)) {
                evenNumbers.add(num);
            }
        });
        System.out.println("Even Numbers: " + evenNumbers);
    }
}