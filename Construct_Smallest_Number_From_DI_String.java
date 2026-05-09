package Lec26;
import java.util.*;
public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";

	}

	public static String Smallest_Number_From_DI(String s) { 
		int[] arr = new int[s.length() + 1];
		int c = 1;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) == 'I') {
				arr[i] = c++;
				while (!st.isEmpty()) {
					arr[st.pop()] = c++;
				}
			} else {
				st.push(i);
			}

		}
		String ans="";
		for (int i = 0; i < arr.length; i++) {
			ans=ans+arr[i];
		}
		return ans;

	}

}