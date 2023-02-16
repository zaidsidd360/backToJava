// Given an m x n matrix, return all elements of the matrix in spiral order.

/*
*  Sample Input:              // Traversal:               // Expected Output:
*
*  [[1,  2,  3],                 1 → 2 → 3                 [1, 2, 3, 6, 9, 8, 7, 4, 5]
*                                        ↓                  
*   [4,  5,  6],                 4 → 5   6     
*                                ↑       ↓
*   [7,  8,  9]]                 7 ← 8 ← 9
*/

package LeetCode.Medium;

import java.util.*;

public class SpiralMatrix { // 54
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return list;

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        int left = 0;

        while (list.size() < m * n) {
            for (int i = left; i <= right && list.size() < m * n; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom && list.size() < m * n; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left && list.size() < m * n; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top && list.size() < m * n; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(spiralOrder(matrix));
    }
}
