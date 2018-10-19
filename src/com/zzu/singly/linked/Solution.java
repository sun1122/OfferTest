package com.zzu.singly.linked;



/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	
    public boolean hasCycle(ListNode head) {
    	if(head == null){
    		return false;
    	}
    	//1，就一个节点的链表  head.next = head;
        if(head == head.next){
        	return true;
        }
    	//快指针 每次移动2步
    	ListNode fast = head.next;
        //慢指针 
        ListNode slow = head;
        
        while(fast != null && fast.next !=null){
        	fast = fast.next.next;
        	slow = slow.next;
        	if(fast == slow){
        		return true;
        	}
        }
    	return false;
    }
    
    
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {// slow = fast时
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    
    /**
     * 节点内部类
     * @author Administrator
     * @date   2018年10月15日
     */
    private static class ListNode {
 	   //当前值
        int val;
        //下一节点引用
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}