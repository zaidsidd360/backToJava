/*
 * Write a short Java method, isOdd, that takes an int i and returns true if and only
 * if i is odd. Your method cannot use the multiplication, modulus, or division
 * operators, however.
 * */

package goodrichTamassia.section1.reinforcement;

public class R3 {
	public static boolean isOdd(int i) {
		while (i >= -1) {
			i = i - 2;
			if (i == -1)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.print(isOdd(7));
	}
}
