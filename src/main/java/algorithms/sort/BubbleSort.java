package coding.algorithms.sort;

public class BubbleSort {
    public static void main(String args[]){
        BubbleSort bubbleSort = new BubbleSort();
        int unsorted[] = {64, 34, 25, 1};
        int sorted[] = bubbleSort.sort(unsorted);
        System.out.println("Sorted array");
        bubbleSort.printArray(sorted);

        recursiveSort(unsorted, unsorted.length);
        System.out.println("Sorted array (Using recursive)");
        bubbleSort.printArray(unsorted);
        }

    private int[] sort(int[] arr) {
        int length = arr.length;
        int innerLoop = 0;
        int outerLoop = 0;
        for(int i=0; i < length-1; i++){
            outerLoop++;
            for(int j=0; j < length-i-1; j++){
                innerLoop++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println("Outer loop count : "+outerLoop);
        System.out.println("Inner loop count : "+innerLoop);
        return arr;
    }

    private static void recursiveSort(int[] unsorted, int length) {
        if(length == 1){
            return;
        }
        for(int i=0; i<length-1; i++){
            if(unsorted[i] > unsorted[i+1]){
                int temp = unsorted[i];
                unsorted[i] = unsorted[i+1];
                unsorted[i+1] = temp;
            }
        }
        recursiveSort(unsorted, length-1);

    }

    private void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
