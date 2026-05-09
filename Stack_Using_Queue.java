package Lec26;

import java.util.*;

public class Stack_Using_Queue {

	private Queue<Integer> q;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		q = new LinkedList<>();
	}

// o(1)
	public void push(int item) {
		q.add(item);// Equeue Method
	}

	// o(n)
	public int pop() {
		// remove dequeue
		Queue<Integer> hlp = new LinkedList<>();
		while (q.size() > 1) {
			hlp.add(q.remove());
		}
		int x = q.poll();// remove first
		while (hlp.size() > 0) {
			q.add(hlp.remove());
		}
		return x;
	}
	// o(n)
	public int peek() {
		// remove dequeue
		Queue<Integer> hlp = new LinkedList<>();
		while (q.size() > 1) {
			hlp.add(q.remove());
		}
		int x = q.poll();// remove first
		while (hlp.size() > 0) {
			q.add(hlp.remove());
		}
		q.add(x);
		return x;
	}
	public static void main(String[] args) {
		Stack_Using_Queue st = new Stack_Using_Queue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.pop());
		System.out.println(st.peek());
	}

}