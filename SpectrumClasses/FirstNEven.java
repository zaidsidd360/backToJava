package SpectrumClasses;

import java.util.Scanner;

public class FirstNEven {
	public static void printFirstLimEven(int lim) {
		int value = 2;
		while (lim > 0) {
			System.out.println(value);
			value += 2;
			lim--;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int lim = s.nextInt();
		printFirstLimEven(lim);
	}

}
