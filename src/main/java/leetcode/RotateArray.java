package leetcode;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

*/

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int lastValue = 0;


        System.out.println("length : "+length);
        System.out.println("length-1 : "+ (length-1));

        for (int i = 0; i < k; i++) {
            lastValue = nums[(length - 1)];
            for (int j = length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = lastValue;
        }


        for (int i = 0; i < length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new RotateArray().rotate(nums, k);
    }
}
