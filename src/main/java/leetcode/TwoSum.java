package leetcode;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            System.out.println("i : "+i+" -> "+nums[i]);
            //System.out.println("i+1 : "+(i+1)+" -> "+nums[i+1]);
//(i+1 < nums.length-1) &&

                if( nums[i]+nums[nums.length-i]==target){
                    return new int[]{i,i+1};
                }

        }
        return new int[]{0,0};
    }

    public static void main(String args[]){
        //int nums[] = new int[]{2, 11, 7, 15};
        int nums[] = new int[]{3,2,3};
        int target = 6;

        int results[] = new TwoSum().twoSum(nums, target);
        System.out.println(results[0]+", "+results[1]);
    }
}