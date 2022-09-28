package TwoDArrays;

import java.util.Scanner;

class FindIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        boolean isPresent = false;

        int tdarr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter (" + i + "," + j + "): ");
                tdarr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the value you want to find: ");
        int value = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (tdarr[i][j] == value) {
                    isPresent = true;
                    System.out.println(value + " is present at " + "(" + i + "," + j + ")");
                }
            }
        }
        if (!isPresent)
            System.out.println(value + " is NOT present in the given matrix.");
    }
}