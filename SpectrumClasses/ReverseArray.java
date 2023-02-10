package SpectrumClasses;

// Reverse a given array of integers.

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[j] = arr[i];
            j++;
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 5, 4, 3 };
        int[] reversedArray = reverseArray(array);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
