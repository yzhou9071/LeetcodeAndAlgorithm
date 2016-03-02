package com.yzhou9071.Leetcode;

public class N328_OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return head;

		ListNode evenHead = head.next;
		ListNode oddNode = head;
		ListNode tmp = head;
		int index = 1;

		while (true) {
			if ((index & 1) == 1)
				oddNode = tmp;

			if (tmp.next == null) {
				oddNode.next = evenHead;
				break;
			}

			ListNode tmpNext = tmp.next;
			tmp.next = tmp.next.next;
			tmp = tmpNext;
			index++;
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
