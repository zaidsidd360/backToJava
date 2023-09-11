package Miscellaneous;

public class Prime {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int fac = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					fac++;
			}
			if (fac == 2)
				System.out.println(i);
		}
	}
}
