package Lec7;

public class Pivot_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		System.out.println(Pivot_Index(arr));

	}

	public static int Pivot_Index(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int leftsum = sum(arr, 0, i - 1);
			int rightsum = sum(arr, i + 1, arr.length - 1);
			if (leftsum == rightsum) {
				return i;
			}

		}
		return -1;
	}

	public static int sum(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int ans = 0;
		for (int k = i; k <= j; k++) {
			ans = ans + arr[k];

		}
		return ans;
	}

} 