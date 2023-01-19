package Miscellaneous;

import java.util.Scanner;

public class MatrixReverse {
    public static void reverseMatrix(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = reverseDigits(arr[i][j]);
            }
        }
    }

    public static int reverseDigits(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev;
    }

    public static void printMatrix(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = 3;
        int col = 4;
        int matrix[][] = new int[row][col];
        System.out.println("Enter 12 numbers into the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        // Printing original matrix
        System.out.println("The original matrix is: ");
        printMatrix(matrix, row, col);
        // Reversing the matrix
        reverseMatrix(matrix, row, col);
        // Printing reversed matrix
        System.out.println("The reversed matrix is: ");
        printMatrix(matrix, row, col);
    }
}