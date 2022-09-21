package PatternsBasic;

public class SolidRectangle {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

// OUTPUT
// *****
// *****
// *****
// *****