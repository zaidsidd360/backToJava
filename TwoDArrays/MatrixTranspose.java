package TwoDArrays;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int tdarr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter (" + i + "," + j + "): ");
                tdarr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given Matrix: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(tdarr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the given matrix: ");

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(tdarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
