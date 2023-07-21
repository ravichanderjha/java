import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Creating Arrays
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] fruits = { "Apple", "Banana", "Orange", "Mango" };

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Fruits: " + Arrays.toString(fruits));

        // Accessing Array Elements
        int firstNumber = numbers[0];
        String thirdFruit = fruits[2];

        System.out.println("First Number: " + firstNumber);
        System.out.println("Third Fruit: " + thirdFruit);

        // Array Initialization
        int[] scores = new int[5];
        scores[0] = 80;
        scores[1] = 90;
        scores[2] = 75;
        scores[3] = 85;
        scores[4] = 95;

        System.out.println("Scores: " + Arrays.toString(scores));

        // Array Length and Iteration
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }

        // Multidimensional Arrays
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Array Copying
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println("Copied Array: " + Arrays.toString(destinationArray));

        int[] subsetArray = Arrays.copyOfRange(sourceArray, 1, 4);
        System.out.println("Subset Array: " + Arrays.toString(subsetArray));

        // Common Array Problems
        int[] numbersToFind = { 5, 2, 9, 1, 7 };

        int maxNumber = Arrays.stream(numbersToFind).max().getAsInt();
        int minNumber = Arrays.stream(numbersToFind).min().getAsInt();
        int searchIndex = Arrays.binarySearch(numbersToFind, 9);
        Arrays.sort(numbersToFind);

        System.out.println("Max Number: " + maxNumber);
        System.out.println("Min Number: " + minNumber);
        System.out.println("Index of 9: " + searchIndex);
        System.out.println("Sorted Array: " + Arrays.toString(numbersToFind));
    }
}
