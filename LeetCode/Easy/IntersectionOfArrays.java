// Given two integer arrays nums1 and nums2, return an array of 
// their intersection. Each element in the result must be unique 
// and you may return the result in any order.

package LeetCode.Easy;

import java.util.*;

public class IntersectionOfArrays { // 349
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], false);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j])) {
                map.put(nums2[j], true);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer e : map.keySet()) {
            if (map.get(e) == true) {
                list.add(e);
            }
        }
        int res[] = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }
        return res;
    }
}
