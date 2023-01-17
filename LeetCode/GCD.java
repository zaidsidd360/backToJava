// Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
// The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

package LeetCode;

public class GCD {
    public static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int findGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i > gcd)
                    gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int arr[] = { 59, 41, 32, 68, 67, 72, 24 };
        int sortedArray[] = bubbleSort(arr);
        int largest = sortedArray[sortedArray.length - 1];
        int smallest = sortedArray[0];
        System.out.println("GCD of " + smallest + " and " + largest + " is: " + findGCD(smallest, largest));
    }
}