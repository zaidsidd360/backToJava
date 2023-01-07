package Miscellaneous;

public class Square {
    public static void printSquare(int n) {
        int pow = 1;
        for (int i = 0; i < n; i++) {
            if (i == n - 1)
                System.out.println((int) (Math.pow(5, pow)) + ".");
            else
                System.out.print((int) (Math.pow(5, pow)) + ", ");
            pow++;
        }
    }

    public static void main(String[] args) {
        printSquare(5);
    }
}
