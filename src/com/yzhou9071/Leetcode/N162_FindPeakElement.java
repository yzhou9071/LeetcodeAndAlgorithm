package com.yzhou9071.Leetcode;

public class N162_FindPeakElement {
	public int findPeakElement(int[] nums) {
        if(nums.length <= 0)
        	return 0;
        for(int i=1;i<nums.length;i++){
        	if(nums[i]<nums[i-1])
        		return i-1;
        }
        return nums.length-1;
    }
}
