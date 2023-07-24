import java.util.Optional;

public class OptionalDepthExample {
    public static void main(String[] args) {
        // Create Optional instances
        Optional<String> nonEmptyOptional = Optional.of("Hello, World!");
        Optional<String> emptyOptional = Optional.empty();

        // isPresent and ifPresent
        System.out.println("Is nonEmptyOptional present? " + nonEmptyOptional.isPresent());
        nonEmptyOptional.ifPresent(System.out::println); // Prints "Hello, World!"

        System.out.println("Is emptyOptional present? " + emptyOptional.isPresent());
        emptyOptional.ifPresent(System.out::println); // No output, as the Optional is empty

        // orElse and orElseGet
        String result1 = nonEmptyOptional.orElse("Default Value");
        String result2 = emptyOptional.orElse("Default Value");
        System.out.println("Result 1: " + result1); // Result 1: Hello, World!
        System.out.println("Result 2: " + result2); // Result 2: Default Value

        String result3 = nonEmptyOptional.orElseGet(() -> "Default Value");
        String result4 = emptyOptional.orElseGet(() -> "Default Value");
        System.out.println("Result 3: " + result3); // Result 3: Hello, World!
        System.out.println("Result 4: " + result4); // Result 4: Default Value

        // map
        Optional<Integer> lengthOptional = nonEmptyOptional.map(String::length);
        lengthOptional.ifPresent(System.out::println); // Prints the length of "Hello, World!" (13)

        // flatMap
        Optional<String> transformedOptional = nonEmptyOptional.flatMap(str -> Optional.of(str.toUpperCase()));
        transformedOptional.ifPresent(System.out::println); // Prints "HELLO, WORLD!"

        // filter
        Optional<String> filteredOptional = nonEmptyOptional.filter(str -> str.contains("World"));
        filteredOptional.ifPresent(System.out::println); // Prints "Hello, World!"
    }
}
