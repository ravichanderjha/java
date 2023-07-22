public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        System.out.println(numbers[4]); // This will throw an ArrayIndexOutOfBoundsException
    }
}