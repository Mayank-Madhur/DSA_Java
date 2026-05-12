package Lec42;

import java.util.Arrays;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		int [][] dp = new int [grid.length][grid[0].length];
		for(int [] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Path_Sum(grid, 0, 0, dp));
	}
	public static int Path_Sum(int [][] grid, int i, int j, int [][] dp) {
		if(i == grid.length-1 && j == grid[0].length-1) {
			return grid[i][j];
		}
		if(i >= grid.length || j >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if(dp[i][j] != -1){
			return dp[i][j];
		}
		int v = Path_Sum(grid, i + 1, j, dp);
		int h = Path_Sum(grid, i, j + 1, dp);
		return dp[i][j] = Math.min(v, h) + grid [i][j];
	}

}
