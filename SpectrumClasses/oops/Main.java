package SpectrumClasses.oops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pincode: ");
		String p = sc.nextLine();
		System.out.println("Enter your lane: ");
		String l = sc.nextLine();
		System.out.println("Enter your country: ");
		String co = sc.nextLine();
		System.out.println("Enter your city: ");
		String ci = sc.nextLine();
		System.out.println("Enter your premisesNo: ");
		int pn = sc.nextInt();

		Address ad = new Address(p, co, l, ci, pn);
		Student adib = new Student(20, "Adib", 10000.00, ad);
		System.out.println(adib.address.pincode);

	}

}
