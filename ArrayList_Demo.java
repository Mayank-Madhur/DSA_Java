package Lec14;
import java.util.*;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();//default value of ArratList capacity is 10 and size is 0
		System.out.println(list);
		// add
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(19);
		list.add(31);
		System.out.println(list);
		list.add(0, -7);//index ka range 0 to size
		System.out.println(list);
		System.out.println(list.size());
		//get
		System.out.println(list.get(1));
		//remove
		list.remove(2);
		System.out.println(list);
		//update
		list.set(3, -9);    
		System.out.println(list);
		Collections.sort(list);
		//sort
		System.out.println(list);
		
	}

}
