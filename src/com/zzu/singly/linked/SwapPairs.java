package com.zzu.singly.linked;

public class SwapPairs {

	/**
	 * Definition for singly-linked list. public class ListNode { int val;
	 * ListNode next; ListNode(int x) { val = x; } }
	 */

	public ListNode swapPairs(ListNode head) {

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		while (head != null && head.next != null) {
			ListNode fir = head;
			ListNode sec = head.next;
			ListNode thi = head.next.next;

			pre.next = sec;
			head.next = thi;
			sec.next = fir;

			pre = fir;
			head = thi;
		}
		return dummy.next;
	}

	public ListNode swapPairs2(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode curr = head;
		ListNode pre = null;
		Boolean flag = true;

		while (curr != null && curr.next != null) {

			ListNode nextTemp = curr.next;
			curr.next = curr.next.next;
			nextTemp.next = curr;

			if (flag) {
				head = nextTemp;
				flag = false;
			}
			if (pre != null) {
				pre.next = nextTemp;
			}

			pre = curr;
			curr = curr.next;
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
