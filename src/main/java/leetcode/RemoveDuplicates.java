package leetcode;

/*
Algorithm

Since the array is already sorted, we can keep two pointers i and j, where i is the slow-runner while j is the fast-runner.
As long as nums[i] = nums[j], we increment j to skip the duplicate.

When we encounter nums[j] != nums[i], the duplicate run has ended so we must copy its value to nums[i + 1].
i is then incremented and we repeat the same process again until jjreaches the end of array.

 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        for(int k=0; k<=i; k++){
            System.out.print(nums[k]);
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,2,3,3,4};
        System.out.println("Length : "+nums.length);
        int count = new RemoveDuplicates().removeDuplicates(nums);
        System.out.println("Unique count : "+count);

    }
}
/*
    Complexity analysis

    Time complextiy : O(n). Assume that nn is the length of array. Each of ii and jj traverses at most nn steps.
    Space complexity : O(1).
*/