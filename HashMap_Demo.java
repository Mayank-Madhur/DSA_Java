package Lec35;
import java.util.*;
public class HashMap_Demo {

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
//		// get
//		System.out.println(map.get("Kamlesh"));
//		System.out.println(map.get("Amisha"));
//		// Containskey
//		System.out.println(map.containsKey("Kamlesh"));
//		System.out.println(map.containsKey("Amisha"));
//		// remove
//		System.out.println(map.remove("Kamlesh"));
//		System.out.println(map.remove("Ankita"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 78);
		map1.put("Ankit", 67);
		map1.put("Mahesh", 89);
		map1.put("Kunal", 78);
		map1.put("Pooja", 90);
		map1.put("Amisha", 58);
		map1.put("Shiva", 43);
		map1.put("Ankita", 34);
		map1.put("Pooja", 88);
//		map.put(null, 17);
		System.out.println(map1);
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 78);
		map2.put("Ankit", 67);
		map2.put("Mahesh", 89);
		map2.put("Kunal", 78);
		map2.put("Pooja", 90);
		map2.put("Amisha", 58);
		map2.put("Shiva", 43);
		map2.put("Ankita", 34);
		map2.put("Pooja", 88);
//		map.put(null, 17);
		System.out.println(map2);
		// key
		System.out.println(map.keySet());
		Set<String> set = map.keySet();
		for(String k:set) {
			System.out.println(k+" "+map.get(k));
		}
	}

}
