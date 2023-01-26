// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function, but instead 
// be stored inside the array nums1. To accommodate this, nums1 has a length 
// of m + n, where the first m elements denote the elements that should be merged, 
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

package LeetCode.Easy;

public class MergeSortedArray { // 88
    public static void mergeAndSort(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        for (int k = 0; k < nums1.length; k++) {
            for (int l = k + 1; l < nums1.length; l++) {
                if (nums1[k] > nums1[l]) {
                    int temp = nums1[k];
                    nums1[k] = nums1[l];
                    nums1[l] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 4, 5, 6 };
        int m = 3;
        int n = 3;
        mergeAndSort(nums1, m, nums2, n);
    }
}
