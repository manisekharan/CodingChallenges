package algorithms.sort;
/*

Complexity Analysis of Selection Sort
Selection Sort requires two nested for loops to complete itself,
one for loop is in the function selectionSort, and inside the first loop we are making a call to another function minIndex,
which has the second(inner) for loop.

Time Complexity
Best: O(n^2)
Average: O(n^2)
Worst: O(n^2)

Space Complexity
O(1)

Best-case performance : O(n^2) comparisons, O(n) swaps
Average performance : O(n^2) comparisons, O(n) swaps
Worst-case performance :  O(n^2) comparisons, O(n) swaps

Worst-case space complexity : O(1) auxiliary

*/

import java.util.*;

public class SelectionSort {

    public static void main(String a[]) {
        int unsorted[] = {1,2,3};
        System.out.println("Giving unsorted Array : "+ Arrays.toString(unsorted)+", Length : "+unsorted.length);
        sort(unsorted);
    }

    private static void sort(int[] unsorted) {
        int temp, minIndex;

        for(int i=0; i < unsorted.length-1; i++) { //Improved version. if length-1, n-1 loop. Otherwise nth for will check, but will not enter due to n < n.
            System.out.println(i + " = "+Arrays.toString(unsorted));

            minIndex = i;

            for (int j=i+1; j < unsorted.length; j++) {
                System.out.println("    "+j + " = "+Arrays.toString(unsorted));
                if(unsorted[j] < unsorted[minIndex]) {
                    minIndex = j; //searching for lowest index
                }
            }

            if(unsorted[minIndex] < unsorted[i] ) { //Improved version. If it is already sorted, this section is skipped.
                temp = unsorted[i];
                unsorted[i] = unsorted[minIndex];
                unsorted[minIndex] = temp;
                System.out.println("    Swaps : "+Arrays.toString(unsorted));
            }
        }

        System.out.println("Sorted Array : "+ Arrays.toString(unsorted));
    }
}
