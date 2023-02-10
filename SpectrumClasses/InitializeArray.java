package SpectrumClasses;

// Initialize an array with user defined length and user given elements.

import java.util.Scanner;

public class InitializeArray {
    public static int[] initializeArray(int size, Scanner sc) {
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for array[" + i + "]: ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for the array: ");
        int size = sc.nextInt();
        int arr[] = initializeArray(size, sc);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
