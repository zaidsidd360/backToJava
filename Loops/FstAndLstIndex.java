package Loops;

import java.util.Scanner;

public class FstAndLstIndex {
	public static void findFstAndLstIndex(String s, char c) {
		int fst = -1;
		int lst = -1;

		for (var i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				if (fst == -1)
					fst = i;
				else
					lst = i;
		}

		if (fst == -1)
			System.out.println("Letter not found!");
		else if (lst == -1)
			System.out.println("Letter exists only once and is found at index: " + fst);

		if (fst != -1 && lst != -1)
			System.out.println("First occurance: " + fst + ", Last occurance: " + lst);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word/sentence: ");
		String s = sc.nextLine();
		System.out.println("Enter a letter to search in the string: ");
		char c = sc.next().charAt(0);
		findFstAndLstIndex(s, c);
		sc.close();
	}

}
