package Lec13;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello"); 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1==s2);// address compare kr rahe hain
		System.out.println(s3==s2);// address compare kr rahe hain
		System.out.println(s3==s4);// address compare kr rahe hain
		System.out.println(s1.equals(s4));//content compare kr rahe hain
		System.out.println(s1.length());//inbuilt method
		     

	}

}
