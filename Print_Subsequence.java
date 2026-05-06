package Lec16;

public class Print_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		Subsequence(s,"");
	}
	public static void Subsequence(String s, String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
			
		}
		char ch = s.charAt(0);
		Subsequence(s.substring(1), ans);
		Subsequence(s.substring(1), ans + ch);
	}
 
}
 