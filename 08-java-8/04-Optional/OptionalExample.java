import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional object with a non-null value
        Optional<String> nonNullValue = Optional.of("Hello, World!");

        // Creating an Optional object with a potentially null value
        String nullValue = null;
        Optional<String> potentiallyNullValue = Optional.ofNullable(nullValue);

        // Accessing the value from Optional with non-null value
        System.out.println("Value of nonNullValue: " + nonNullValue.get());

        // Accessing the value from Optional with potentially null value
        if (potentiallyNullValue.isPresent()) {
            System.out.println("Value of potentiallyNullValue: " + potentiallyNullValue.get());
        } else {
            System.out.println("potentiallyNullValue is empty.");
        }

        // Using orElse to provide a default value when Optional is empty
        String defaultValue = potentiallyNullValue.orElse("Default Value");
        System.out.println("Value of potentiallyNullValue with orElse: " + defaultValue);

        // Using orElseGet with a Supplier to provide a default value
        String defaultValueFromSupplier = potentiallyNullValue.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Value of potentiallyNullValue with orElseGet: " + defaultValueFromSupplier);

        // Using orElseThrow to throw an exception when Optional is empty
        try {
            potentiallyNullValue.orElseThrow(() -> new IllegalStateException("Value is absent."));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
