/*
 * The string "PAYPALISHIRING" is written in a zigzag pattern 
 * on a given number of rows like this: 
 * (you may want to display this pattern in a fixed font for better legibility)
 * 
 *          P   A   H   N
 *          A P L S I I G
 *          Y   I   R
 * 
 * And then read line by line: "PAHNAPLSIIGYIR"

 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 * */

package LeetCode.Medium;

public class ZigzagConversion { // 6
	public static String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		String ans = "";
		int increment = (numRows - 1) * 2;
		for (int i = 0; i < numRows; i++) {
			for (int j = i; j < s.length(); j += increment) {
				ans += s.charAt(j);
				if (i > 0 && i < numRows - 1 && j + increment - 2 * i < s.length())
					ans += s.charAt(j + increment - 2 * i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		System.out.println(convert(s, 3));
	}

}
