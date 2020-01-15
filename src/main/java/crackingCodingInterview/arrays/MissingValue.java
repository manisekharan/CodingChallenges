package crackingCodingInterview.arrays;

import java.util.*;

public class MissingValue {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4, 5};
        int total = 5;
        System.out.println("Missing number : " + new MissingValue().findMissingValue(nums, total));
        new MissingValue().printMissingNumber(nums, total);
        System.out.println("Missing number (XOR) : " + new MissingValue().findMissingValueXOR(nums, total));
    }

    private int findMissingValue(int[] nums, int total) {
        int expectedSum = (total * (total + 1)) / 2;
        int actualSum = 0;
        System.out.println("ExpectedSum : " + expectedSum);
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        System.out.println("ActualSum : " + actualSum);

        return expectedSum - actualSum;
    }

    private int findMissingValueXOR(int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        /* For xor of all the elements
           in array */
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        /* For xor of all the elements
           from 1 to n+1 */
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }

    /**
     * A general method to find missing values from an integer array in Java. * This method will work even if array has more than one missing element.
     */
    private void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

}
