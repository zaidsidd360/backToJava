/*
 * Given a string s and an integer k, reverse the first k characters 
 * for every 2k characters counting from the start of the string. 
 * If there are fewer than k characters left, reverse all of them. 
 * If there are less than 2k but greater than or equal to k characters, 
 * then reverse the first k characters and leave the other as original.
 * */

package LeetCode.Easy;

public class ReverseStr2 { // 541
	public static String reverseStr(String s, int k) {
		char arr[] = s.toCharArray();
		int len = arr.length;
		for (int i = 0; i < len; i += 2 * k) {
			if (i + k - 1 <= len - 1)
				reverse(i, i + k - 1, arr);
			else
				reverse(i, len - 1, arr);
		}
		return new String(arr);
	}

	public static void reverse(int lo, int hi, char arr[]) {
		while (lo < hi) {
			char temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(s, k));
	}

}
