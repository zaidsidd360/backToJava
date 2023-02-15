// Given a sorted array of distinct integers and a target value, 
// return the index if the target is found. If not, return the 
// index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

package LeetCode.Easy;

public class SearchInsertPosition { // 35
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        boolean hasFound = false;
        while (low < high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                hasFound = true;
                return mid;
            } else if (nums[mid] > target)
                high = mid;
            else
                low = mid + 1;
        }
        int ans = 0;
        if (!hasFound) {
            for (int i = 0; i < nums.length; i++) {
                if (target > nums[i])
                    ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
