package Lec15;

public class Sum_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Sum(n));

	}

	public static int Sum(int n) {
		if (n == 0) {
			return 0;
		}
		int x = Sum(n - 1);
		return x + n;

	}
}