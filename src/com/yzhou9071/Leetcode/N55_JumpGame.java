package com.yzhou9071.Leetcode;

public class N55_JumpGame {
	public boolean canJump(int[] nums) {
		if(nums.length <= 0)
        	return false;
        
        int maxDis = 0;
        int len = nums.length;
        for(int i=0;i<len && i<=maxDis;i++)
        	maxDis = nums[i]+i>maxDis?nums[i]+i:maxDis;
        
        if(maxDis >= len - 1)
        	return true;
        return false;
    }
}
