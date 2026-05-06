package Lec16;

public class Count_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		Subsequence(s,"");
		System.out.println("\n"+c);
	}
	static int c = 0;
	public static void Subsequence(String s, String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
			c++;
			return;
			
		}
		char ch = s.charAt(0);
		Subsequence(s.substring(1), ans);
		Subsequence(s.substring(1), ans + ch);
		
	}

}

		 	
//		String s="abc";
//		Subsequence(s,"");
//		System.out.println("\n"+c);
//	}
//	static int c = 0;
//	public static void Subsequence(String s, String ans) {
//		if(s.length()==0) {
//			System.out.print(ans+" ");
//			c++;
//			return;
//			
//		}
//		char ch = s.charAt(0);
//		Subsequence(s.substring(1), ans);
//		Subsequence(s.substring(1), ans + ch);
//		
//	}
//
//}
