// A perfect number is a positive integer that is equal to 
// the sum of its positive divisors, excluding the number itself. 
// A divisor of an integer x is an integer that can divide x evenly.
// Given an integer n, return true if n is a perfect number, otherwise return false.

package LeetCode.Easy;

public class PerfectNumber { // 504
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        if (num % 2 != 0)
            return false;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
    }
}
