package LeetCode.Easy;

public class RunningSum { // 1480
    public static int[] runningSum(int[] nums) { // Memory efficient.
        int i = nums.length - 1;
        while (i >= 0) {
            int sum = 0;
            int j = 0;
            while (j <= i) {
                sum += nums[j];
                j++;
            }
            nums[i] = sum;
            i--;
        }
        return nums;
    }

    public static int[] runningSum2(int[] nums) { // Time efficient.
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 10, 1 };
        int ans[] = runningSum(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
