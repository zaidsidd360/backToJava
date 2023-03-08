/*
 * Given a positive integer num, return the number of positive 
 * integers less than or equal to num whose digit sums are even. 
 * The digit sum of a positive integer is the sum of all its digits.
 * */

package LeetCode.Easy;

public class CountEvenDigits { // 2180
	public static int countEven(int num) {
		int ans = 0;
		for (int i = 1; i <= num; i++) {
			int digitSum = findDigitSum(i);
			ans += digitSum % 2 == 0 ? 1 : 0;
		}
		return ans;
	}

	public static int findDigitSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 30;
		System.out.println(countEven(num));
	}

}
