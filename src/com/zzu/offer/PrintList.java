package com.zzu.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class PrintList {


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> out = new ArrayList<>();
        //LinkedList<Integer> stack = new LinkedList<>();
        Stack<Integer> stack = new Stack<Integer>();

        while(listNode != null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }

        while(!stack.isEmpty()){
            out.add(stack.pop());
        }
        return out;
    }






    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
         next = null;
      }
  }
}
