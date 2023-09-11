package SpectrumClasses;

import java.util.Scanner;

public class PrimeInput {

	public static void takePrimeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int i = 0;
		while (i < size) {
			System.out.print("Enter a prime number:");
			int val = sc.nextInt();
			if (isPrime(val)) {
				arr[i++] = val;
			} else {
				System.out.println("Wrong input!");
			}
		}
		for (int e : arr)
			System.out.print(e + " ");
	}

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		takePrimeInput();
	}

}
