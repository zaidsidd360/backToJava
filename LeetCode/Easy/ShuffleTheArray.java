/*
 * Given the array nums consisting of 2n elements in the 
 * form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * */

package LeetCode.Easy;

import java.util.Arrays;

public class ShuffleTheArray { // 1470
	public static int[] shuffle(int[] nums, int n) {
		int ans[] = new int[2 * n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			ans[count] = nums[i];
			ans[count + 1] = nums[i + n];
			count += 2;
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		int n = 4;
		System.out.println(Arrays.toString(shuffle(arr, n)));
	}

}
