package SpectrumClasses;

import java.util.*;

public class SearchValue {

	public static void binarySearch(int nums[], int val) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				System.out.println(val + " is present at index " + i);
				return;
			}
		}
		System.out.println(val + " is not present in the given array.");
	}

	public static void main(String[] args) {
		int arr[] = { 3, 7, 22, 33, 62, 109, 5, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value to find: ");
		int valueToFind = sc.nextInt();
		binarySearch(arr, valueToFind);
	}

}
