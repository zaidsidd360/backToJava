package Conditioanls;

import java.util.*;

public class checkAge {
    public static void main(String args[]) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You're an Adult.");
        } else
            System.out.println("You're not an adult.");
    }
}
