import java.util.Arrays;
import java.util.Random;

public class ParallelArraySortExample {
    public static void main(String[] args) {
        int arraySize = 1000000;
        int[] array = generateRandomArray(arraySize);

        System.out.println("Unsorted Array:");
        printArray(array);

        long startTime = System.currentTimeMillis();

        // Parallel sorting
        Arrays.parallelSort(array);

        long endTime = System.currentTimeMillis();
        System.out.println("\nSorted Array:");
        printArray(array);

        System.out.println("\nTime taken for parallel sorting: " + (endTime - startTime) + " milliseconds");
    }

    // Helper method to generate a random integer array
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Generate random numbers between 0 and 999
        }
        return array;
    }

    // Helper method to print the contents of an array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}