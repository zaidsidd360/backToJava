// Given an array of intervals where intervals[i] = [starti, endi], 
// merge all overlapping intervals, and return an array of the 
// non-overlapping intervals that cover all the intervals in the input.

package LeetCode.Medium;

import java.util.*;

public class MergeIntervals { // 56
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> linkedList = new LinkedList<>();
        for (int[] interval : intervals) {
            if (linkedList.isEmpty() || linkedList.getLast()[1] < interval[0])
                linkedList.add(interval);
            else
                linkedList.getLast()[1] = Math.max(linkedList.getLast()[1], interval[1]);
        }
        return linkedList.toArray(new int[linkedList.size()][]);
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int mergedIntervals[][] = merge(intervals);
        for (int[] interval : mergedIntervals) {
            System.out.print(" [");
            for (int val : interval) {
                System.out.print(" " + val + " ");
            }
            System.out.print("] ");
        }
    }
}
