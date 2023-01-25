// Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
// Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

package LeetCode;

import java.util.HashMap;

public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int e : nums1) {
            map.put(e, false);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                return nums2[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3 };
        int nums2[] = { 2, 4 };
        System.out.println(getCommon(nums1, nums2));
    }
}
