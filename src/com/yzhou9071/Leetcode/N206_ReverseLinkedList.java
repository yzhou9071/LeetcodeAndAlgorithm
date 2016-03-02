package com.yzhou9071.Leetcode;

public class N206_ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode tmp = null;
        while(head != null){
        	tmp = head.next;
        	head.next = prev;
        	prev = head;
        	head = tmp;
        }
        
        return prev;
    }
	
	public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
