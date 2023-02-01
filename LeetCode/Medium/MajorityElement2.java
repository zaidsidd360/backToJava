// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

package LeetCode.Medium;

import java.util.*;

public class MajorityElement2 { // 229
    public static List<Integer> findMajorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else
                map.put(num, 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Integer k : map.keySet()) {
            if (map.get(k) > nums.length / 3)
                list.add(k);
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(findMajorityElement2(nums));
    }
}
