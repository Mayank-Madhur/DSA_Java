package Lec7;

public class Array_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 7};
		int[] arr1 = new int [] {2, 3, 4, 5, 7};
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr, 0, 1);
		System.out.println(arr[0] +" " + arr[1]);
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
