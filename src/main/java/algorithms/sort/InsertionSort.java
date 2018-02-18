package coding.algorithms.sort;

public class InsertionSort {

    public static void main(String args[]){
        InsertionSort insertionSort = new InsertionSort();
        int unsorted[] = {64, 34, 25, 1, 100};
        int sorted[] = insertionSort.sort(unsorted);
        System.out.println("Sorted array");
        insertionSort.printArray(sorted);

    }

    private int[] sort(int[] unsorted) {
        int length = unsorted.length;
        int key, temp, j;
        for(int i=1; i<length; i++){
            key = unsorted[i];
            j = i - 1;
            while(j>=0 && key < unsorted[j]){
                temp = unsorted[j];
                unsorted[j] = unsorted[j+1];
                unsorted[j+1] = temp;
                j--;
            }
        }
        return unsorted;
    }

    private void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
