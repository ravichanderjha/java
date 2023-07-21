import java.util.Arrays;
import java.util.Comparator;

public class ArraysClassExample {
    public static void main(String[] args) {
        // Sorting Arrays
        int[] numbers = { 5, 2, 9, 1, 7 };
        Arrays.sort(numbers);
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));

        String[] names = { "Alice", "Bob", "Eve", "Charlie" };
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println("Sorted Names in Descending Order: " + Arrays.toString(names));

        // Searching Arrays
        int[] sortedNumbers = { 1, 2, 3, 4, 5 };
        int searchValue = 3;
        int index = Arrays.binarySearch(sortedNumbers, searchValue);
        System.out.println("Index of " + searchValue + " in the sorted array: " + index);

        // Copying Arrays
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println("Copied Array: " + Arrays.toString(destinationArray));

        // Filling Arrays
        int[] numbersToFill = new int[5];
        Arrays.fill(numbersToFill, 42);
        System.out.println("Filled Array: " + Arrays.toString(numbersToFill));

        // Array Comparison
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        boolean areEqual = Arrays.equals(arr1, arr2);
        System.out.println("Are Arrays arr1 and arr2 equal? " + areEqual);

        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = { 1, 4, 3 };
        int mismatchIndex = Arrays.mismatch(arr3, arr4);
        System.out.println("First mismatching element index: " + mismatchIndex);
    }
}
