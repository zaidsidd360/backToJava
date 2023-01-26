// Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.

package LeetCode.Easy;

public class MissingNum { // 268
    public static int findSumUptoRange(int nums[]) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int findSumOfGivenArray(int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(findSumUptoRange(nums) - findSumOfGivenArray(nums));
    }
}
