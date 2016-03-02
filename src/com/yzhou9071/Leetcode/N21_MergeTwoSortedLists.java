package com.yzhou9071.Leetcode;

 
public class N21_MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
        	return l2;
		if(l2 == null)
            return l1;

        ListNode ret = new ListNode(0);
        ListNode tmp = ret;
        while(l1 != null && l2 != null){
        	if(l1.val < l2.val){
        		tmp.next = l1;
        		l1 = l1.next;
        	}else{
        		tmp.next = l2;
        		l2 = l2.next;
        	}
        	tmp.next.next = null;
        	tmp = tmp.next;
        }
        
        if(l1 != null)
        	tmp.next = l1;
        
        if(l2 != null)
        	tmp.next = l2;
        
        return ret.next;
    }
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
}
