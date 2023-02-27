/*
 * In MATLAB, there is a handy function called reshape which can 
 * reshape an m x n matrix into a new one with a different size r x c 
 * keeping its original data. You are given an m x n matrix mat and 
 * two integers r and c representing the number of rows and the number 
 * of columns of the wanted reshaped matrix. The reshaped matrix should 
 * be filled with all the elements of the original matrix in the same 
 * row-traversing order as they were. If the reshape operation with 
 * given parameters is possible and legal, output the new reshaped matrix; 
 * Otherwise, output the original matrix.
 * */

package LeetCode.Easy;

public class ReshapeMatrix { // 566
	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		if (mat.length * mat[0].length != r * c)
			return mat;
		int res[][] = new int[r][c];
		int rowRes = 0;
		int colRes = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				res[rowRes][colRes] = mat[i][j];
				colRes++;
				if (colRes == c) {
					colRes = 0;
					rowRes++;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int r = 2, c = 3;
		int ans[][] = matrixReshape(mat, r, c);
		for (int[] row : ans) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
