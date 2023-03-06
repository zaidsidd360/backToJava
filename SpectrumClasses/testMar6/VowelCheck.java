package SpectrumClasses.testMar6;

import java.util.Scanner;

public class VowelCheck {

	public static char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

	public static int checkVowelWord(String s) {
		String arr[] = s.toLowerCase().split(" ");
		int sum = 0;
		for (String str : arr) {
			if (isVowel(str.charAt(str.length() - 1)) && isVowel(str.charAt(0)))
				sum++;
		}
		return sum;
	}

	public static boolean isVowel(char c) {
		for (char vowel : vowels)
			if (c == vowel)
				return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.println(checkVowelWord(sentence));
		sc.close();
	}
}
