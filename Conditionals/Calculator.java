// SWITCH CASE

package Conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        System.out.println("""
                Welcome to the calculator.\n
                After entering the two numbers, press\n
                1 for addition (+)\n
                2 for subtracction (-)\n
                3 for multiplication (*) and\n
                4 for division (/)
                """);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Double sum = num1 + num2;
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                Double diff = (num1 > num2 ? num1 - num2 : num2 - num1);
                System.out.println("The difference is: " + diff);
                break;
            case 3:
                Double prod = num1 * num2;
                System.out.println("The product is: " + prod);
                break;
            case 4:
                Double div = num1 / num2;
                System.out.println("The division is: " + div);
                break;
            case 5:
                System.out.println("Invalid choice!");
        }

    }
}

// OUTPUT
// Welcome to the calculator.

// After entering the two numbers, press

// 1 for addition (+)

// 2 for subtracction (-)

// 3 for multiplication (*) and

// 4 for division (/)

// Enter the first number: 22
// Enter the second number: 65
// 2
// The difference is: 43.0