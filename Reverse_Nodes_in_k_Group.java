package Lec28;
import java.util.Stack;
public class Reverse_Nodes_in_k_Group {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			Stack<ListNode> st = new Stack<>();
			ListNode dummy = new ListNode();
			ListNode temp = dummy;
			ListNode prev = head;
			while (head != null) {
				// stack me k element add krna
				int c = 0;
				while (head != null && c < k) {
					st.push(head);
					head = head.next;
					c++;
				}

				// reverse attach krna
				if (c == k) {
					while (!st.isEmpty()) {
						dummy.next = st.pop();
						dummy = dummy.next;
					}
					  dummy.next=null;
				}
				else {
					dummy.next=prev;
				}
				prev = head;

			}
			return temp.next;

		}
	}

}