// Given an integer array nums sorted in non-decreasing order, 
// remove the duplicates in-place such that each unique element 
// appears only once. The relative order of the elements should be kept the same.
// Since it is impossible to change the length of the array in some languages, 
// you must instead have the result be placed in the first part of the array nums. 
// More formally, if there are k elements after removing the duplicates, 
// then the first k elements of nums should hold the final result. 
// It does not matter what you leave beyond the first k elements.
// Return k after placing the final result in the first k slots of nums.
// Do not allocate extra space for another array. 
// You must do this by modifying the input array in-place with O(1) extra memory.

package LeetCode.Easy;

import java.util.HashMap;

public class RemoveDuplicates { // 26
    public static int removeDuplicates(int nums[]) { // Naive implementation; LC runtime 591ms
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                nums[i] = 100;
            } else
                map.put(nums[i], true);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return map.size();
    }

    public static int removeDuplicates2(int nums[]) { // Optimized implementation; LC runtime 2ms
        int addAt = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[addAt] = nums[i + 1];
                addAt++;
            }
        }
        return addAt;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates2(nums));
    }
}
