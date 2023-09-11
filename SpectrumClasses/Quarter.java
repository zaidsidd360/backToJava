package SpectrumClasses;

public class Quarter {
	public static void checkQuarter(int m) {
		switch (m) {
		case 1:
		case 2:
		case 3: {
			System.out.println("First Quarter");
			break;
		}
		case 4:
		case 5:
		case 6: {
			System.out.println("Second Quarter");
			break;
		}
		case 7:
		case 8:
		case 9: {
			System.out.println("Third Quarter");
			break;
		}
		case 10:
		case 11:
		case 12: {
			System.out.println("Fourth Quarter");
			break;
		}
		default:
			System.out.println("Illegal Argument");
			break;
		}
		int prod = 1;
		for (int i = 1; i <= 100; i *= 3) {
			prod *= i;
		}
		System.out.println(prod);
	}

	public static void main(String[] args) {
		checkQuarter(13);
	}

}
