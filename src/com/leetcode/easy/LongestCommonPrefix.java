package com.leetcode.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix(strs);

        System.out.println(result);
    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null)
            return "";

        if(strs.length == 1)
            return strs[0];

        int i = 0;
        while(true) {
            boolean flag = true;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) != strs[j-1].charAt(i))
                    flag = false;
            }

            if(flag)
                i++;
            else
                break;
        }

        return strs[0].substring(0, i);
    }

}
