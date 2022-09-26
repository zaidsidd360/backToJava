package Arrays;

import java.util.Scanner;

public class NumSearch {
    public static void main(String[] args) {
        boolean comesInArray = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter an integer: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a value to find: ");
        int value = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == value) {
                System.out.println("The value was found at index " + j);
                comesInArray = true;
            }
        }
        if (comesInArray == false)
            System.out.println("Value out of range!");
    }
}
