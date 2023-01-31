package Recursion;

public class PrintMatrixSpiral {
    public static int[][] matrix = {
            { 1, 2, 3, 4, 5 },
            { 6, 7, 8, 9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 }
    };
    static int m = matrix.length;
    static int n = matrix[0].length;

    public static boolean isOutOfBounds(int i, int j) {
        if (i >= m || i < 0 || j >= n || j < 0) {
            return true;
        }
        return false;
    }

    public static void printSpiral(int matrix[][], int i, int j) {
        if (isOutOfBounds(i, j))
            return;

        System.out.print(matrix[i][j] + " ");

        if (i == 0 && j < n)
            printSpiral(matrix, i, j + 1);
        if (i < m && j == n - 1)
            printSpiral(matrix, i + 1, j);
        if (i == m - 1 && j >= 0)
            printSpiral(matrix, i, j - 1);
        if (i > 1 && j == 0)
            printSpiral(matrix, i - 1, j);
        if (i == 1 && j < n - 2)
            printSpiral(matrix, i, j + 1);
        if (i == 1 && j == n - 2)
            printSpiral(matrix, i + 1, j);
        if (i == 2 && j > 1)
            printSpiral(matrix, i, j - 1);
    }

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        printSpiral(matrix, i, j);
        System.out.println();
    }
}
