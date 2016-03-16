package com.yzhou9071.Leetcode;

public class N86_PartitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode leftNode = new ListNode(0);
		ListNode rightNode = new ListNode(x);
		leftNode.next = head;
		ListNode left = leftNode;
		ListNode right = rightNode;
		ListNode curNode = head;
		
		while(curNode != null){
			ListNode tmp = curNode.next;
			if(curNode.val < x){
				left.next = curNode;
				left = left.next;
			}else{
				right.next = curNode;
				right = right.next;
				right.next = null;
			}
			curNode = tmp;
		}
		left.next = rightNode.next; 
		
		return leftNode.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
