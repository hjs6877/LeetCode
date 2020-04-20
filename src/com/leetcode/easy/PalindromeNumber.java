package com.leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1331;
        boolean result = reverse(x);
        System.out.println(result);
    }

    private static boolean reverse(int x) {
        int originalX = x;
        if(x < 0)
            return false;

        int reverse = 0;
        while(x != 0){
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        if(originalX == reverse)
            return true;

        return false;
    }
}
