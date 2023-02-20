/*
The power of the string is the maximum length of a non-empty 
substring that contains only one unique character.
Given a string s, return the power of s.
*/

package LeetCode.Easy;

public class ConsecutiveCharacters { // 1446
    public static int maxPower(String s) {
        int maxPower = 1;
        int currPower = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                currPower++;
                maxPower = Math.max(currPower, maxPower);
            } else {
                currPower = 1;
            }
        }
        return maxPower;
    }

    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        System.out.println(maxPower(s));
    }
}
