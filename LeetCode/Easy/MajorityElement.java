// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.

package LeetCode.Easy;

import java.util.HashMap;

public class MajorityElement { // 169
    public static int findMajorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > nums.length / 2)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(findMajorityElement(nums));
    }
}