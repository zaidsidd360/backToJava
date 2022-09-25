package PatternsAdvanced;

public class PalindromicNumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // First half
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Second half
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

// OUTPUT
//     1
//    212
//   32123
//  4321234
// 543212345
