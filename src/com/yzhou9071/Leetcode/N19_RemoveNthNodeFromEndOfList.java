package com.yzhou9071.Leetcode;

public class N19_RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null)
			return null;
		ListNode ret = new ListNode(0);
		ListNode fast = ret;
		ListNode slow = ret;
		fast.next = head;
		for(int i=0;i<n+1;i++)
			fast = fast.next;
		while(fast != null){
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return ret.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
