In Java 8, parallel array sorting was introduced to take advantage of multiple processor cores for sorting large arrays more efficiently. This feature allows arrays to be sorted concurrently on multiple threads, which can lead to significant performance improvements for large datasets.

Prior to Java 8, arrays could only be sorted using a single-threaded sorting algorithm like `Arrays.sort()`. With the introduction of parallel array sorting, you can now use `Arrays.parallelSort()` to perform sorting concurrently across multiple threads.

**In-depth Description:**

The `Arrays.parallelSort()` method uses the Fork-Join framework, which is designed for parallelizing recursive algorithms, to sort arrays in parallel. The Fork-Join framework divides the array into smaller sub-arrays and delegates the sorting of these sub-arrays to separate threads. Once the sorting of sub-arrays is completed, the results are merged back to produce the final sorted array.

It's important to note that parallel array sorting is beneficial for large datasets where the overhead of thread management and merging results is outweighed by the gains in parallelism. For smaller arrays, the single-threaded `Arrays.sort()` might be faster due to the reduced overhead.

**Program Example:**

Let's demonstrate how to use `Arrays.parallelSort()` to sort a large array of integers:

```java
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
```

In this example, we generate an array of size `arraySize` (1,000,000 elements) with random integers. We then use `Arrays.parallelSort()` to sort this array in parallel.

The output will show the unsorted array, followed by the sorted array, and the time taken for parallel sorting.

Keep in mind that the actual performance improvement of parallel sorting depends on various factors, including the number of processor cores available and the size of the array being sorted. For smaller arrays or systems with limited cores, the difference in performance might be minimal compared to the single-threaded sorting approach.

To summarize, Java 8's parallel array sorting provides a convenient way to sort large arrays more efficiently by utilizing multiple processor cores. However, it's essential to evaluate the dataset size and the system's capabilities to determine whether parallel sorting will indeed provide performance gains for a specific scenario.