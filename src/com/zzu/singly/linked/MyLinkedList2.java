package com.zzu.singly.linked;



/**
 *   手写单链表 leetcode 707设计单链表 通过
 * 
 * 
 * 
 *   设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 *
 *    在链表类中实现这些功能：
 *
 *   get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 *   addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 *   addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 *   addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。
 *   deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 * 
 * @author Administrator
 * @date   2018年10月17日
 */
public class MyLinkedList2 {
   
  
   //带头的节点
   public Node head;
   //链表长度
   public int size;
   
   /** Initialize your data structure here. */
   public MyLinkedList2() {
       this.head = new Node(0,null);
       this.size = 0;
   }
   
   /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
   public int get(int index) {
       if(index > size  || index < 0 ){
    	   return -1;
       }
       
	   Node x = this.head.next;//头节点位置
       for (int i = 0; x!=null && i < index; i++) {//x!=null &&
		    x = x.next;
       }
       return x!=null ?  x.val : -1;
       
   }
   
   /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
   public void addAtHead(int val) {
	   
	   Node newNode = new Node(val,null);
	   if(this.head.next== null){//空表
		   this.head.next = newNode;
		   size++;
	   }else{
		   newNode.next = this.head.next;
		   this.head.next=newNode;
		   size++;
	   }
   }
   
   /** Append a node of value val to the last element of the linked list. */
   public void addAtTail(int val) {
	   
	   Node newNode = new Node(val,null);
	   if(this.head.next== null){//空表
		   this.head.next = newNode;
		   size++;
	   }else{
		   Node last = this.head;//带头的节点 
		   while(last.next!=null){
			   last=last.next;
		   }
		   last.next=newNode;
		   size++;
	   } 
   }
   
   /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
   public void addAtIndex(int index, int val) {
	   //如果索引大于长度，则不会插入节点
	   if(index >= 0 && index <= size){
		   
		   if (index == size){
			   addAtTail(val);
		   }else{
			   Node last = this.head;// i-1位置
			   
			   for (int i = 0; i < index; i++) {
				   last = last.next;   
			   }
			   Node newNode = new Node(val,null);
			   newNode.next = last.next;
			   last.next = newNode;
			   size++;
		   }   
		   
	   }
	   
	  
   }
   
   /** Delete the index-th node in the linked list, if the index is valid. */
   public void deleteAtIndex(int index) {
	   
	   if(index >= 0 && index < size){
		   
		   Node last = this.head;//i-1位置
		   
		   for (int i = 0; i < index; i++) { //2
			   last = last.next;   
		   }
		   
		   if(last.next.next == null){//末尾删除
	    	   last.next=null;
	    	   size--;
		   }else{
			   last.next = last.next.next;
			   size--;
		   }
		  
	   }   
	   
   }
   
   /**
    * 节点内部类
    * @author Administrator
    * @date   2018年10月15日
    */
   private static class Node {
	   //当前值
       int val;
       //下一节点引用
       Node next;

       Node(int val, Node next) {
           this.val = val;
           this.next = next;
       }
   }
}