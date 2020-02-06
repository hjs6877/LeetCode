package com.leetcode.easy;

public class ReverseInteger {
    public static void main(String[] args){
        int num = 4423445;
        int result = reverse(num);

        System.out.println(result);
    }

    //
    public static int reverse(int x) {
        String numAsString = String.valueOf(Math.abs(Long.valueOf(x)));
        String[] nums = numAsString.split("");
        String[] rNums = new String[numAsString.length()];
        for(int i= 0; i < nums.length; i++){

            rNums[(nums.length - i) - 1] = nums[i];
        }

        long result = Long.parseLong(String.join("", rNums));

        if(x < 0)
            result = -result;
        if(result < Math.round(Math.pow(-2, 31)) || result > Math.round(Math.pow(2, 31)) - 1)
            result = 0;

        return (int)result;
    }
}
