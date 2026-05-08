package Lec21;

public class Power_Log_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int n = 5;
		System.out.println(pow(a, n));
	}

	public static int pow(int a, int n) {
		if (n == 0) {
			return 1;
		}

		int half = pow(a, n / 2);
		half *= half;
		if (n % 2 != 0) {
			half *= a;
		}
		return half;
	}

}
