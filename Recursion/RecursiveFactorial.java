package Recursion;

import java.util.Scanner;

public class RecursiveFactorial {
    public static int recursiveFactorial(int num, int prod) {
        if (num == 1 || num == 0)
            return prod;
        prod *= num;
        return recursiveFactorial(num - 1, prod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int fact = recursiveFactorial(n, 1);

        System.out.println("The factorial of " + n + " is: " + fact);
    }
}
