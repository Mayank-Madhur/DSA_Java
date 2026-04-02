package Lec7;

public class Revesre_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
		Reverse(arr);
		for (int i =  0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	}
	public static void Reverse(int[] arr) {
		 int i = 0;
		 int j = arr.length;
		 while(i<j) {
			 int temp=arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			 i++;
			 j--;
			 
		 }
		
			
		}
	}

