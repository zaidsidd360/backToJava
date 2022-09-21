package PatternsBasic;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int m = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = m; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// OUTPUT
// ****
// ***
// **
// *