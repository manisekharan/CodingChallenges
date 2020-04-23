package algorithms.sort;
/*
Time Complexity
Best: ?(n^2)
Average: ?(n^2)
Worst: O(n^2)

Space Complexity
O(1)
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
