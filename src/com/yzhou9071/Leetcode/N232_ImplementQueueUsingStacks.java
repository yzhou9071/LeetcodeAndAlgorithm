package com.yzhou9071.Leetcode;

import java.util.Stack;

public class N232_ImplementQueueUsingStacks {
	Stack<Integer> curStack = new Stack<Integer>();
	Stack<Integer> tmpStack = new Stack<Integer>();
	int peek = 0;
	
	// Push element x to the back of queue.
    public void push(int x) {
        if(curStack.empty())
        	peek = x;
        curStack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!curStack.empty())
        	tmpStack.push(curStack.pop());
        tmpStack.pop();
        if(!tmpStack.empty())
        	peek = tmpStack.peek();
        while(!tmpStack.empty())
        	curStack.push(tmpStack.pop());
    }

    // Get the front element.
    public int peek() {
        return peek;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(curStack.empty())
        	return true;
        return false;
    }
}
