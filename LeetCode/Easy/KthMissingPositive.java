/*
 * Given an array arr of positive integers sorted in a 
 * strictly increasing order, and an integer k.
 * Return the kth positive integer that is missing from this array.
 * */

package LeetCode.Easy;

import java.util.*;

public class KthMissingPositive { // 1539
	public static int findKthPositive(int[] arr, int k) {
		List<Integer> list = new ArrayList<>();
		int i = 1;
		while (i <= arr[arr.length - 1] + k) {
			list.add(i++);
		}
		for (int e : arr) {
			if (list.contains(e))
				list.remove((Integer) e);
		}
		return list.get(k - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 7, 11 };
		int k = 5;
		System.out.println(findKthPositive(arr, k));
	}
}
