package Lec24;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 5));
		System.out.println(add(2, 5, 9));
		System.out.println(add(2.9, 5, 9));
		System.out.println(add(2, 3, 5, 6, 8, 1, 2, 4, 65, 7, 3, 3, 34));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(double a, int b, int c) {
		return (int) (a + b + c);
	}

	public static int add(int x,int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
