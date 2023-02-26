package LeetCode.Easy;

import java.util.*;

public class UniqueOccurances {
	public static boolean hasUniqueOccurances(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int e : arr) {
			map.put(e, map.getOrDefault(e, 0) + 1);
		}
		Set<Integer> set = new HashSet<>();
		for (int v : map.values()) {
			if (set.contains(v))
				return false;
			set.add(v);
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
		System.out.println(hasUniqueOccurances(arr));
	}

}
