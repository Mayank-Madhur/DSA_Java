package Lec9;

public class Kadanes_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(MaximumSum(arr));

	}

	public static int MaximumSum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int currsum = 0;
		for (int i = 0; i < arr.length; i++) {
			currsum += arr[i];
			ans = Math.max(ans, currsum);// 
			if(currsum<0) {
				currsum=0;
			}

		}
		return ans;
	}

}
