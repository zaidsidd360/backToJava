package Loops;

import java.util.Scanner;

public class SumOfFirstNnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + num + " natural numbers is: " + sum);
    }
}

// OUTPUT
// Enter a number: 6
// The sum of the first 6 natural numbers is: 21
