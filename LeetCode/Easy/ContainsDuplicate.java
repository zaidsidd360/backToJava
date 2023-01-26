// Given an integer array nums, return true if any value appears
// at least twice in the array, and return false if every element is distinct.

package LeetCode.Easy;

import java.util.HashSet;

public class ContainsDuplicate { // 217
    public static boolean containsDuplicate(int nums[]) {
        if (nums == null || nums.length == 0)
            return false;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(containsDuplicate(nums));
    }
}
