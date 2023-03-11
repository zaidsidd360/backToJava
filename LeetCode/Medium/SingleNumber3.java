/*
 * Given an integer array nums, in which exactly two elements 
 * appear only once and all the other elements appear exactly twice. 
 * Find the two elements that appear only once. You can return 
 * the answer in any order.
 * You must write an algorithm that runs in linear runtime 
 * complexity and uses only constant extra space.*/

package LeetCode.Medium;

import java.util.*;

public class SingleNumber3 { // 260
	public static int[] singleNumber(int[] nums) { // HashMap implementation; LC runtime 7ms
		Map<Integer, Integer> map = new HashMap<>();
		for (int e : nums)
			map.put(e, map.getOrDefault(e, 0) + 1);
		int ans[] = new int[2];
		int i = 0;
		for (int k : map.keySet())
			if (map.get(k) == 1)
				ans[i++] = k;
		return ans;
	}

	public static int[] singleNumber2(int[] nums) { // HashSet implementation; LC runtime 4ms
		Set<Integer> set = new HashSet<>();
		for (int e : nums) {
			if (set.contains(e))
				set.remove(e);
			else
				set.add(e);
		}
		int ans[] = new int[set.size()];
		int i = 0;
		for (int e : set)
			ans[i++] = e;
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1, 3, 2, 5 };
		int ans[] = singleNumber2(nums);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
