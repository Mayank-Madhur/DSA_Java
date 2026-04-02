package Lec7;

public class Maximum_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9 };
		System.out.println(Maximum(arr));
	}
	public static int Maximum(int[] arr) {
		int	max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
