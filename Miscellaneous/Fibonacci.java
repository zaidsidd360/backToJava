package Miscellaneous;

public class Fibonacci {
    public static void fibonacci(int n) {
        int fst = 0;
        int sec = 1;
        System.out.print(fst + ", " + sec + ", ");
        for (int i = 2; i < n; i++) {
            int curr = fst + sec;
            System.out.print(curr + ", ");
            fst = sec;
            sec = curr;
        }
    }

    public static void main(String[] args) {
        fibonacci(15);
    }
}
