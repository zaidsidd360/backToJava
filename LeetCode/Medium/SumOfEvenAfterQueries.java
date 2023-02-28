/*
 * You are given an integer array nums and an array queries where queries[i] = [vali, indexi]. 
 * For each query i, first, apply nums[indexi] = nums[indexi] + vali, 
 * then print the sum of the even values of nums. 
 * Return an integer array answer where answer[i] 
 * is the answer to the ith query. 
 * */

package LeetCode.Medium;

public class SumOfEvenAfterQueries { // 985
	public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
		int sum = 0;
		for (int e : nums)
			if (e % 2 == 0)
				sum += e;
		int ans[] = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int index = queries[i][1], val = queries[i][0];
			if (nums[index] % 2 == 0)
				sum -= nums[index];
			nums[index] += val;
			if (nums[index] % 2 == 0)
				sum += nums[index];
			ans[i] = sum;
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		int queries[][] = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
		int ans[] = sumEvenAfterQueries(nums, queries);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
