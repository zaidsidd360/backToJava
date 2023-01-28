// You are given an array of strings names, and an array 
// heights that consists of distinct positive integers. Both arrays are of length n.
// For each index i, names[i] and heights[i] denote the name and height of the ith person.
// Return names sorted in descending order by the people's heights.

package LeetCode.Easy;

import java.util.*;

public class SortPeople { // 2418
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public String[] sortPeople(String[] names, int[] heights) { // Naive implementation; LC runtime 22ms
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        bubbleSort(heights);
        for (int j = 0; j < heights.length; j++) {
            names[j] = map.get(heights[j]);
        }
        return names;
    }

    public String[] sortPeople2(String[] names, int[] heights) { // Optimized implementation; LC runtime 5ms
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights); // Arrays.sort(array) uses quicksort under the hood for primitive types and has
                              // O(n*log(n)) complexity.
        int ind = 0;
        for (int j = heights.length - 1; j >= 0; j--) {
            names[ind] = map.get(heights[j]);
            ind++;
        }
        return names;
    }
}
