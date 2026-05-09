package Lec31;

public class Binary_Search_tree {
	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;

	public Binary_Search_tree(int[] in) {
		// TODO Auto-generated constructor stub
		root = createTree(in, 0, in.length - 1);
	}

	private Node createTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node(in[mid]);
		nn.left = createTree(in, si, mid - 1);
		nn.right = createTree(in, mid + 1, ei);
		return nn;

	}
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int r =max(nn.right);
		return Math.max(r, nn.val);
		
	}

}