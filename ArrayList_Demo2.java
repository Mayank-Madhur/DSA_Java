package Lec14;
import java.util.ArrayList;
public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(19);
		list.add(31);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(int x:list) {
			System.out.print(x+" ");
		}
		System.out.println();
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
	}

}
