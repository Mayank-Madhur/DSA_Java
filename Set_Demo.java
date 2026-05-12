package Lec35;
import java.util.*;
public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		// add
		set.add(26);
		set.add(15);
		set.add(9);
		set.add(-29);
		set.add(6);
		set.add(7);
		set.add(26);
		System.out.println(set);
//		// remove
//		System.out.println(set.remove(26));
//		System.out.println(set.remove(2));
//		// contains
//		System.out.println(set.contains(15));
//		System.out.println(set.contains(2));
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(26);
		set1.add(15);
		set1.add(9);
		set1.add(-29);
		set1.add(6);
		set1.add(7);
		set1.add(26);
		System.out.println(set1);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(26);
		set2.add(15);
		set2.add(9);
		set2.add(-29);
		set2.add(6);
		set2.add(7);
		set2.add(26);
		System.out.println(set2);
		
		for(int x:set) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x: set1) {
			System.out.print(x+" ");
		}
	}

}
