// Given an array of integers nums sorted in non-decreasing order, 
// find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

package LeetCode.Medium;

import java.util.*;

// Note: Solution is NOT O(n*log(n)).
public class FirstAndLastPosition { // 34
    public static int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int e : nums) {
            list.add(e);
        }
        return new int[] { list.indexOf(target), list.lastIndexOf(target) };
    }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int ans[] = searchRange(nums, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
