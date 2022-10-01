package Recursion;

import java.util.Scanner;

public class RecursivePrint {
    public static void recursivePrint(int num) {
        if (num == 0)
            return;
        System.out.print(num + " ");
        recursivePrint(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        recursivePrint(n);
    }
}
