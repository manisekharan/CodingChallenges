package coding.algorithms.sort;


public class SelectionSort {

    public static void main(String a[]) {
        int unsorted[] = {2,31,1,5,1};
        int sorted[] = sort(unsorted);
        for(int s : sorted) {
            System.out.println(s+" ");
        }
    }

    private static int[] sort(int[] unsorted) {
        int temp, minValue, minIndex;
        for(int i=0; i < unsorted.length; i++) {
            minValue = unsorted[i];
            minIndex = i;

            for (int j=i+1; j < unsorted.length; j++) {
                if(unsorted[j] < minValue) {
                    minValue = unsorted[j];
                    minIndex = j;
                }
            }

            if(minValue < unsorted[i] ) {
                temp = unsorted[i];
                unsorted[i] = minValue;
                unsorted[minIndex] = temp;
            }
        }

        return unsorted;
    }

}
