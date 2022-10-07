package Recursion;

import java.util.Scanner;

public class Subsequences {
    public static void subsequences(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);

        // to be
        subsequences(str, idx + 1, newStr + currentChar);

        // not to be
        subsequences(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        int idx = 0;
        String newStr = "";
        subsequences(str, idx, newStr);
    }
}
