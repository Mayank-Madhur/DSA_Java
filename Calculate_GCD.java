package Lec4;

public class Calculate_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor = 36;
		int dividend = 60;
		while(dividend%divisor!=0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}

}
