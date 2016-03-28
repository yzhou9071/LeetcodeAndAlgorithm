package com.yzhou9071.Leetcode;

public class N92_ReverseLinkedList2 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode start = new ListNode(0);
		start.next = head;
		ListNode prev = start, curr = head;
		int count = 1;

		while (curr != null) {
			if (count == m) {
				ListNode prev2 = null;
				ListNode curr2 = curr;
				ListNode tmp;

				while (count <= n && curr2 != null) {
					tmp = curr2.next;
					curr2.next = prev2;
					prev2 = curr2;
					curr2 = tmp;
					count++;
				}

				prev.next = prev2;
				curr.next = curr2;
				break;
			}

			prev = curr;
			curr = curr.next;
			count++;
		}
		return start.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
