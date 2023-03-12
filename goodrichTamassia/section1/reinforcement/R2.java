/*
 * Write a short Java method, isMultiple, that takes two long values, n and m, and 
 * returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 * */

package goodrichTamassia.section1.reinforcement;

public class R2 {
	public static boolean isMultiple(long n, long m) {
		if (m > n)
			return false;
		long i = m;
		while (i < n) {
			if (m * i++ == n)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isMultiple(198, 3));
	}
}
