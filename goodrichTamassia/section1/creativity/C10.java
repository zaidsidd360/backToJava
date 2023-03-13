/*
 * Write a Java program that takes n number of integer 
 * elements and returns the second largest element of the imputs.
 * Return -1 if no such element is found.
 * */

package goodrichTamassia.section1.creativity;

import java.util.Arrays;

public class C10 {
	public static int findSecondLargest(int arr[]) {
		Arrays.sort(arr);
		for (int i = arr.length - 2; i >= 0; i--)
			if (arr[i] != arr[i + 1])
				return arr[i];
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 12, 24, 6, 33, 78, 8, 10 };
		System.out.println(findSecondLargest(arr));
	}

}
