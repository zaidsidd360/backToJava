/*
You are given a string s consisting of lowercase English letters, and 
an integer k. First, convert s into an integer by replacing each letter 
with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). 
Then, transform the integer by replacing it with the sum of its digits. 
Repeat the transform operation k times in total.

For example, if s = "zbax" and k = 2, then the resulting integer would be 
8 by the following operations:

Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
Transform #2: 17 ➝ 1 + 7 ➝ 8

Return the resulting integer after performing the operations described above.
*/

package LeetCode.Easy;

public class SumOfDigitsOfString { // 1945
    public static int getLucky(String s, int k) {
        String str = "";
        for (char c : s.toCharArray()) {
            str += Integer.toString(c - 96);
        }
        int i = 0;
        while (i < k) {
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += Character.getNumericValue(str.charAt(j));
            }
            str = Integer.toString(sum);
            i++;
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(getLucky(s, k));
    }
}
