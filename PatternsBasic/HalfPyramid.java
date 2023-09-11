package PatternsBasic;

public class HalfPyramid {
	public static void main(String[] args) {
		int m = 4;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// OUTPUT
// *
// **
// ***
// ****
