package SpectrumClasses;

// Check whether a given number is prime or not using recursion.

public class PrimeRecursive {
    public static void checkPrimeRecursive(int n, int i, int fac) {
        if (i == n + 1) {
            if (fac == 2)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is NOT a prime number.");
            return;
        }

        if (n % i == 0)
            fac += 1;
        checkPrimeRecursive(n, i + 1, fac);
    }

    public static void main(String[] args) {
        int factors = 0;
        checkPrimeRecursive(5, 1, factors);
    }
}
