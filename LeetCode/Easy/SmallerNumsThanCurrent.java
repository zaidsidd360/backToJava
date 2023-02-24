// Given the array nums, for each nums[i] find out how many
// numbers in the array are smaller than it. That is, for each
// nums[i] you have to count the number of valid j's such that j != i and
// nums[j] < nums[i]. Return the answer in an array.


package LeetCode.Easy;

public class SmallerNumsThanCurrent { // 1365
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i])
                    sum++;
            }
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {8, 1, 2, 6, 4};
        int ans[] = smallerNumbersThanCurrent(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
