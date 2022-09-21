package Loops;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The table of " + num + " is:");
        for (int i = 1; i < 13; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

// OUTPUT
// Enter a number: 6
// The table of 6 is:
// 6 * 1 = 6
// 6 * 2 = 12
// 6 * 3 = 18
// 6 * 4 = 24
// 6 * 5 = 30
// 6 * 6 = 36
// 6 * 7 = 42
// 6 * 8 = 48
// 6 * 9 = 54
// 6 * 10 = 60
// 6 * 11 = 66
// 6 * 12 = 72
