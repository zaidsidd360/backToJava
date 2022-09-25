package PatternsAdvanced;

public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("-"); // Use " " to see the actual pyramid in the console.
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// OUTPUT
// ----1
// ---2 2
// --3 3 3
// -4 4 4 4
// 5 5 5 5 5