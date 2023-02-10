// Write an algorithm to determine if a number n is happy.
// A happy number is a number defined by the following process:
// * Starting with any positive integer, replace the number by 
// the sum of the squares of its digits.
// * Repeat the process until the number equals 1 (where it will stay), 
// or it loops endlessly in a cycle which does not include 1.
// * Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

package LeetCode.Easy;

import java.util.*;

class HappyNumber { // 202
    public static int nextSum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();
        while (n != 1 && !hs.contains(n)) {
            hs.add(n);
            n = nextSum(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int num = 19;
        System.out.println(isHappy(num));
    }
}