package Lec42;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -666666);
		}
		int ans = Integer.MAX_VALUE;
		for (int j = 0; j < matrix[0].length; j++) {
			ans = Math.min(ans, Falling_Path_Sum(matrix, 0, j, dp));
		}
		System.out.println(ans);
	}

	public static int Falling_Path_Sum(int[][] matrix, int i, int j, int[][] dp) {
		if (i == matrix.length - 1) {
			return matrix[i][j];
		}
		if (dp[i][j] != -666666) {
			return dp[i][j];
		}
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < matrix[0].length; col++) {
			if (col != j) {
				ans = Math.min(ans, Falling_Path_Sum(matrix, i + 1, col, dp));
			}
		}
		return dp[i][j] = ans + matrix[i][j];

	}

}