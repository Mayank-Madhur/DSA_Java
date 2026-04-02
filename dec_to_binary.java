package Lec5;

public class dec_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 300;
		int mul=1;
		int sum=0;
		while(n>0) {
			int rem = n % 2;
			sum = sum + rem * mul;
			n = n / 2 ;
			mul = mul * 10;
		}
		System.out.println(sum);
	}

}
