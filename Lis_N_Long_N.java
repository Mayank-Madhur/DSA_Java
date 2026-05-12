package Lec42;

public class Lis_N_Long_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0, 8, 4}; 
	}
	public static int LIS(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		int len = 1;
		for(int i = 1; i < arr.length; i++) {
			if(dp[len-1] < arr[i]) {
				dp[len] = arr[i];
			len++;
		}else {
			int idx = Binarysearch(dp, 0, len - 1, arr[i]);
			dp[idx] = arr[i];
		}
		}
		return len;
	}
	private static int Binarysearch(int[] dp, int si, int ei, int item) {
		int ans = 0;
		while(si <= ei) {
			int mid = (si + ei) / 2;
			if(dp[mid] < item) {
				si = mid +1;
			}else {
				ans = mid;
				ei = mid - 1;
			}
		}
		return ans;
	}

}
