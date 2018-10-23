package com.zzu.singly.linked;
/**
 * 
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 说明：不允许修改给定的链表
 * @author Administrator
 * @date   2018年10月23日
 */
public class DetectCycle {


	public ListNode detectCycle(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			//判断有环
			if (fast == slow) {
				ListNode search = head;
				while (search != slow) {
					slow = slow.next;
					search = search.next;
				}
				return search;
			}
		}
		return null;

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
