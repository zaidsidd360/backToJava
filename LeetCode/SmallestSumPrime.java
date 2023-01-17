package LeetCode;

import java.util.ArrayList;

public class SmallestSumPrime {
    public static void findFactors(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        int ind = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                array.add(ind, i);
                ind++;
            }
        }
        System.out.println(array);
    }

    public static void findSmallestPrimeFactor(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (n % i == 0 && n % j == 0 && i * j == n) {
                    n = i + j;
                } else {
                    System.out.println(n);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        // findSmallestPrimeFactor(15);
        findFactors(44);
    }
} // INCOMPLETE
