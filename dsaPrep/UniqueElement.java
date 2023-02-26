package dsaPrep;

public class UniqueElement {
	public static int findUniqueElement(int arr[]) {
		int ans = 0;
		for (int e : arr) {
			ans ^= e;
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 2, 5, 1, 4, 5, 9 };
		System.out.println(findUniqueElement(arr));
	}
}
