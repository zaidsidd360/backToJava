package Recursion;

import java.util.Scanner;

public class FstAndLstIndex {
    public static int fst = -1;
    public static int lst = -1;

    public static void findFstAndLstOccurance(String str, char element, int index) {
        // char currentChar = str.charAt(index);
        if (index == str.length()) {
            if (fst == -1) {
                System.out.println("Letter NOT found!");
                return;
            } else {
                System.out.println("The first index of " + element + " is: " + fst + ",");
            }

            if (lst == -1) {
                System.out.println("and " + element + " occurs only once.");
            } else {
                System.out.println("and the last index of " + element + " is: " + lst + ".");
            }
            return;
        }
        if (str.charAt(index) == element) {
            if (fst == -1)
                fst = index;
            else
                lst = index;
        }
        findFstAndLstOccurance(str, element, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a letter(if string entered, the first letter will be taken): ");
        char element = sc.next().charAt(0);
        int index = 0;
        findFstAndLstOccurance(str, element, index);
    }
}
