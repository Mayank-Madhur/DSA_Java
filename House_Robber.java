package Lec40;

import java.util.*;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 7, 9, 3, 1};
		int [] dp = new int [arr.length];
		Arrays.fill(dp, -1);
		//System.out.println(Robber(arr, 0, dp));
		System.out.println(Robber2(arr, arr.length-1, dp));
	}
	public static int Robber2(int []arr ,int i, int[] dp) {
		if(i < 0) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i]; 
		}
		int rob = arr[i] + Robber2(arr, i - 2, dp);
		int dont_rob = Robber2(arr, i - 1, dp); 
		
		return dp[i] = Math.max(rob, dont_rob);
		
	}
	public static int Robber(int []arr ,int i, int[] dp) {
		if(i >= arr.length) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i]; 
		}
		int rob = arr[i] + Robber(arr, i + 2, dp);
		int dont_rob = Robber(arr, i + 1, dp); 
		
		return dp[i] = Math.max(rob, dont_rob);
		
	}

}
  