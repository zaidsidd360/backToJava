/*
You are given a 0-indexed integer array nums of even length 
consisting of an equal number of positive and negative integers.
You should rearrange the elements of nums such that the modified 
array follows the given conditions:

* Every consecutive pair of integers have opposite signs.
* For all integers with the same sign, the order in which 
  they were present in nums is preserved.
* The rearranged array begins with a positive integer.

Return the modified array after rearranging the elements 
to satisfy the aforementioned conditions.
*/

package LeetCode.Medium;

public class RearrangeElementsBySign { // 2149
    public static int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        int po = 0, ne = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res[po] = nums[i];
                po += 2;
            } else {
                res[ne] = nums[i];
                ne += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, -2, -5, 2, -4 };
        int ans[] = rearrangeArray(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
