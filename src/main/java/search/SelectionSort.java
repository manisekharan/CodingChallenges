package search;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsorted = new int[] {4,2,6, 7,1};
        System.out.println("Unsorted Array : " );
        for (int i=0; i < unsorted.length; i++){
            System.out.print(unsorted[i] );
        }
        int[] sorted = sort(unsorted);
        System.out.println("\nSorted Array : " );
        for (int i=0; i <  sorted.length; i++){
            System.out.print( sorted[i] );
        }
    }

    public static int[] sort(int[] unsorted){
        int minValue, minIndex, temp =0 ;
        for(int i=0; i< unsorted.length; i++){
            minValue=unsorted[i];
            minIndex=i;
            for(int j=i+1; j< unsorted.length; j++){
                if( unsorted[j] < minValue){
                    minValue = unsorted[j];
                    minIndex=j;
                }

            }

            if(minValue < unsorted[i]) {
                temp = unsorted[i];
                unsorted[i] = unsorted[minIndex];

                unsorted[minIndex] = temp;
            }
        }
        return unsorted;
    }
}

