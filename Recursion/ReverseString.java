package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void reverseString(String str, int lastIndex) {
        if (lastIndex == 0) {
            System.out.print(str.charAt(lastIndex));
            System.out.println();
            return;
        }
        System.out.print(str.charAt(lastIndex));
        reverseString(str, lastIndex - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();
        int lastIndex = str.length() - 1;
        reverseString(str, lastIndex);
    }
}
