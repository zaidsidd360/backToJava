// You are given an n x n 2D matrix representing an image, 
// rotate the image by 90 degrees (clockwise). You have to 
// rotate the image in-place, which means you have to modify 
// the input 2D matrix directly. DO NOT allocate another 2D 
// matrix and do the rotation.

// Sample Input:                // Expected Output:
// [[1,  2,  3],                // [[7,  4,  1],
//  [4,  5,  6],        =>      //  [8,  5,  2],
//  [7,  8,  9]]                //  [9,  6,  3]]

package LeetCode.Medium;

public class RotateImage { // 48
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
    }

    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverseRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int k = matrix[0].length - 1;
            int j = 0;
            while (j < k) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
