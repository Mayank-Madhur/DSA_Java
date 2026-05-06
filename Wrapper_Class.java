package Lec14;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 10;// stack
		Integer a2 = 10; // heap
		System.out.println(a1);
		System.out.println(a2);
		Long l = 8790l;
		long l1 = 8790;
		Float f = 78.7f;
		float f1 = 89;
		a2 = a1;// auto-boxing
		a1 = a2;// un-boxing
		Integer c1=78;
		Integer c2=78;
		Integer c3=178;
		Integer c4=178;
		System.out.println(c1==c2);
		System.out.println(c3==c4);
		Character ch1='a';
		Character ch2='a';
		System.out.println(ch1==ch2);
		Boolean b1=false;
		Boolean b2=false;
		System.out.println(b1==b2);

	}

}
