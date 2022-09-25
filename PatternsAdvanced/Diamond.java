package PatternsAdvanced;

public class Diamond {
    public static void main(String[] args) {
        int n = 4;
        // Upper part
        for (int i = 0; i <= n; i++) {
            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("-"); 
            }
            // Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // Lower part
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int s = 1; s <= i - 1; s++) {
                System.out.print(" "); 
            }
            // Stars
            for (int j = 1; j <= (2 * n) - (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// OUTPUT
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
