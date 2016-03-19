package com.yzhou9071.Leetcode;

public class N147_InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		if(head == null 
				|| head.next == null)
			return head;
		
		ListNode sortedHead = head, sortedTail = head;
		ListNode tmpNode = null, curNode = null;
		
		head = head.next;
		sortedHead.next = null;
		while(head != null){
			tmpNode = head;
			head = head.next;
			tmpNode.next = null;
			
			if(tmpNode.val <= sortedHead.val){				
				tmpNode.next = sortedHead;
				sortedTail = sortedHead.next==null?sortedHead:sortedTail;
				sortedHead = tmpNode;
			}else if(tmpNode.val >= sortedTail.val){
				sortedTail.next = tmpNode;
				sortedTail = sortedTail.next;
			}else{
				curNode = sortedHead;
				while(curNode.next != null
						&& curNode.next.val < tmpNode.val)
					curNode = curNode.next;
				tmpNode.next = curNode.next;
				curNode.next = tmpNode;
			}
		}
		return sortedHead;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
