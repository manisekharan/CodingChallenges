package algorithms.sort;

import java.util.*;

/*

Complexity Analysis of Bubble Sort

In Bubble Sort, n-1 comparisons will be done in the 1st pass, n-2 in 2nd pass, n-3 in 3rd pass and so on. So the total number of comparisons will be,


(n-1) + (n-2) + (n-3) + ..... + 3 + 2 + 1
Sum = n(n-1)/2
i.e O(n2)


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

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 4,0,2,-1};
        System.out.println("Giving unsorted Array : "+ Arrays.toString(array));
        bubbleSort_for(array);
        //bubbleSort_while(array);
        //bubbleSort_rec(array, array.length);
    }

    private static void bubbleSort_for(int[] array) {
        int temp = 0;
        int length = array.length;
        boolean swapped;
        System.out.println("Length : "+length);

        for(int i=0; i < length - 1; i++){
            swapped = false;
            System.out.println(i + " = "+Arrays.toString(array));
            for(int j=0; j < length-i-1; j++){
                System.out.println("Comparing "+ array[j]+ " and " + array[j+1]);
                if(array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    swapped = true;
                    System.out.println("Swapping Elements: New Array After Swap");
                    System.out.println("      "+j + " = "+Arrays.toString(array));
                }

            }
            if(swapped == false){
                break;
            }
        }

        System.out.println("Bubble sort : "+Arrays.toString(array));
        //Arrays.stream(array).forEach(System.out::println);
    }

    private static void bubbleSort_while(int[] array) {
        int temp = 0;
        int length = array.length;
        boolean swapped = true;
        System.out.println("Length : "+length);

        while(swapped){
            swapped = false;
            for(int j=0; j < length-1; j++){
                System.out.println("Comparing "+ array[j]+ " and " + array[j+1]);
                if(array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    swapped = true;
                    System.out.println("Swapping Elements: New Array After Swap");
                    System.out.println("      "+j + " = "+Arrays.toString(array));
                }
            }
        }

        System.out.println("Bubble sort : "+Arrays.toString(array));
        //Arrays.stream(array).forEach(System.out::println);
    }

    private static void bubbleSort_rec(int array[], int n)
    {
        // Base case
        if (n == 1){
            System.out.println("Sorted Array : "+Arrays.toString(array));
            return;
        }

        for (int i=0; i<n-1; i++)
            if (array[i] > array[i+1])
            {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }

        bubbleSort_rec(array, n-1);
    }
}
