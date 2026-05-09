package Lec32;

public class Generics_Demo {
	public static void main(String[] args) {
		Integer[] arr = { 10, 2, 4, 5, 6 };
		Display(arr);
		String[] arr1 = { "Raj", "Ankit", "Ankita", "Anku" };
		Display(arr1);
	}

	private static <T> void Display(T[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static <T> T get(T[] arr) {
		return arr[0];
	}

}