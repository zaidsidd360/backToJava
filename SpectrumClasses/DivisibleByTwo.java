package SpectrumClasses;

public class DivisibleByTwo {
	public static boolean isDivisibleByTwo(int n) {
		for (int i = n; i >= 0; i--) {
			n = n - 2;
			if (n == 0)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDivisibleByTwo(23));
	}

}
