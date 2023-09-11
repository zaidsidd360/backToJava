package SpectrumClasses;

import java.util.Scanner;

public class PrintSum {
	public static Scanner s = new Scanner(System.in);

	public static void printSum() {
		int sum = 0;
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			sum += s.nextInt();
		}
		System.out.println("The sum is: " + sum);
	}

	public static void printSum2() {
		int sum = 0;
		int n = 1;
		while (n != 0) {
			System.out.println("Enter a number: ");
			n = s.nextInt();
			sum += n;
		}
		System.out.println("The sum is: " + sum);
	}

	public static void main(String[] args) {
		printSum2();
	}

}
