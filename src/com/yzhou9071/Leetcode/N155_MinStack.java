package com.yzhou9071.Leetcode;

import java.util.LinkedList;

public class N155_MinStack {
	int min = Integer.MAX_VALUE;
	LinkedList<Integer> head = new LinkedList<Integer>();
	
	public N155_MinStack() {
        
    
	}
    public void push(int x) {
        if(x <= min){
        	head.offerFirst(min);
        	min = x;
        }
        head.offerFirst(x);
    }
    
    public void pop() {
        int x = head.removeFirst();
        if(x == min){
        	min = head.removeFirst();
        }
    }
    
    public int top() {
        return head.peekFirst();
    }
    
    public int getMin() {
        return min;
    }
}
