package SpectrumClasses;

import java.util.*;

public class Difference {
    public static int getMaxDifference(int arr[]) {
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            smallest = Math.min(smallest, arr[i]);
            largest = Math.max(largest, arr[i]);
        }
        return largest - smallest;
    }

    public static int getMinDifference(int arr[]) {
        int smallestDiff = Math.abs(arr[0] - arr[1]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < smallestDiff) {
                    smallestDiff = diff;
                }
            }
        }
        return smallestDiff;
    }

    public static int getMinDifference2(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Math.abs(arr[0] - arr[1]);
        for (int i = 1; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 12, 16, 76, 19, 4 };
        System.out.println(getMinDifference2(arr));
    }
}
