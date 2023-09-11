package SpectrumClasses;

import java.util.ArrayList;

public class LambdaExpression {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Rohan");
		list.add("Adib");
		list.add("Waqqas");
		list.add("Harsh");
		list.add("Inaque");

		System.out.println(list);

		list.sort((x, y) -> x.compareTo(y));

		System.out.println(list);

		list.sort((x, y) -> y.compareTo(x));

		System.out.println(list);

	}

}
