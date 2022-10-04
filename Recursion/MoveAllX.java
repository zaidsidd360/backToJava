package Recursion;

import java.util.Scanner;

public class MoveAllX {
    public static void moveAllX(String str, char el, int idx, int cnt, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i <= cnt; i++) {
                newStr += el;
            }
            System.out.println("The new string is: " + newStr);
            return;
        }
        if (str.charAt(idx) == el)
            cnt += 1;
        else
            newStr += str.charAt(idx);

        moveAllX(str, el, idx + 1, cnt, newStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a letter: ");
        char element = sc.next().charAt(0);
        int index = 0;
        int count = 0;
        String newStr = "";
        moveAllX(str, element, index, count, newStr);
    }
}
