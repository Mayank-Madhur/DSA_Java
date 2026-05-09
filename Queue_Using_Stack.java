package Lec26;

import java.util.Stack;

public class Queue_Using_Stack {

	private Stack<Integer> st;

	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		st = new Stack<>();
	}

	// O(N)
	public void Eneueue(int x) {
		Stack<Integer> hlp = new Stack<>();
		while (st.size() > 0) {
			hlp.push(st.pop());
		}
		st.push(x);
		while (hlp.size() > 0) {
			st.push(hlp.pop());
		}
	}

	public int Dequeue() {
		return st.pop();
	}

	public int getfront() {
		return st.peek();
	}

}