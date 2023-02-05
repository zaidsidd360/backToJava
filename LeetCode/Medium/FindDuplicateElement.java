// Given an array of integers nums containing n + 1 
// integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums 
// and uses only constant extra space.

package LeetCode.Medium;

import java.util.*;

public class FindDuplicateElement { // 287
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n))
                return n;
            set.add(n);
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 3 };
        System.out.println(findDuplicate(nums));
    }
}
