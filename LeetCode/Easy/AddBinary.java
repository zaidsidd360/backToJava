// Given two binary strings a and b, return their sum as a binary string.

package LeetCode.Easy;

import java.math.*;

public class AddBinary { // 67
    public static String addBinary(String a, String b) {
        BigInteger decA = new BigInteger(a, 2);
        BigInteger decB = new BigInteger(b, 2);
        BigInteger sum = decA.add(decB);
        return sum.toString(2);
    }

    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
    }
}