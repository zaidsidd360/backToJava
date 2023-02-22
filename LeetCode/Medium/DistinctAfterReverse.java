/*
You are given an array nums consisting of positive integers.
You have to take each integer in the array, reverse its digits, 
and add it to the end of the array. You should apply this operation 
to the original integers in nums. Return the number of distinct 
integers in the final array.
*/

package LeetCode.Medium;

import java.util.*;

public class DistinctAfterReverse { // 2442
    public static int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            set.add(n);
            int rev = 0;
            while (n != 0) {
                rev = rev * 10 + (n % 10);
                n /= 10;
            }
            set.add(rev);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 13, 10, 12, 31 };
        System.out.println(countDistinctIntegers(nums));
    }
}
