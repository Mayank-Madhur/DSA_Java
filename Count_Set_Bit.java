package Lec45;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 78;

	}

	public static int Fast_Count_Bit(int n) {
		int c = 0;
		while (n > 0) {
			n = n & (n - 1);
			c++;
		}
		return c;
	}

	public static int Count_Bit(int n) {
		int c = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				c++;
			}
			n >>= 1;
		}
		return c;
	}

}