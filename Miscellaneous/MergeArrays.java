package Miscellaneous;

import java.util.*;

public class MergeArrays {
    public static int[] mergeArrays(int arr1[], int arr2[]) {
        Map<Integer, Integer> map = new TreeMap<>();
        int res[] = new int[arr1.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            map.put(count, arr1[i]);
            count += 2;
        }
        count = 1;
        for (int j = 0; j < arr2.length; j++) {
            map.put(count, arr2[j]);
            count += 2;
        }
        for (int k : map.keySet()) {
            res[k] = map.get(k);
        }
        return res;
    }

    public static int[] mergeArrays2(int[] arr1, int[] arr2) {
        int c[] = new int[arr1.length * 2];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            c[count] = arr1[i];
            count++;
            c[count] = arr2[i];
            count++;
        }
        return c;
    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 15, 9, 7 };
        int b[] = { 8, 12, 14, 6, 5 };
        // long startTime = System.nanoTime();
        int ans1[] = mergeArrays(a, a);
        int ans[] = mergeArrays2(a, b);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
