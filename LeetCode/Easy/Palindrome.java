// Given an integer x, return true if x is a palindrome and false otherwise.

package LeetCode.Easy;

public class Palindrome { // 09
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int temp = x;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev == x ? true : false;
    }

    public static boolean isPalindrome2(int x) {
        String str = Integer.toString(x);
        String compareStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            compareStr += str.charAt(i);
        }
        return str.equals(compareStr) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(323));
        System.out.println(isPalindrome2(121));
    }
}
