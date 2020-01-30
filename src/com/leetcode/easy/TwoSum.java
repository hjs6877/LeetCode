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
        Map<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[2];
        for (int i = 0; i< nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                ret[0] = map.get(target-nums[i]);
                ret[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ret;
    }

}
