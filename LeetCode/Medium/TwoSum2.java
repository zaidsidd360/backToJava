/*
Given a 1-indexed array of integers numbers that is already sorted 
in non-decreasing order, find two numbers such that they add up to 
a specific target number. Let these two numbers be numbers[index1] 
and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one 
as an integer array [index1, index2] of length 2. The tests are generated
 such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.
*/

package LeetCode.Medium;

public class TwoSum2 { // 167
    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            if (numbers[low] + numbers[high] == target)
                return new int[] { low + 1, high + 1 };
            if (numbers[low] + numbers[high] > target)
                high--;
            else
                low++;
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        int ans[] = twoSum(nums, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
