package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int num1 = target - nums[i];
            if(numsMap.containsKey(num1)){
                result[0] = numsMap.get(num1);
                result[1] = i;
            }

            numsMap.put(nums[i], i);
        }

        return result;
    }

}
