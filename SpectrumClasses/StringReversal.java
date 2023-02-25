package SpectrumClasses;

import java.util.Scanner;

public class StringReversal {
	public static String reverseString(String s) {
		String ans = "";
		int i = s.length()-1;
		while(i >= 0) {
			ans += s.charAt(i);
			i--;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to reverse: ");
		String str = sc.nextLine();
		System.out.println(reverseString(str));
		sc.close();
	}

}
