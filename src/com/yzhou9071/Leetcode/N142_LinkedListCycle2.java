package com.yzhou9071.Leetcode;

public class N142_LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null)
			return null;
		
		ListNode low = head.next;
		ListNode fast = head.next.next;
		while(low != fast){
			if(fast == null || fast.next == null)
				return null;
			low = low.next;
			fast = fast.next.next;
		}
		fast = head;
		while(fast != low){
			low = low.next;
			fast = fast.next;
		}
		return low;
	}

	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
