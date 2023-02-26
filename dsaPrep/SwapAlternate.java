package dsaPrep;

public class SwapAlternate {
	public static int[] swapAlternate(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arrray[] = { 1, 2, 3, 4, 5, 6, 7 };
		int ans[] = swapAlternate(arrray);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
