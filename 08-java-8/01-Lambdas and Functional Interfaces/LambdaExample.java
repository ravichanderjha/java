public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression to implement addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression to implement subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda expression to implement multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Lambda expression to implement division
        MathOperation division = (a, b) -> a / b;

        // Usage of lambda expressions
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + operateMath(num1, num2, addition));
        System.out.println("Subtraction: " + operateMath(num1, num2, subtraction));
        System.out.println("Multiplication: " + operateMath(num1, num2, multiplication));
        System.out.println("Division: " + operateMath(num1, num2, division));
    }

    // Method that accepts a MathOperation and performs the operation on the given numbers
    private static int operateMath(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}