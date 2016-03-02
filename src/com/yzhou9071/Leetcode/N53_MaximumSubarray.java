package com.yzhou9071.Leetcode;

public class N53_MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int sum = nums[0];
		int maxNum = nums[0];
		
		for(int i=1;i<nums.length;i++){
			if(sum > 0)
				sum +=nums[i];
			else
				sum = nums[i];
			maxNum = Math.max(sum,maxNum);
		}
		
		return maxNum;
    }
}
