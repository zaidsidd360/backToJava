package SpectrumClasses;

public class StringReversal3 {
	public static String reverse(String s) {
		String[] arr = s.split(" ");
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			String currStr = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				currStr += arr[i].charAt(j);
			}
			arr[i] = currStr;
		}
		for (String str : arr) {
			ans += str + " ";
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "A quick brown fox jumps over the lazy dog";
		System.out.println(reverse(str));
	}

}
