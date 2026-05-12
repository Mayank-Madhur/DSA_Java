package Lec45;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 5, 4, 2 };
		System.out.println(SingleNumber(arr));

	}

	public static int SingleNumber(int[] arr) {
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		return xor;
	}

}