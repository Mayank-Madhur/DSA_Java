package Lec28;

public class Intersection_of_Two_Linked_Lists {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		 }
		
		public class Solution {
		    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		        ListNode a=headA;//BF
		        ListNode b=headB;//VGF
		        while (a !=b ) {
		        	if (a == null) {
		        		a = headB;//VGF
		        	}else {
		        		a = a.next;
		        	}
		        	if (b == null) {//VGF
		        		b = headA;//BF
		        	}else {
		        		b = b.next;//VGF
		        	}
		        }
		        return a;
		    }
		}

}
