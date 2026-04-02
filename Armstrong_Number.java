package Lec6;
import java.util.Scanner;
public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countofdigit (n));
	}
	public static int countofdigit(int n) {
		int count =0;
		while(n>0) {
			n =n/10;
			count++;
		}
		return count;
	}
}

