package algorithms.sort;

import java.util.*;


/*
Even though insertion sort is efficient, still, if we provide an already sorted array to the insertion sort algorithm,
it will still execute the outer for loop, thereby requiring n steps to sort an already sorted array of n elements,
which makes its best case time complexity a linear function of n.

Time Complexity
Best: O(n)
Average: O(n^2)
Worst: O(n^2)

Space Complexity
O(1)

Best-case performance : O(n) comparisons, O(1) swaps
Average performance : O(n^2) comparisons, O(n^2) swaps
Worst-case performance :  O(n^2) comparisons, O(n^2) swaps

Worst-case space complexity : O(n) total, O(1) auxiliary
*/


public class InsertionSort {

    public static void main(String args[]) {
        InsertionSort insertionSort = new InsertionSort();
        int unsorted[] = {1,3,2};
        insertionSort.sort(unsorted);
        System.out.println("Sorted array : " + Arrays.toString(unsorted));

    }

    static void sort(int array[]) {

        for (int j = 1; j < array.length; j++) {
            System.out.println("Outer Loop : "+j + " = "+Arrays.toString(array));

            int current = array[j];
            System.out.println("current = "+current);
            int i = j - 1; /* Move elements of a[0..i-1], that are greater than key, to one position ahead of their current position */

            System.out.println("i = "+i +", array[i] > current = "+array[i]+" > "+current);

            while ((i >= 0) && (array[i] > current)) {
                System.out.println("    Inner Loop : swapped");
                array[i + 1] = array[i];
                i--;
                System.out.println("    i = "+i+", array -> "+ Arrays.toString(array));
            }

            array[i + 1] = current;
            System.out.println("Current : "+Arrays.toString(array));
        }

    }

    private static void insertionSortRecursive(int[] input, int i) {
        if (i <= 1) {
            return;
        }
        insertionSortRecursive(input, i - 1);
        int key = input[i - 1];
        int j = i - 2;
        while (j >= 0 && input[j] > key) {
            input[j + 1] = input[j];
            j = j - 1;
        }
        input[j + 1] = key;
    }

}
