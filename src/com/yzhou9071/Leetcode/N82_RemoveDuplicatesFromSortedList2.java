package com.yzhou9071.Leetcode;

public class N82_RemoveDuplicatesFromSortedList2 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode ret = new ListNode(0);
		ListNode tail = ret;
		for(ListNode cur=head,pre=null;cur!=null;pre=cur,cur=cur.next){
			if((pre==null || pre.val!=cur.val)
					&& (cur.next==null || cur.next.val!=cur.val)){
				tail.next = cur;
				tail = cur;
			}
		}
		
		tail.next = null;
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
