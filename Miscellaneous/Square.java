package Miscellaneous;

public class Square {
    public static void printSquare(int n) {
        int pow = 2;
        System.out.print(5 + ", ");
        for (int i = 0; i < n; i++) {
            System.out.print((int) (Math.pow(5, pow)) + ", ");
            pow++;
        }
    }

    public static void main(String[] args) {
        printSquare(5);
    }
}
