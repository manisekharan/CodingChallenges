package crackingCodingInterview.arrays;

import java.util.*;

public class PairsOfSum {
    public static void main(String[] args) {
        int[] numbers = new int[]{10,20,30,40,50};
        int sum = 70;
        //findPairs(numbers, sum);
        findPairsHashMap(numbers, sum);
    }

    private static void findPairs(int[] numbers, int sum) {
        for(int i=0; i < numbers.length; i++){
            for (int j=i+1; j < numbers.length; j++){
                if(sum == numbers[i] + numbers[j]){
                    System.out.println("Pairs : "+numbers[i]+", "+numbers[j]);
                }
            }
        }
    }

    private static void findPairsHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println(nums[map.get(complement)] +", "+ nums[i] );
                //return;
            }
            map.put(nums[i], i);
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        //Java 8

        map.forEach((key, value) -> System.out.println(key + ":" + value));

        Set<Integer> entrySet = map.keySet();

        for (Integer key : map.keySet()) {
            System.out.println(key + ":"+ map.get(key));
        }
    }
}
