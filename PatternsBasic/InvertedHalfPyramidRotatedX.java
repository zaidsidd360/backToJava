package PatternsBasic;

public class InvertedHalfPyramidRotatedX {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// OUTPUT
// - - - *
// - - * *
// - * * *
// * * * *