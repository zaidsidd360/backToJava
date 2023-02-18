/*
Given an array nums of n integers where nums[i] is in the range [1, n], 
return an array of all the integers in the range [1, n] that do not appear in nums.
*/

package LeetCode.Easy;

import java.util.*;

public class FindAllDisappeared { // 448
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int e : nums) {
            set.add(e);
        }
        int i = 1;
        while (i <= nums.length) {
            if (!set.contains(i))
                list.add(i);
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(nums));
    }
}
