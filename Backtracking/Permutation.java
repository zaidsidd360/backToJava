package Backtracking;

import java.util.Scanner;

public class Permutation {

    public static void printPermutations(String str, String permutation, int idx) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, permutation + currentChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        String perm = "";
        printPermutations(str, perm, 0);
    }
}
