package Lec28;
import java.util.*;
public class Queue_Using_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList<Integer> q= new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(10);//Add Last
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.remove());// remove first
		System.out.println(q.poll());//remove first
		System.out.println(q.peek());//get first
	}

}
