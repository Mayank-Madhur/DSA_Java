package Lec42;
import java.util.*;
public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "Money";
		int [][] dp = new int[s.length()][t.length()];
		for(int []a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Mini_Opps(s, t, 0, 0, dp));
	}
	public static int Mini_Opps(String s, String t, int i, int j, int [][]dp) {
		if(i == s.length()) {
			return t.length()-j;
		}
		if(j == t.length()) {
			return s.length()-i;
		}
		if(dp[i][j]!= -1) {
			return dp[i][j];
		}
			
		int ans = 0;
		if(s.charAt(i) == t.charAt(j)) {
			ans = Mini_Opps(s, t, i + 1, j + 1, dp);
		}
		else {
			int D = Mini_Opps(s, t, i + 1, j, dp);
			int R = Mini_Opps(s, t, i + 1, j + 1, dp);
			int I = Mini_Opps(s, t, i, j + 1, dp);
			ans = Math.min(I, Math.min(R, D))+1;
			
		}
		return dp[i][j] = ans;
	}

}
