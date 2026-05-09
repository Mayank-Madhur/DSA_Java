package Lec32;

public class LinkedList<T> {
	private class Node {
		T val;
		Node next;

		public Node(T val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void AddFirst(T item) {
		Node nn = new Node(item);
		if (size == 0) {
			head = nn;
			tail = nn;
		} else {
			nn.next = head;
			head = nn;
		}
		size++;

	}

	// O(1)
	public void AddLast(T item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node(item);
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// O(N)
	public void AddatIndex(T item, int k) {
		if (k == 0) {
			AddFirst(item);
		} else if (k == size) {
			AddLast(item);
		} else {
			Node nn = new Node(item);
			Node prev = GetNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}

	}

	// O(1)
	public int size() {
		return size;
	}

	// O(N)
	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	// O(N)
	private Node GetNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(1)
	public T getFirst() {
		return head.val;
	}

	// O(1)
	public T getLast() {
		return tail.val;
	}

	// O(N)
	public T getatIndex(int k) {
		return GetNode(k).val;
	}

	// O(1)
	public T removefirst() {
		if (size == 0) {
			throw new NullPointerException();
		}
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			temp.next = null;
		}
		size--;
		return temp.val;

	}

	// O(N)
	public T removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			Node prev = GetNode(size - 2);
			T val = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return val;

		}
	}

	public T removeatIndex(int k) {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}

	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.AddLast("Ankit");
		ll.AddLast("Kamlesh");
		ll.AddLast("Ankita");
		ll.Display();
	}

}