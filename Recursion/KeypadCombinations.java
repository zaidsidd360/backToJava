package Recursion;

import java.util.Scanner;

public class KeypadCombinations {
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombinations(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombinations(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a keypad combination: ");
        String str = sc.next();
        int idx = 0;
        String combination = "";
        printCombinations(str, idx, combination);
    }
}
