/*
You are given a 0-indexed integer array nums of even length.

As long as nums is not empty, you must repetitively:

1. Find the minimum number in nums and remove it.
2. Find the maximum number in nums and remove it.
3. Calculate the average of the two removed numbers.

The average of two numbers a and b is (a + b) / 2.
For example, the average of 2 and 3 is (2 + 3) / 2 = 2.5.

Return the number of distinct averages calculated using the above process.

Note that when there is a tie for a minimum or maximum number, any can be removed.
*/

package LeetCode.Easy;

import java.util.*;

public class DistinctAverages { // 2465
    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        LinkedList<Integer> ll = new LinkedList<>();
        Set<Double> set = new HashSet<>();
        for (int e : nums) {
            ll.add(e);
        }
        while (!ll.isEmpty()) {
            set.add((double) (ll.removeFirst() + ll.removeLast()) / 2);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = { 4, 1, 4, 0, 3, 5 };
        System.out.println(distinctAverages(nums));
    }
}
