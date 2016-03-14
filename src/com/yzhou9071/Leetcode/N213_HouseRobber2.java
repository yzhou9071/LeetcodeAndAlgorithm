package com.yzhou9071.Leetcode;

public class N213_HouseRobber2 {
	public int rob(int[] nums) {
        int len = nums.length;
        if(len <= 0)
        	return 0;
        else if(len == 1)
        	return nums[0];
        else
        	return Math.max(robber(nums,0,nums.length-1),
        			robber(nums,1,nums.length));
    }
	private int robber(int[] nums, 
			int startPos, int endPos){
		int oddSum = 0, evenSum = 0;
		for(int i=startPos;i<endPos;i++){
			if(i % 2 == 0)
				evenSum = Math.max(oddSum, evenSum+nums[i]);
			else
				oddSum = Math.max(evenSum, oddSum+nums[i]);
		}
		return Math.max(evenSum, oddSum);
	}
}
