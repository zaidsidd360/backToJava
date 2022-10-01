package Recursion;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void recursiveFibonacci(int n, int first, int sec) {
        if (n == 0)
            return;
        int next = first + sec;
        System.out.print(next + " ");
        first = sec;
        sec = next;
        recursiveFibonacci(n - 1, first, sec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();
        int first = 0;
        int sec = 1;
        System.out.print(first + " " + sec + " ");

        recursiveFibonacci(n - 2, first, sec);
    }
}
