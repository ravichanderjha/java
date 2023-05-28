package Beginner;

public class VarArgsExample {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(10, 20, 30);
        printNumbers(); // Empty varargs
    }

    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
