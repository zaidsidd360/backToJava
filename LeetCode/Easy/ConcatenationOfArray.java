/*
Given an integer array nums of length n, you want to create 
an array ans of length 2n where ans[i] == nums[i] and 
ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
*/

package LeetCode.Easy;

public class ConcatenationOfArray { // 1929
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n * 2];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            ans[cnt] = nums[i];
            ans[cnt + n] = nums[i];
            cnt++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        int ans[] = getConcatenation(nums);
        for (int i : ans) {
            System.out.print(i + "");
        }
    }
}
