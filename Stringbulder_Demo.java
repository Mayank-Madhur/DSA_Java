package Lec35;

public class Stringbulder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("hello");
		sb.append(false);
		sb.append(10);
		sb.append(201);
		sb.append('a');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append('a');
		System.out.println(sb.capacity());
		System.out.println(sb.substring(1,3));
		System.out.println(sb.charAt(1));
		StringBuilder sb1 = new StringBuilder();
		sb1.append("hello");
		sb1.append(false);
		sb1.append(10);
		System.out.println(sb.compareTo(sb1));
		String s=sb.toString();
		StringBuilder sb2= new StringBuilder(s);
	}

}