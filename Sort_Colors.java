package Lec10;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arr= {2,0,2,1,1,0};
			Sort(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]+" ");
			}
	}
	public static void Sort(int[] arr) {
		int lo=0;//0
		int hi=arr.length-1;//2
		int i = 0;//pure array pe jaayega
		while(i<=hi) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i] = arr[lo];
				arr[lo] = temp;
				lo++;
				i++;
			}else if (arr[i]==2) {
				int temp = arr[i];
				arr[i] = arr[hi];
				arr[hi] = temp;
				hi--;
			}
			else {
				i++;
			}
		}
	}

}
