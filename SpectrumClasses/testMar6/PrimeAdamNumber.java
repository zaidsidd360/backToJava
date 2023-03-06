package SpectrumClasses.testMar6;

import java.util.Scanner;

public class PrimeAdamNumber {
	public static boolean checkAdamNumber(int n) {
		int numRev = reverse(n);
		int squareOfNumber = n * n;
		int squareOfReverse = numRev * numRev;
		int revOfSquareOfReverse = reverse(squareOfReverse);
		return isPrime(n) && squareOfNumber == revOfSquareOfReverse ? true : false;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static int reverse(int n) {
		int rev = 0;
		int temp = n;
		while (temp != 0) {
			rev = rev * 10 + (temp % 10);
			temp /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		boolean isAdam = checkAdamNumber(number);
		System.out.println(isAdam ? number + " is a Prime-Adam number" : number + " is NOT a Prime-Adam number");
		sc.close();
	}

}
