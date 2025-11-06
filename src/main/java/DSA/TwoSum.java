package DSA;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> Sum = new HashMap<>();
            int[] returnArr = new int[2];
            for(int i = 0;i < nums.length;i++){
                if(Sum.containsKey(target-nums[i])){
                    returnArr[0]=Sum.get(target-nums[i]);
                    returnArr[1] = i;
                    return returnArr;
                }
                Sum.put(nums[i],i);
            }
            return returnArr;
    }
}
