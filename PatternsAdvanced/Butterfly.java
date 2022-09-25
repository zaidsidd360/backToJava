package PatternsAdvanced;

public class Butterfly {
    public static void main(String[] args) {
        int n = 4;
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int s = 1; s <= (2 * n) - (2 * i); s++) {
                System.out.print(" "); 
            }
            // Right half
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = 1; i <= n; i++) {
            // Left half
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int s = 1; s <= (i - 1) * 2; s++) {
                System.out.print(" "); 
            }
            // Right half
            for (int k = 1; k <= n + 1 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// OUTPUT
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
