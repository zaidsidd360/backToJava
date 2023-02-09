// Given an integer array nums, find the 
// subarray with the largest sum, and return its sum.

package LeetCode.Medium;

public class MaximumSubarray { // 53
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            max = Math.max(max, currSum);
            if (currSum < 0)
                currSum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
    }
}
