package Lec7;

public class Array_Swap_1 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 7};
		int[] arr1 = new int [] {2, 3, 4, 5, 7};
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}
	
	public static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}
}
