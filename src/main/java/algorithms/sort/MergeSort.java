package algorithms.sort;

import java.util.*;

/*

Complexity Analysis of Merge Sort
Merge Sort is quite fast, and has a time complexity of O(n*log n). It is also a stable sort, which means the "equal" elements are ordered in the same order in the sorted list.

In this section we will understand why the running time for merge sort is O(n*log n).

As we have already learned in Binary Search that whenever we divide a number into half in every stpe, it can be represented using a logarithmic function, which is log n and the number of steps can be represented by log n + 1(at most)

Also, we perform a single step operation to find out the middle of any subarray, i.e. O(1).

And to merge the subarrays, made by dividing the original array of n elements, a running time of O(n) will be required.

Hence the total time for mergeSort function will become n(log n + 1), which gives us a time complexity of O(n*log n).

Space Complexity: O(n)

Time complexity of Merge Sort is O(n*Log n) in all the 3 cases (worst, average and best) as merge sort always divides the array in two halves and takes linear time to merge two halves.
It requires equal amount of additional space as the unsorted array. Hence its not at all recommended for searching large unsorted arrays.
It is the best Sorting technique used for sorting Linked Lists.

Time Complexity
Best: O(n*log n)
Average: O(n*log n)
Worst: O(n*log n)

Space Complexity
O(n)
O(1) auxiliary with linked lists

*/

class MergeSort {
    // Merges two subarrays of arr[].
    // First subarray is arr[lowerIndex..middle]
    // Second subarray is arr[middle+1..higerIndex]
    void merge(int arr[], int lowerIndex, int middle, int higerIndex) {
        System.out.println("merge : lowerIndex = "+lowerIndex+", middle = "+middle+", higerIndex = "+higerIndex);
        // Find sizes of two subarrays to be merged
        int n1 = middle - lowerIndex + 1;
        int n2 = higerIndex - middle;

        System.out.println(" n1 = "+n1);
        System.out.println(" n2 = "+n2);

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) {
            L[i] = arr[lowerIndex + i];
        }

        for (int j=0; j<n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        System.out.println(" L array = "+Arrays.toString(L));
        System.out.println(" R array = "+Arrays.toString(R));

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = lowerIndex;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    // Main function that sorts arr[lowerIndex..r] using
    // merge()
    void sort(int arr[], int lowerIndex, int higherIndex, String flag)
    {
        if (lowerIndex < higherIndex)
        {
            // Find the middle point
            int middleIndex = (lowerIndex+higherIndex)/2;

            System.out.println("sort ("+flag+") is called : lowerIndex = "+lowerIndex+", middleIndex = "+middleIndex+", higherIndex = "+higherIndex);

            // Sort first and second halves
            sort(arr, lowerIndex, middleIndex, "FirstHalf");
            sort(arr , middleIndex+1, higherIndex, "SecondHalf");

            // Merge the sorted halves
            //merge(arr, lowerIndex, middleIndex, higherIndex);
            merge2(arr, lowerIndex, middleIndex, higherIndex);
        }
    }


    void merge2(int a[], int p, int q, int r)
    {
        int b[] = new int[a.length];   //same size of a[]
        int i, j, k;
        k = 0;
        i = p;
        j = q + 1;
        while(i <= q && j <= r)
        {
            if(a[i] < a[j])
            {
                b[k++] = a[i++];    // same as b[k]=a[i]; k++; i++;
            }
            else
            {
                b[k++] = a[j++];
            }
        }

        while(i <= q)
        {
            b[k++] = a[i++];
        }

        while(j <= r)
        {
            b[k++] = a[j++];
        }

        for(i=r; i >= p; i--)
        {
            a[i] = b[--k];  // copying back the sorted list to a[]
        }
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {5,4,3,2,1,0,-1,1};

        System.out.println("Given Array : "+ Arrays.toString(arr)+ ", Length : "+arr.length);

        new MergeSort().sort(arr, 0, arr.length-1, "Initial");

        System.out.println("\nSorted array" + Arrays.toString(arr));
    }
}