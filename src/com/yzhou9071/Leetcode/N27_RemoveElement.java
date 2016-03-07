package com.yzhou9071.Leetcode;

public class N27_RemoveElement {
	public int removeElement(int[] nums, int val) {
		if(nums.length <= 0)
        	return 0;
        
        int low = 0;
        
        for(int i=0;i<nums.length;i++){
        	if(nums[i] != val)
        		nums[low++] = nums[i];
        }
        
        return low;
    }
}
