/*
Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.
*/

package LeetCode.Easy;

import java.util.*;

public class SquaresOfASortedArray { // 977
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };
        int ans[] = sortedSquares(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
