package SpectrumClasses;

import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your marks: ");
        int marks = sc.nextInt();
        if (marks >= 75 ) System.out.println("A");
        else if (marks >= 55) {
            System.out.println("B");
        } else System.out.println("C");
    }
}
