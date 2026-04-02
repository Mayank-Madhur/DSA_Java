package Lec13;
import java.util.Scanner;

public class String_Demo2 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		s1= s1+"Bye"; 
		//s1.concat("bye");// two string add hota hai 
		String s4="hello"+"Bye";
		System.out.println(s1.charAt(2));
	}
}