// For two strings s and t, we say "t divides s" if and only
// if s = t + ... + t (i.e., t is concatenated with itself one or more times).
// Given two strings str1 and str2, return the largest 
// string x such that x divides both str1 and str2.

package LeetCode.Easy;

public class GCDofStrings { // 1071
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        int gcd = findGCD(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    public static int findGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i > gcd)
                    gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        String str1 = "ABABAB", str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));
    }
}
