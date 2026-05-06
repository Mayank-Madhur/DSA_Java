package Lec15;

public class Recursion_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println(fact(n));
	}
	public static int fact(int n) {
		int x=fact(n-1);
		return x*n;
	}

}
