// Given a non-empty array of integers nums, every element 
// appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime 
// complexity and use only constant extra space.

package LeetCode.Easy;

import java.util.*;

public class SingleNumber { // 136
    public static int singleNumber(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n))
                map.put(n, false);
            else
                map.put(n, true);
        }
        for (int k : map.keySet()) {
            if (map.get(k))
                return k;
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }
}
