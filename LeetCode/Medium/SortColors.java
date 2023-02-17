/*
Given an array nums with n objects colored red, white, or blue, 
sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue. We will use the 
integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
*/

package LeetCode.Medium;

public class SortColors { // 75
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
