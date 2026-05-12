
package Lec36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(Anagrams(arr));

	}

	public static List<List<String>> Anagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < strs.length; i++) {
			String key = Key_Anagrams(strs[i]);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(strs[i]);

		}
		List<List<String>> ll = new ArrayList<>();
		for (String s : map.keySet()) {
			ll.add(map.get(s));

		}
		return ll;
	}

	public static String Key_Anagrams(String str) {
		int [] freq= new int [26];
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			freq[ch-'a']++;
		}
		StringBuilder sb  = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]+" ");
		}
		return sb.toString();

	}
}
