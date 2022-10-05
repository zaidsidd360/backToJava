package Recursion;

import java.util.Scanner;

public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(int idx, String newStr, String str) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a']) {
            removeDuplicates(idx + 1, newStr, str);
        } else {
            newStr += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicates(idx + 1, newStr, str);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < map.length - 1; i++) {
            map[i] = false;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String newStr = "";
        int idx = 0;
        removeDuplicates(idx, newStr, str);
    }
}
