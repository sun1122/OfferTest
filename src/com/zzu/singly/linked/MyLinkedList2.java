package com.zzu.singly.linked;



/**
 * 手写单链表
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