package Lec36;

import java.util.HashMap;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 78);
		map.put("Ankit", 67);
		map.put("Mahesh", 89);
		map.put("Kunal", 78);
		map.put("Pooja", 90);
		map.put("Amisha", 58);
		map.put("Shiva", 43);
		map.put("Ankita", 34);
		map.put("Pooja", 88);
//		map.put(null, 17);
		System.out.println(map);
	}

}
