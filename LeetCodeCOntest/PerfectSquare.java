package LeetCodeCOntest;

import java.lang.Math;

public class PerfectSquare {
    public static void getPerfectSquares(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        getPerfectSquares(100);
    }
}