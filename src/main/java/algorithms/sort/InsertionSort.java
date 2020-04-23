package algorithms.sort;

import java.util.*;

public class InsertionSort {

    public static void main(String args[]){
        InsertionSort insertionSort = new InsertionSort();
        int unsorted[] = {64, 34, 25, 1, 100,-1};
        insertionSort.sort(unsorted);
        System.out.println("Sorted array : "+ Arrays.toString(unsorted));

    }

    private void sort(int[] unsorted) {
        int length = unsorted.length;
        int temp;
        for(int i=0; i<length; i++){
            for(int j=0; j<length-1; j++){
                if(unsorted[j] > unsorted[j+1]) {
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSort_for(int[] array) {
        int temp = 0;
        int length = array.length;
        boolean swapped;
        System.out.println("Length : "+length);

        for(int i=0; i < length; i++){
            swapped = false;
            System.out.println(i + " = "+Arrays.toString(array));
            for(int j=0; j < length-1; j++){
                System.out.println("Comparing "+ array[j]+ " and " + array[j+1]);
                if(array[i] > array[j+1]) {
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

}
