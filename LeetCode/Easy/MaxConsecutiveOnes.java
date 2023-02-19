/*
Given a binary array nums, return the maximum number of 
consecutive 1's in the array.
*/

package LeetCode.Easy;

public class MaxConsecutiveOnes { // 485
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                curr++;
            else
                curr = 0;
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
