package Lec5;

public class bin_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 10100100;
		int mul=1;
		int sum=0;
		while(n>0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			n = n / 10 ;
			mul = mul * 2;
		}
		System.out.println(sum);
	}

}
 