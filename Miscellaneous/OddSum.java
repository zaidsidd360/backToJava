package Miscellaneous;

public class OddSum {
	public static void main(String[] args) {
		int numOfOdds = 0;
		int sum = 0;
		int i = 0;
		while (numOfOdds <= 20) {
			if (i % 2 != 0) {
				sum += i;
				numOfOdds++;
				System.out.println(i);
			}
			i++;
		}
		System.out.println(sum);
	}
}
