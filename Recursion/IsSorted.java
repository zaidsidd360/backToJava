package Recursion;

import java.util.Scanner;

public class IsSorted {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx + 1] - arr[idx] > 0) {
            return isSorted(arr, idx + 1);
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        boolean sorted = isSorted(arr, idx);
        System.out.println(sorted ? "The array is sorted." : "The array is NOT sorted.");
    }
}
