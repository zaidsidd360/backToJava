// Difference Between Element Sum and Digit Sum of an Array
// You are given a positive integer array nums.
// The element sum is the sum of all the elements in nums.
// The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
// Return the absolute difference between the element sum and digit sum of nums.
// Note that the absolute difference between two integers x and y is defined as |x - y|.

package LeetCode;

public class DifferenceOfSum {

    public static int findSumOfElements(int arr[]) {
        int sumOfElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfElements += arr[i];
        }
        return sumOfElements;
    }

    public static int findSumOfDigits(int arr[]) {
        int sumOfDigits = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9) {
                int temp = arr[i];
                while (temp > 0) {
                    sumOfDigits += temp % 10;
                    temp = temp / 10;
                }
            } else
                sumOfDigits += arr[i];
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 15, 6, 3 };
        int differenceOfSum = Math.absExact(findSumOfElements(arr) - findSumOfDigits(arr));
        System.out.println(differenceOfSum);
    }
}