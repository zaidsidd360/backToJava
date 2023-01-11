package Miscellaneous;

public class Prime {
    public static void checkPrime(int num) {
        int factors = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors += 1;
        }

        if (factors == 2)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void main(String[] args) {
        checkPrime(7);
    }
}
