// You are given an m x n integer matrix matrix with the following two properties:
// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.
// You must write a solution in O(log(m * n)) time complexity.

package LeetCode.Medium;

public class SearchMatrix { // 74
    // Time Complexity: O(m*n)
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    // Time Complexity: O(n+m)
    public static boolean searchMatrix2(int[][] matrix, int target) {
        int low = 0;
        int high = matrix[0].length - 1;
        while (low < matrix.length && high >= 0) {
            if (matrix[low][high] == target)
                return true;
            else if (matrix[low][high] > target)
                high--;
            else
                low++;
        }
        return false;
    }

    public static void main(String[] args) {
        int m[][] = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 } };

        int target = 3;
        System.out.println(searchMatrix2(m, target));
    }
}
