package goodrichTamassia.section1.creativity;

import java.util.Arrays;
import java.util.Random;

public class C15 {
	public static int[] shuffleArray(int arr[]) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			int j = random.nextInt(arr.length - 1);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int array[] = new int[54];
		for (int i = 0; i < 54; i++)
			array[i] = i + 1;
		for (int j = 0; j < 5; j++) {
			System.out.println(Arrays.toString(shuffleArray(array)));
		}
	}

}
