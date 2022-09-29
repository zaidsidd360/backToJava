package Strings;

import java.util.Scanner;

public class CumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int cumulativeLength = 0;

        String arr[] = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter a string: ");
            arr[i] = sc.next();
            cumulativeLength += arr[i].length();
        }

        System.out.println("The cumulative length of all the strings in the array is:" + cumulativeLength);
    }
}
