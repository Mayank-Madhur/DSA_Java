package Lec14;

public class Freq_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="codingblocks";
		int [] freq = new int[26];
		for(int i=0; i<s.length(); i++) { 
			char ch = s.charAt(i);
			freq[ch - 97]++;//freq[ch-97]= freq[ch-97]+1;
		}
	}

}
 