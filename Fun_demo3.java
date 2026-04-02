package Lec6;

public class Fun_demo3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 7;
		int b = 9;
		System.out.println(val);
		System.out.println(add(b, a));
		System.out.println(val);
		System.out.println("Bye");
	}

	public static int add(int a, int b) {
		int c = a + b;
		int val = 70;
		Fun_demo3.val = Fun_demo3.val - 5;
		return c;
	}

}
