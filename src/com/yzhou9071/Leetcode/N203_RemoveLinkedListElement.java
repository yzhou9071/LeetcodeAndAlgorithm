package com.yzhou9071.Leetcode;

public class N203_RemoveLinkedListElement {
	public ListNode removeElements(ListNode head, int val) {			
        while (head != null && head.val == val)
            head = head.next;
        
		if(head == null)
			return head;

		ListNode tmp = head;
		while(tmp.next != null){
			if(tmp.next.val == val)
				tmp.next = tmp.next.next;
			else
		        tmp = tmp.next;
		}
		return head;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
