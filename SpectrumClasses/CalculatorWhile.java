package SpectrumClasses;

import java.util.Scanner;

public class CalculatorWhile {
    public static void main(String[] args) {
        System.out.println("""
                Welcome to the calculator.\n
                After entering the two numbers, press\n
                1 for addition (+)\n
                2 for subtracction (-)\n
                3 for multiplication (*)\n
                4 for division (/) and\n
                0 to Quit
                """);

        boolean hasQuit = false;
        int i = 0;

        while (!hasQuit) {
            if (i >= 1)
                System.out.println("""
                        After entering the two numbers, press\n
                        1 for addition (+)\n
                        2 for subtracction (-)\n
                        3 for multiplication (*)\n
                        4 for division (/) and\n
                        0 to Quit
                        """);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();
            System.out.print("Enter your choice: ");
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
                case 0:
                    System.out.println("Bye!");
                    hasQuit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
            i++;
        }
    }
}
