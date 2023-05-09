package SpectrumClasses;

public class LuckyNumber {
	public static boolean isLucky(int num) {
		double sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum += Math.pow(rem, 3);
			num /= 10;
		}
		return sum % 10 == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLucky(145));
	}

}
