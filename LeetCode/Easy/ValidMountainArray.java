/*
 * Given an array of integers arr, return true if and only 
 * if it is a valid mountain array. 
 * 
 * Recall that arr is a mountain array if and only if:
 * * arr.length >= 3  
 * * There exists some i with 0 < i < arr.length - 1 such that:
 * * * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
 * * * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * */

package LeetCode.Easy;

public class ValidMountainArray { // 941
	public static boolean validMountainArray(int[] arr) {
		if (arr.length < 3)
			return false;
		int i = 0;
		int j = arr.length - 1;
		while (arr[j - 1] > arr[j]) {
			if (j == 1)
				break;
			j--;
		}
		while (arr[i + 1] > arr[i]) {
			if (i == arr.length - 2)
				break;
			i++;
		}
		return arr[i] == arr[j] && i == j;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 3, 2, 1 };
		System.out.println(validMountainArray(arr));
	}

}
