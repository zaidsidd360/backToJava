package Conditioanls;

import java.util.Scanner;

public class CompareTwoNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else
            System.out.println(b + " is greater than " + a);
    }
}
