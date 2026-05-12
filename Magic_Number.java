package Lec45;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Number(n));
	}
	public static int Number(int n) {
		int mul = 5;
		int ans = 0;
		while(n > 0) {
			if((n & 1) == 1) {
				ans = ans + mul;
			}
			mul = mul * 5;
			n >>= 1;
		}
		return ans;
	}

}
