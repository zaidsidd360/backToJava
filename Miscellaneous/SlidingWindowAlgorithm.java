/*
Find the maximum sum of a contiguous subarray of size k.
*/
package Miscellaneous;

public class SlidingWindowAlgorithm {
	public static int findMaxSum(int arr[], int k) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			if (i >= k - 1) {
				maxSum = Math.max(currSum, maxSum);
				currSum -= arr[i - (k - 1)];
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 7, 9, 2, 1, 8, 13, 2, 21, 12, 4, 2, 1 };
		int k = 3;
		System.out.println(findMaxSum(arr, k));
	}

}
