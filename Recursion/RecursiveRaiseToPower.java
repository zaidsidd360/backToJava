package Recursion;

import java.util.Scanner;

public class RecursiveRaiseToPower {
    public static int calcXtoN(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        int xToNmOne = calcXtoN(x, n - 1);
        int xToN = x * xToNmOne;
        return xToN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        System.out.print("Enter the power you want to raise " + x + " to: ");
        int n = sc.nextInt();

        int answer = calcXtoN(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + answer);
    }
}
