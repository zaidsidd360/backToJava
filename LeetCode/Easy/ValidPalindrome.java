// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
// and removing all non-alphanumeric characters, it reads the same forward and backward. 
// Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

package LeetCode.Easy;

public class ValidPalindrome { // 125
    public static boolean checkPalindrome(String s) { // Naive implementation; LC runtime 1517ms
        if (s.length() == 0)
            return false;
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (!Character.toString(s.charAt(i)).matches("^[^a-zA-Z0-9]+$")) {
                newStr += Character.toString(s.charAt(i)).toLowerCase();
            }
        }
        String revStr = "";
        for (int i = newStr.length() - 1; i >= 0; i--) {
            revStr += Character.toString(newStr.charAt(i));
        }
        return newStr.equals(revStr) ? true : false;
    }

    public static boolean checkPalindrome2(String s) { // Optimized implementation; LC runtime 37ms
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome2("A man, a plan, a canal: Panama"));
    }
}
