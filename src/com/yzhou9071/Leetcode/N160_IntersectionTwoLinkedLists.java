package com.yzhou9071.Leetcode;

public class N160_IntersectionTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null 
				&& headB == null)
			return null;
		ListNode shortOne = headA;
		ListNode longOne = headB;
		while(shortOne != longOne){
			shortOne = (shortOne==null) ? headB : shortOne.next;
			longOne = (longOne==null) ? headA : longOne.next;
		}
		return longOne;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
