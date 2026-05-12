package Lec43;

import java.util.HashMap;

public class Tries_Contacts {
	private class Node {
		char ch;
		HashMap<Character, Node> child;
		boolean isterminal;
		int c = 1;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			child = new HashMap<>();
		}
	}

	private Node root;
	public Tries_Contacts() {
		// TODO Auto-generated constructor stub
		root = new Node('*');
	}
	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.c++;
			} else {
				Node nn = new Node(ch);
				curr.child.put(ch, nn);
				curr = nn;
			}

		}
		curr.isterminal = true;

	}
	public int startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}

		}
		return curr.c;
	}

}