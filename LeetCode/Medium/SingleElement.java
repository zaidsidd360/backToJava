/*
You are given a sorted array consisting of only integers 
where every element appears exactly twice, except for one 
element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.
*/

package LeetCode.Medium;

import java.util.*;

public class SingleElement {
    public static int singleNonDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int e : nums) {
            if (map.containsKey(e))
                map.put(e, false);
            else
                map.put(e, true);
        }
        for (int k : map.keySet()) {
            if (map.get(k))
                return k;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(nums));
    }
}