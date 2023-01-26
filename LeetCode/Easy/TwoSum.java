// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, 
// and you may not use the same element twice.
// You can return the answer in any order.

package LeetCode.Easy;

import java.util.HashMap;

public class TwoSum { // 01
    public static int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer complementIndex = map.get(arr[i]);
            if (complementIndex != null) {
                return new int[] { i, complementIndex };
            }
            map.put(target - arr[i], i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int retArr[] = twoSum(arr, 9);
        for (int i = 0; i < retArr.length; i++) {
            System.out.print(retArr[i] + "  ");
        }
    }
}