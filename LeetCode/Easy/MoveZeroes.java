// Given an integer array nums, move all 0's to the end 
// of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

package LeetCode.Easy;

import java.util.ArrayList;

public class MoveZeroes { // 283
    public static void moveZeroes(int nums[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                list.add(nums[i]);
            else
                zeroCount++;
        }
        for (int j = 0; j < zeroCount; j++) {
            list.add(0);
        }
        for (int k = 0; k < nums.length; k++) {
            nums[k] = list.get(k);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
