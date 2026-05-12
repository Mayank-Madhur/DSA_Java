package Lec45;

public class Check_IthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i = 3;
		int mask=(1<<i);
		if((n&mask)==0) {
			System.out.println("Un set bit");
		}
		else {
			System.out.println("Set bit ");
		}
	}

}