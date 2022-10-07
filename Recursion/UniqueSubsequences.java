package Recursion;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubsequences {
    public static void subsequences(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currentChar = str.charAt(idx);

        // to be
        subsequences(str, idx + 1, newStr + currentChar, set);

        // not to be
        subsequences(str, idx + 1, newStr, set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        int idx = 0;
        String newStr = "";
        subsequences(str, idx, newStr, set);
    }
}
