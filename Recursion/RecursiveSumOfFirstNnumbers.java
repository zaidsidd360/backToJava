package Recursion;

import java.util.Scanner;

class RecursiveSumOfFirstNnumbers {
    public static void sumRecursive(int end, int start, int sum) {
        if (start == end) {
            sum += start;
            System.out.print("The sum of the first " + end + " natural numbers is: " + sum);
            return;
        }
        sum += start;
        sumRecursive(end, start + 1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ending value: ");
        int end = sc.nextInt();
        int sum = 0;
        int start = 1;

        sumRecursive(end, start, sum);
    }
}