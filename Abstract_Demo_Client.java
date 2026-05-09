package Lec32;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Abstract_Demo1 ab = new Abstract_Demo1();
		Abstract_Demo2 ab = new Abstract_Demo2();
		Abstract_Demo1.a1=9;
		Abstract_Demo1 ab1 = new Abstract_Demo1() {

			@Override
			public boolean Pay() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}
			
		};
//		Abstract_Demo1 ab2 = new Abstract_Demo1() {
//			
//			@Override
//			public boolean Pay() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
		

	}

}