package SpectrumClasses;

import java.util.Arrays;

public class SecondLargest {
	public static int findSecondLargest(int arr[]) {
		Arrays.sort(arr);
		int i = arr.length - 1;
		while (i != 0) {
			if (arr[i] < arr[arr.length - 1])
				return arr[i];
			i--;
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 9, 91, 91, 81, 82, 27 };
		System.out.println(findSecondLargest(arr));
	}

}
