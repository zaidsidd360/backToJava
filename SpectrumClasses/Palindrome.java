package SpectrumClasses;

import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        return n == rev;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
        sc.close();
    }
}
