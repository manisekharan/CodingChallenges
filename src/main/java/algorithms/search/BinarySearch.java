package algorithms.search;

public class BinarySearch {
    public static void main(String a[]) {
        int[] sorted = {1,2,3,4,5,6};
        int target = 4;
        int found = binarySearch(sorted, target);
        System.out.println("Regular : "+found);
        found = binarySearchRecursion(sorted, target, sorted.length-1, 0);
        System.out.println("Recursive : "+found);
    }

    static int binarySearch(int[] sorted, int target) {
        int arrayLength = sorted.length;
        if(arrayLength==0) {
            return -1;
        }
        int high = arrayLength-1;
        int low = 0;
        while(low <= high) {
            int mid = (high+low)/2;
            if(target == sorted[mid])
                return mid;
            if(target > sorted[mid]) {
                low = mid+1;
            }else if(target < sorted[high]) {
                high = mid-1;
            }
        }
        return -1;
    }

    static int binarySearchRecursion(int[] sorted, int target, int high, int low) {

        if(low > high) {
            return -1;
        }

        int mid = (low + high)/2;
        if(target ==  sorted[mid]) {
            return mid;
        }else if(target > sorted[mid]) {
            return binarySearchRecursion(sorted, target, high, mid+1);
        }else {
            return binarySearchRecursion(sorted, target, mid-1, low);
        }
    }
}
