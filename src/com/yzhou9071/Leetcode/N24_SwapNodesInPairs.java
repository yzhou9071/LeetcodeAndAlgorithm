package com.yzhou9071.Leetcode;

public class N24_SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null)
			return head;
		
		ListNode later = head.next;
		ListNode earlier = later.next;	
		
		later.next = head;
		head.next = swapPairs(earlier);
		
		return later;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
