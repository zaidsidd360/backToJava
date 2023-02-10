package SpectrumClasses;

// Check whether a given number is a prime number using a while loop.

public class PrimeWhile {
    public static boolean checkPrime(int num) {
        int factors = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                factors += 1;
            }
            i++;
        }
        if (factors == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = checkPrime(7);

        if (isPrime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");

    }
}
