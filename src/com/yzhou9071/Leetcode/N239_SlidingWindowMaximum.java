package com.yzhou9071.Leetcode;

import java.util.LinkedList;

public class N239_SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length <= 0 || k > nums.length)
        	return nums;
        
        int len = nums.length;
        int[] ret = new int[len-k+1];
        LinkedList<Integer> memList = new LinkedList<Integer>();
        
        for(int i=0;i<k;i++){
        	while(!memList.isEmpty() && nums[memList.getLast()]<nums[i])
        		memList.removeLast();
        	memList.add(i);
        }
        ret[0] = nums[memList.getFirst()];
        
        for(int i=1;i<=len-k;i++){
        	while(!memList.isEmpty() && nums[memList.getLast()]<nums[i+k-1])
        		memList.removeLast();
        	if(!memList.isEmpty() && nums[memList.getFirst()] == nums[i-1])
        		memList.removeFirst();
        	memList.add(i+k-1);
        	ret[i] = nums[memList.getFirst()];
        }
        
        return ret;
    }
    public static void main(String[] argc){
    	int[] nums = {1,3,-1,-3,5,3,6,7};
    	int[] ret = maxSlidingWindow(nums,3);
    	for(int tmp:ret)
    		System.out.println(tmp);
    }
}
