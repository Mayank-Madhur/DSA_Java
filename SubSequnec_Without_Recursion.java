package Lec45;

public class SubSequnec_Without_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		print(s);

	}

	public static void print(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			Pattern(s, i);
		}
	}

	private static void Pattern(String s, int i) {
		// TODO Auto-generated method stub
		String ans = "";
		int pos = 0;
		while (i > 0) {
			if ((i & 1) == 1) {
				ans += s.charAt(pos);
			}
			i >>= 1;
			pos++;
		}
		System.out.println(ans);

	}

}