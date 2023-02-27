/*
 * Given an unsorted array of integers nums, return the length 
 * of the longest continuous increasing subsequence (i.e. subarray). 
 * The subsequence must be strictly increasing. A continuous increasing 
 * subsequence is defined by two indices l and r (l < r) such that 
 * it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and 
 * for each l <= i < r, nums[i] < nums[i + 1].
 * */

package LeetCode.Easy;

public class LongestIncreasingSubarray { // 674
	public static int findLengthOfLCIS(int[] nums) {
		int curr = 1;
		int max = 1;
		for (int i = 1; i < nums.length; i++) {
			curr = (nums[i] > nums[i - 1]) ? curr + 1 : 1;
			max = Math.max(max, curr);
		}
		return max;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 4, 7 };
		System.out.println(findLengthOfLCIS(nums));
	}

}
