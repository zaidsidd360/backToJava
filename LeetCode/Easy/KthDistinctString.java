/*
A distinct string is a string that is present only once in an array.
Given an array of strings arr, and an integer k, return the kth distinct 
string present in arr. If there are fewer than k distinct strings, 
return an empty string "". Note that the strings are considered in 
the order in which they appear in the array.
*/

package LeetCode.Easy;

import java.util.*;

public class KthDistinctString { // 2053
    public static String kthDistinct(String[] arr, int k) {
        if (arr.length < k)
            return "";
        int count = 0;
        // Used a LinkedHashMap since it maintains the order of insertion.
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 1)
                count++;
            if (count == k)
                return key;
        }
        return "";
    }

    public static void main(String[] args) {
        String arr[] = { "d", "b", "c", "b", "c", "a" };
        int k = 2;
        System.out.println(kthDistinct(arr, k));
    }
}
