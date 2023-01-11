package Miscellaneous;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        bubbleSort(array);

    }
}
