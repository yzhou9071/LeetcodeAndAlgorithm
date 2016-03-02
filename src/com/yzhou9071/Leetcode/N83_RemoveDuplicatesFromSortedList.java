package com.yzhou9071.Leetcode;

public class N83_RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null)
        	return head;
        	
		ListNode pre = head;
		ListNode cur = head.next;
        while(cur != null){
        	if(pre.val == cur.val){
        		pre.next = cur.next;
        	    cur = cur.next;
        	}else{
        	    pre = pre.next;
        	    cur = cur.next;
        	}
        }
		
        return head;
    }  
	public class ListNode {
		int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
