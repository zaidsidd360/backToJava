package SpectrumClasses;

// Ask the user for a number as input, if the input is between 1 and 10, print "Congrats!". Else, repeat.

import java.util.Scanner;

public class BetweenOneAndTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10(inclusive):");
        boolean isCorrect = false;
        while (!isCorrect) {
            int n = sc.nextInt();
            if (n >= 1 && n <= 10) {
                System.out.println("Congrats!");
                isCorrect = true;
            } else {
                System.out.println("Please enter a number between 1 and 10(inclusive)!");
            }
        }
        sc.close();
    }
}
