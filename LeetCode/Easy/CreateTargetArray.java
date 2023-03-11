/*
 * Given two arrays of integers nums and index. Your task is to 
 * create target array under the following rules:
 *   * Initially target array is empty.
 *   * From left to right read nums[i] and index[i], insert at 
 *     index index[i] the value nums[i] in target array.
 *   * Repeat the previous step until there are no elements 
 *     to read in nums and index.
 *     
 * Return the target array.
 * It is guaranteed that the insertion operations will be valid.*/

package LeetCode.Easy;

import java.util.*;

public class CreateTargetArray { // 1389
	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < index.length; i++) {
			list.add(index[i], nums[i]);
		}
		int[] ans = new int[list.size()];
		int i = 0;
		for (int e : list) {
			ans[i] = e;
			i++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 0, 1, 2, 3, 4 };
		int index[] = { 0, 1, 2, 2, 1 };
		int ans[] = createTargetArray(nums, index);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
