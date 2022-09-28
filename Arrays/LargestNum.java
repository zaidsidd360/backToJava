package Arrays;

import java.util.Scanner;

class LargestNum {
    public static void main(String[] args) {
        int largestNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > largestNum)
                largestNum = arr[i];
        }
        System.out.println("The largest number entered was: " + largestNum);

    }
}