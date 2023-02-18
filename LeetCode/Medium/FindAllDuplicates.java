/*
Given an integer array nums of length n where all the integers of 
nums are in the range [1, n] and each integer appears once or twice, 
return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.
*/

package LeetCode.Medium;

import java.util.*;

public class FindAllDuplicates { // 442
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int e : nums) {
            if (set.contains(e))
                list.add(e);
            set.add(e);
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(nums));
    }
}
