package com.zzu.offer;

public class SinglyLinked {

    public ListNode ReverseList(ListNode head) {
      if( head == null || head.next == null){
          return head;
      }
      ListNode preNode = null;
      ListNode curNode = head;

      while (curNode != null){
          //暂存当前节点的下一个地址
          ListNode nextTemp = curNode.next;
          //当前节点指向前节点
          curNode.next = preNode;
         //当前节点变为前置节点
          preNode = curNode;
          //下一个节点变为当前节点
          curNode = nextTemp;

      }
      return preNode;

    }

}
