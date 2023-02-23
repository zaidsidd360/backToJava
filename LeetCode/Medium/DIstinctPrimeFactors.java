/*
Given an array of positive integers nums, return the 
number of *distinct* prime factors in the product of the elements of nums.

Note that:
A number greater than 1 is called prime if it is divisible by only 1 and itself.
An integer val1 is a factor of another integer val2 if val2 / val1 is an integer.
*/

package LeetCode.Medium;

import java.util.*;

public class DIstinctPrimeFactors { // 2521
    public static int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int e : nums) {
            for (int i = 2; i <= e; ++i) {
                if (e % i == 0 && isPrime(i))
                    set.add(i);
            }
        }
        return set.size();
    }

    private static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag ? true : false;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 3, 7, 10, 6 };
        System.out.println(distinctPrimeFactors(nums));
    }
}
