package SpectrumClasses;

public class RemoveDuplicacy {
	public static void removeDuplicacy(int arr[], int length) {
		if (length == 0 || length == 1) {
			return;
		}
		int count = 0;
		for (int i = 0; i < length; i++) {
			int j = i + 1;
			while (j < length) {
				if (arr[i] == arr[j]) {
					arr[count++] = arr[j];
				}
				j++;
			}
			arr[count++] = arr[i];
		}
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 3, 4, 5, 5 };
//		int arr[] = { 79, 80, 80, 13, 13, 79 };
		removeDuplicacy(arr, arr.length);
	}

}
