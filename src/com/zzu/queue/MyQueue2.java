package com.zzu.queue;

import java.util.Stack;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class MyQueue2 {
    private Stack<Integer> stack1 = null;
    private Stack<Integer> stack2 = null;

    //private int head;

    /**
     * Initialize your data structure here.
     */
    public MyQueue2() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {

        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
     peek();
     return stack2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        // 先判断stack2是否为空
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {

        return  stack1.isEmpty() && stack2.isEmpty();
    }
}

