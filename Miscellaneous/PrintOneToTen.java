package Miscellaneous;

import java.util.*;

public class PrintOneToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you don't want printed: ");
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n) {
        for (int i = 1; i <= 10; i++) {
            if (i == n) {
                continue;
            }
            System.out.println(i);
        }
    }

}
