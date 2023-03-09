/*
 * Given a string s, reverse the order of characters in each 
 * word within a sentence while still preserving whitespace 
 * and initial word order.
 * */

package LeetCode.Easy;

public class ReverseWordsInString { // 557
	public static String reverseWords(String s) { // Naive implementation; LC runtime: 50ms
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String curr = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				curr += arr[i].charAt(j);
			}
			arr[i] = curr;
		}
		return String.join(" ", arr);
	}

	public static String reverseWords2(String s) { // Optimized implementation; LC runtime: 6ms
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			arr[i] = sb.reverse().toString();
		}
		return String.join(" ", arr);
	}

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords2(s));
	}

}
