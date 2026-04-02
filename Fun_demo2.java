package Lec6;

public class Fun_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 7;
		int b = 9;
//		int ans = add(b, a);
//		System.out.println(ans);
		System.out.println(add(b, a));
		System.out.println("Bye");
	}

	public static int add(int a, int b) {

		int c = a + b;
//		System.out.println(c);
		return c + sub(b, c);
	}

	public static int sub(int a, int b) {
		return a - b;

	}

}
