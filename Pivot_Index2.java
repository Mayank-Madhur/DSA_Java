package Lec7;

public class Pivot_Index2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		System.out.println(Pivot_Index(arr));

	}

	public static int Pivot_Index2(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int left=0;
		for (int i = 0; i < arr.length; i++) {
			int right=sum-left-arr[i];
			if(left==right) {
				return i;
			}
			left+=arr[i];// next time ke liye
		}
		return -1;
	}

	public static int Pivot_Index(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 0;
		for (int i = 1; i < n; i++) {// prefix
			left[i] = left[i - 1] + arr[i - 1];
		}
		right[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {// suffix
			right[i] = right[i + 1] + arr[i + 1];
		}

		// calculation
		for (int i = 0; i < n; i++) {
			if (left[i] == right[i]) {
				return i;
			}
		}
		return -1;

	}

}


