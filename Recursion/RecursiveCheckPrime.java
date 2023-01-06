package Recursion;

public class RecursiveCheckPrime {
    public static int sum = 0;

    public static void checkPrime(int n, int i) {
        if (i == n) {
            if (sum == 2)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is not a prime number.");
            return;
        }

        if (n % i == 0 && n % n == 0)
            sum++;
        System.out.println(sum);
        checkPrime(n, i + 1);
    }

    public static void main(String[] args) {
        checkPrime(7, 1);
    }
}