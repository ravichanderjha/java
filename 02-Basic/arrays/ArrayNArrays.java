package Basic;

import java.util.Arrays;

public class ArrayNArrays {
    public static void main(String[] args){
// Declare an integer array with size 5
        int[] myArray = new int[5];

// Initialize the array with values
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

// Accessing elements in the array
        System.out.println(myArray[0]); // Output: 10
        System.out.println(myArray[2]); // Output: 30
        System.out.println(myArray[4]); // Output: 50

        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println(myArray1[0]); // Output: 1
        System.out.println(myArray1[2]); // Output: 3
        System.out.println(myArray1[4]); // Output: 5

        //Arrays Function
        System.out.println(myArray.length); // Output: 5

        System.out.println(Arrays.toString(myArray1)); // Output: {1, 2, 3, 4, 5}

        int[] sortArray = {3, 1, 2};
        Arrays.sort(sortArray);
        System.out.println(Arrays.toString(sortArray)); // Output: [1, 2, 3]

        int index = Arrays.binarySearch(myArray1, 2);
        System.out.println(index); // Output: 1

        int[] newArray = Arrays.copyOf(myArray, 10);
        System.out.println(Arrays.toString(newArray));
        }


}
