package Lec7;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9 };
		int item = 5;
		System.out.println(search(arr, item));
	}
		public static int search(int[] arr, int item) {
			for(int i = 0; i < arr.length; i++){
				if(arr[i] == item) {
					return i;
				}
			}
					return -1 ;
				}
			}

