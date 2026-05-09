package Lec23;
import java.util.Stack;
public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.size());
		System.out.println(st.capacity());
		// add
		st.push(10);// O(1)
		st.push(20);
		st.push(7);
		st.push(5);
		st.push(3);
		st.push(9);
		System.out.println(st);
		// get only peek
		System.out.println(st.peek());// view // O(1)
		// delete 
		System.out.println(st.pop());// O(1)
		System.out.println(st);
		for(int x:st) {
			System.out.print(x+" ");
		}
		System.out.println();

	}

}
