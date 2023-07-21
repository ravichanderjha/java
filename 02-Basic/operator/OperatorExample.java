public class OperatorExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Comparison Operators
        int p = 10;
        int q = 20;

        boolean isEqual = p == q;
        boolean isNotEqual = p != q;
        boolean isGreater = p > q;
        boolean isLess = p < q;
        boolean isGreaterOrEqual = p >= q;
        boolean isLessOrEqual = p <= q;

        System.out.println("\nComparison Operators:");
        System.out.println("Is Equal? " + isEqual);
        System.out.println("Is Not Equal? " + isNotEqual);
        System.out.println("Is Greater? " + isGreater);
        System.out.println("Is Less? " + isLess);
        System.out.println("Is Greater or Equal? " + isGreaterOrEqual);
        System.out.println("Is Less or Equal? " + isLessOrEqual);

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;

        boolean resultAND = condition1 && condition2;
        boolean resultOR = condition1 || condition2;
        boolean resultNOT = !condition1;

        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + resultAND);
        System.out.println("Logical OR: " + resultOR);
        System.out.println("Logical NOT: " + resultNOT);

        // Ternary Operator
        int age = 20;
        String message = (age >= 18) ? "You are an adult" : "You are a minor";
        System.out.println("\nTernary Operator:");
        System.out.println(message);

        // instanceof Operator
        class Vehicle {}
        class Car extends Vehicle {}

        Vehicle vehicle = new Car();
        boolean isCar = vehicle instanceof Car;
        System.out.println("\ninstanceof Operator:");
        System.out.println("Is vehicle a Car? " + isCar);
    }
}
