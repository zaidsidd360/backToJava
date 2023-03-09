/*
 * Given a 0-indexed integer array nums, find a 0-indexed 
 * integer array answer where:
 * * answer.length == nums.length.
 * * answer[i] = |leftSum[i] - rightSum[i]|.
 * Where:
 * * leftSum[i] is the sum of elements to the left of the 
 * index i in the array nums. If there is no such element, leftSum[i] = 0.
 * * rightSum[i] is the sum of elements to the right of 
 * the index i in the array nums. If there is no such element, rightSum[i] = 0.
 * Return the array answer.
 * */

package LeetCode.Easy;

import java.util.Arrays;

public class LeftRightSumDIfference { // 2574
	public static int[] leftRigthDifference(int[] nums) { // Naive implementation; LC runtime: 14ms
		int ans[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = Math.abs(findLeftSum(i, nums) - findRightSum(i, nums));
		}
		return ans;
	}

	public static int findLeftSum(int i, int[] nums) {
		int sum = 0;
		for (int j = i; j >= 0; j--) {
			sum += nums[j];
		}
		return sum;
	}

	public static int findRightSum(int i, int[] nums) {
		int sum = 0;
		for (int j = i; j < nums.length; j++) {
			sum += nums[j];
		}
		return sum;
	}

	public static int[] leftRigthDifference2(int[] nums) { // Optimized implementation; LC runtime: 3ms
		int ans[] = new int[nums.length];
		int rightSum = Arrays.stream(nums).sum();
		int leftSum = 0;
		for (int i = 0; i < nums.length; i++) {
			rightSum -= nums[i];
			ans[i] = Math.abs(leftSum - rightSum);
			leftSum += nums[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 10, 4, 8, 3 };
		int ans[] = leftRigthDifference2(nums);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
