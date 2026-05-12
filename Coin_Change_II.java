package Lec41;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[arr.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(arr, amount, 0, dp));
		System.out.println(Coin_Change(arr, amount));
	}

	public static int Coin_Change(int[] arr, int amount) {
		int[][] dp = new int[arr.length+1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < dp.length; i++) {//coin
			for (int am = 1; am < dp[0].length; am++) {
				int inc = 0, exc = 0;
				if (am >= arr[i-1]) {
					inc = dp[i][am-arr[i-1]];
				}
				exc = dp[i-1][am];
				 dp[i][am] = inc + exc;
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}

	public static int Coin_Change(int[] arr, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == arr.length) {
			return 0;
		}
		if (dp[i][amount] != -1) {
			return dp[i][amount];
		}
		int inc = 0, exc = 0;
		if (amount >= arr[i]) {
			inc = Coin_Change(arr, amount - arr[i], i, dp);
		}
		exc = Coin_Change(arr, amount, i + 1, dp);
		return dp[i][amount] = inc + exc;

	}
}