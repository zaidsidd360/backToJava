package SpectrumClasses;

// Create a new array with this pattern:
// arr1 = { 1, 3, 15, 9, 7 };
//           \   /   \  /
// arr2 = { 8, 12, 14, 6, 5 };

// Expected output:
// arr3 = { 1, 12, 15, 6, 7};

public class Alternate {
	public static int[] makeAlternate(int arr1[], int arr2[]) {
		int combinedLength = arr1.length + arr2.length;
		int result[] = new int[combinedLength / 2];
		for (int i = 0; i < combinedLength / 2; i++) {
			if (i % 2 != 0) {
				result[i] = arr2[i];
			} else {
				result[i] = arr1[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 15, 9, 7 };
		int b[] = { 8, 12, 14, 6, 5 };
		int ans[] = makeAlternate(a, b);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}
}