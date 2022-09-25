package Functions;

import java.util.Scanner;

public class Factorial {
    public static void calculateFactorial(int num) {
        int factorial = 1;
        if (num == 0 || num == 1) {
            System.out.println("The factorial is: 1");
            return;
        } else if (num <= 0) {
            System.out.print("Invalid number!");
            return;
        } else {
            for (int i = num; i >= 1; i--) {
                factorial = factorial * i;
            }
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        calculateFactorial(num);
    }
}
