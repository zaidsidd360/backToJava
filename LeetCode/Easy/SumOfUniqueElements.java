// You are given an integer array nums. The unique 
// elements of an array are the elements that appear 
// exactly once in the array.
// Return the sum of all the unique elements of nums.

package LeetCode.Easy;

import java.util.*;

public class SumOfUniqueElements { // 1748
    public static int sumOfUnique(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int val : nums) {
            if (map.containsKey(val))
                map.put(val, map.get(val) + 1);
            else
                map.put(val, 1);
        }
        for (int k : map.keySet()) {
            if (map.get(k) == 1)
                sum += k;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 2 };
        System.out.println(sumOfUnique(nums));
    }
}
