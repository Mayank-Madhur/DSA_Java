package Lec14;

public class Lenghth_Wise_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		SubString(s);
	}
	public static void SubString(String s) {
		
		for(int len=1; len<=s.length(); len++) {
			for(int j=len; j<=s.length(); j++) {
				int i=j-len;
				System.out.println(s.substring(i, j));
			}
		}
	}

}
