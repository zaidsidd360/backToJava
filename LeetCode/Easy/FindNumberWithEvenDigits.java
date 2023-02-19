/*
Given an array nums of integers, return how many of them 
contain an even number of digits.
*/

package LeetCode.Easy;

public class FindNumberWithEvenDigits { // 1295
    public static int findNumbers(int[] nums) {
        int evenDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            int currDigits = findDigits(nums[i]);
            evenDigits += currDigits % 2 == 0 ? 1 : 0;
        }
        return evenDigits;
    }

    private static int findDigits(int n) {
        int digits = 0;
        while (n != 0) {
            digits++;
            n /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }
}
