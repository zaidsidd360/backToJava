// Given a m x n matrix grid which is sorted in non-increasing 
// order both row-wise and column-wise, return the number of 
// negative numbers in grid.

package LeetCode.Easy;

public class NegativeCount { // 1351
    public static int findNegativeCount(int[][] grid) {
        int negCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0)
                    negCount += 1;
            }
        }
        return negCount;
    }

    public static void main(String[] args) {
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        System.out.println(findNegativeCount(grid));
    }
}
