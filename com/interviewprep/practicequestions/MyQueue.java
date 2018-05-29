package com.interviewprep.practicequestions;

import java.util.Stack;

class MyQueue {

	
	Stack<Integer> stack;
	Stack<Integer> tempStack;
	
    /** Initialize your data structure here. */
    public MyQueue() {
		stack = new Stack<Integer>();
		tempStack = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        
    	//stack.peek();
    	//stack.push(item);
    	//stack.isEmpty();
    	//stack.pop();
    	stack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int a = 0;
    	for(Integer stackEntry: stack){
    		tempStack.push(stackEntry);
    	}
    	a = tempStack.pop();
    	
    	
    	return a;
    }
    
    /** Get the front element. */
    public int peek() {
    	int returnData = -1;
    	for(Integer stackEntry: stack){
    		returnData = stackEntry;
    	}
    	return returnData;
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        
    	return stack.isEmpty();
    }
}
