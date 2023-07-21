public class StringExample {
    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // String Operations
        String text = "Java Programming";

        int length = text.length();
        char firstChar = text.charAt(0);
        String subString = text.substring(5, 11);

        System.out.println("Length of the string: " + length);
        System.out.println("First character: " + firstChar);
        System.out.println("Substring: " + subString);

        // String Methods
        String message = "Welcome to Java World";

        boolean containsWorld = message.contains("World");
        boolean startsWithWelcome = message.startsWith("Welcome");
        boolean endsWithJava = message.endsWith("Java");
        int indexOfJava = message.indexOf("Java");
        String upperCaseMessage = message.toUpperCase();
        String replacedMessage = message.replace("Java", "Programming");

        System.out.println("Contains 'World': " + containsWorld);
        System.out.println("Starts with 'Welcome': " + startsWithWelcome);
        System.out.println("Ends with 'Java': " + endsWithJava);
        System.out.println("Index of 'Java': " + indexOfJava);
        System.out.println("Uppercase message: " + upperCaseMessage);
        System.out.println("Replaced message: " + replacedMessage);

        // String Concatenation
        String firstName = "John";
        String lastName = "Doe";

        String fullName1 = firstName + " " + lastName; // Using the + operator
        String fullName2 = firstName.concat(" ").concat(lastName); // Using the concat() method

        System.out.println("Full Name 1: " + fullName1);
        System.out.println("Full Name 2: " + fullName2);

        // String Formatting
        int age = 30;
        String name = "Alice";

        String formattedString = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println("Formatted String: " + formattedString);

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java");
        stringBuilder.append(" Programming");
        String result = stringBuilder.toString();
        System.out.println("StringBuilder Result: " + result);

        // Common String Problems
        String emptyString = "";
        String nullString = null;
        String stringWithWhitespace = "  Hello, World!  ";

        boolean isEmpty = emptyString.isEmpty();
        boolean isNull = (nullString == null);
        String trimmedString = stringWithWhitespace.trim();
        int intValue = Integer.parseInt("123");
        double doubleValue = Double.parseDouble("3.14");

        System.out.println("Is empty string? " + isEmpty);
        System.out.println("Is null string? " + isNull);
        System.out.println("Trimmed string: " + trimmedString);
        System.out.println("Parsed int value: " + intValue);
        System.out.println("Parsed double value: " + doubleValue);
    }
}
