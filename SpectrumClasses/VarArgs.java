package SpectrumClasses;

public class VarArgs {
	public static int add(int... vals) {
		int sum = 0;
        for (int val : vals) {
            sum += val;
        }
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(2, 3, 54, 654));
	}
}
