/*
 * Given a string s. Return all the words vertically in 
 * the same order in which they appear in s. Words are 
 * returned as a list of strings, complete with spaces when is 
 * necessary. (Trailing spaces are not allowed). Each word would 
 * be put on only one column and that in one column there will 
 * be only one word.
 * */
/*
 * Example input: s = "TO BE OR NOT TO BE"
 * 
 * Expected output: ["TBONTB","OEROOE","   T"]
 * */

package LeetCode.Medium;

import java.util.*;

public class VerticalWords { // 1324
	public static List<String> printVertically(String s) {
		List<String> ans = new ArrayList<>();
		String arr[] = s.split(" ");
		int maxLen = Integer.MIN_VALUE;
		for (String str : arr)
			maxLen = Math.max(maxLen, str.length());
		for (int i = 0; i < maxLen; i++) {
			String curr = "";
			for (String str : arr) {
				if (i < str.length())
					curr += str.charAt(i);
				else
					curr += " ";
			}
			ans.add(curr.stripTrailing());
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "CONTEST IS COMING";
		System.out.println(printVertically(s));
	}

}
