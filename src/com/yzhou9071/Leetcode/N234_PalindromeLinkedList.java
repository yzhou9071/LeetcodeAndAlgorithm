package com.yzhou9071.Leetcode;

public class N234_PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null)
			return true;
		
		ListNode memHead = head;
		int len = 0;
		while(head != null){
			++len;
			head = head.next;
		}
		head = memHead;
		
		for(int i=0;i<(len+1)/2;i++)
			head = head.next;
		
		ListNode tail = head.next;
		head.next = null;
		ListNode tmp;
		while(tail != null){
			tmp = tail.next;
			tail.next = head;
			head = tail;
			tail = tmp;
		}
		
		while(head != null && memHead != null){
			if(head.val == memHead.val){
				head = head.next;
				memHead = memHead.next;
			}else
				return false;
		}
		
		return true;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
