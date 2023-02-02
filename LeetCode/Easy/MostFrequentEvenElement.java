// Given an integer array nums, return the most frequent even element.
// If there is a tie, return the smallest one. If there is no such element, return -1.

package LeetCode.Easy;

import java.util.*;

public class MostFrequentEvenElement { // 2404
    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                if (map.containsKey(num))
                    map.put(num, map.get(num) + 1);
                else
                    map.put(num, 1);
            }
        }
        int max = -1;
        int freq = 0;
        for (Integer k : map.keySet()) {
            if (map.get(k) > freq) {
                freq = map.get(k);
                max = k;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 4, 4, 1 };
        System.out.println(mostFrequentEven(nums));
    }
}
