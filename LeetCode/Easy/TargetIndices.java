// You are given a 0-indexed integer array nums and a target element target.
// A target index is an index i such that nums[i] == target.
// Return a list of the target indices of nums after sorting 
// nums in non-decreasing order. If there are no target indices, 
// return an empty list. The returned list must be sorted in increasing order.

package LeetCode.Easy;

import java.util.*;

public class TargetIndices { // 2089
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 5, 2, 3 };
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }
}
