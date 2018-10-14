package com.zzu.singly.linked;



/**
 * 手写单链表
 * @author Administrator
 * @date   2018年10月14日
 */
public class SinglyList2 {
   
   public static void main(String[] args) {
	 Node n5 = new Node(5,null);
	 Node n4 = new Node(4,n5);
	 Node n3 = new Node(3,n4);
	 Node n2 = new Node(2,n3);
	 Node n1 = new Node(1,n2);
	 
	 Node head = reverseList(n1);
	 System.out.println(head.item);
	 
   }
   
   /**
    * 单链表反转 迭代实现
    * @param <E>
    * @param head
 * @return 
    * @return
    */
   public static Node reverseList(Node head) {
	//链表为空 或者 就一个 头节点
	if(head == null || head.next == null){
		return head;
	}
	//当前节点
	Node currentNode = head;
	//保存当前节点上一个节点,前置节点 ---头结点为空  ：带头的单链表
	Node preNode = null;
	
	//迭代到尾节点
	while(currentNode !=null){
		//暂存当前节点的下一个地址
		Node nextNode = currentNode.next;
		//当前节点指向前节点
		currentNode.next = preNode;
		//当前节点变为前置节点
		preNode = currentNode;
		//下一个节点变为当前节点
		currentNode = nextNode;
	}
    //可以理解为带头单链表
    return preNode;

   
   }
   /**
    * 节点内部类
    * @author Administrator
    * @date   2018年10月14日
    */
   private static class Node {
	   //当前值
       int item;
       //下一节点引用
       Node next;

       Node(int element, Node next) {
           this.item = element;
           this.next = next;
       }
   }
}