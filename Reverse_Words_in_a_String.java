package Lec14;

import java.util.Arrays;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  the sky is blue  ";
		s=s.trim();
		String [] arr = s.split(" +");//regex 
//		System.out.println(Arrays.toString(arr));
		String ans="";
		for(int i=arr.length-1; i>=0; i--) {
			ans+=arr[i]+" ";
		}
		ans=ans.trim();
		System.out.println(ans);
	}

}
