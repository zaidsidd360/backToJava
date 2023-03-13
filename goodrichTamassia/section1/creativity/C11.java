/*
 * Write a short program that takes as input two positive 
 * integers A and B from the Java console and swaps the 
 * values without using a third variable.
 * */

package goodrichTamassia.section1.creativity;

public class C11 {
	public static void swap(int A, int B) {
		System.out.println("Before swap: " + "a = " + A + ", " + "b = " + B);
		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println("After swap: " + "a = " + A + " " + "b = " + B);
	}

	public static void main(String[] args) {
		int a = 24;
		int b = 35;
		swap(a, b);
	}

}
