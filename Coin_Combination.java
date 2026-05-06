package Lec19;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin= {2, 3, 5};
		int amount=7;
		Permutation(coin, amount, "", 0);
	}
	public static void Permutation(int [] coin, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for(int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				Permutation(coin, amount - coin[i], ans + coin[i], i);
			}
		}
	}

}
