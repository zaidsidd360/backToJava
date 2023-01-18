// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first n elements.
// Return n after placing the final result in the first n slots of nums.
// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

package LeetCode;

public class RemoveElement {
    public static int removeElement(int nums[], int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 200; // Could be any value(>100);
                               // Chose 200 since the constraints given were `0 <= arr[i] <= 100`.
            }
        }

        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[k] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                }
            }
        }

        for (int l = 0; l < nums.length; l++) {
            if (nums[l] != 200)
                n += 1;
        }

        return n;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 4, 5, 5, };
        int valueToRemove = 5;
        removeElement(arr, valueToRemove);
    }
}